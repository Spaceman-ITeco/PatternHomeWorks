package com.company.decorator;

public class SMSNotifier implements Notifier{

    private String text;

    public String getText() {
        if(text.length()<=160)
            return text;
        else
        return text.substring(0,159);
    }

    public SMSNotifier(MessengerNotifier notifier) {
        this.notifier = notifier;
        this.text = notifier.getText();
    }


    private MessengerNotifier notifier;

    @Override
    public boolean NotifySubscriber() {
        boolean result = notifier.NotifySubscriber();
        if(result)
        {return true;}
        String message = notifier.getText();
        return false;
    }
}
