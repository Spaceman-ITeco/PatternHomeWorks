package com.company.proxy;

public class ProxyPSVM {
    public static void main(String[] args) {
MailSender mailSender = new ProxyMailer();
mailSender.send("Test","Now we try to send to proxy","tester@tester.com");
    }
}
