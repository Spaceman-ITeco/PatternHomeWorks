package com.company.proxy;

public class ProxyMailer implements MailSender{
    private MailSender mailSender;

    public String getProxyEmail() {
        return email;
    }

    private String email = "proxy@tester.ru";

    @Override
    public boolean send(String subject, String body, String email) {
        if(mailSender == null) {
            mailSender= new Mailer();
        }

        extraMethod();
        return mailSender.send(subject,body,getProxyEmail());
    }
    private void extraMethod() {
        System.out.println("proxy complete.");
    }
}
