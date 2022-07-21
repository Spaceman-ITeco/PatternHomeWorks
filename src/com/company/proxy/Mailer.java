package com.company.proxy;

public class Mailer implements MailSender{
    protected String subject;
    protected String body;
    protected String email;

    public Mailer()
    {System.out.println("create Mailer"); }

    @Override
    public boolean send(String subject, String body, String email) {
        //sending email
        System.out.println("Email to " + email + "\n" + "theme " + subject + "\n" + body);
        return true;
    }
}
