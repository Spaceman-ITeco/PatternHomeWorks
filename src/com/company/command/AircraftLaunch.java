package com.company.command;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class AircraftLaunch {
    public static void main(String[] args) {
//        Timer timer = new Timer();
//        TimerTask timerTask = new TimerTask() {
//            @Override
//            public void run() {
//                for (int i=1;i<5;i++)
//                {System.out.println("Task: " + i);}
//            }
//        };
//        timer.schedule(timerTask, new Date());

        CommandPool commandPool = new CommandPool();
        commandPool.addCommand(new RaisingFlaps(5,10));
        commandPool.addCommand(new StartEngine(6,7));
        commandPool.start();
        CommandExecutor executor = new CommandExecutor(new RaisingFlaps(1,10));
        executor.start();
    }
}
