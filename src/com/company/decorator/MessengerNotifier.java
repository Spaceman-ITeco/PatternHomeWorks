package com.company.decorator;

public final class MessengerNotifier implements Notifier{
    private String phone;
    private String text;

    public MessengerNotifier(String phone, String text) {
    this.text=text;
    this.phone=phone;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean NotifySubscriber() {
        return true;
    }
}
