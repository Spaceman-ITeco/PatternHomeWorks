package com.company.decorator;

public class LaunchNotifier {
    public static void main(String[] args) {

        SMSNotifier smsNotifier = new SMSNotifier(new MessengerNotifier("+4953333322",
                "This is MessengerNotifier"));
        System.out.println(smsNotifier.getText());
       // System.out.println(smsNotifier.NotifySubscriber());

    }
}
