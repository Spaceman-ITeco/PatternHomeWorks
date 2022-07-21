package com.company.proxy;

public interface MailSender {
    boolean send(String subject, String body, String email);
}
