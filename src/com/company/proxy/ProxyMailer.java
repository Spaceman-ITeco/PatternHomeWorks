package com.company.proxy;

public class ProxyMailer implements MailSender{
    private MailSender mailSender;

    @Override
    public boolean send(String subject, String body, String email) {
        if(mailSender == null) {
            mailSender= new Mailer();
        }

        extraMethod();
        return mailSender.send(subject,body,email);
    }
    private void extraMethod() {
        System.out.println("proxy complete.");
    }
}
