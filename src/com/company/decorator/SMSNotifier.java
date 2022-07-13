package com.company.decorator;

public class SMSNotifier implements Notifier{

    private String text;

    public String getText() {
        if(text.length()<=150)
            return text;
        else
        return text.substring(0,149);
    }

    public SMSNotifier(MessengerNotifier notifier) {
        this.notifier = notifier;
        this.text = notifier.getText();
    }


    private MessengerNotifier notifier;

    @Override
    public boolean NotifySubscriber() {
        if(notifier !=null)
        return notifier.NotifySubscriber();
        else return true;
    }
}
