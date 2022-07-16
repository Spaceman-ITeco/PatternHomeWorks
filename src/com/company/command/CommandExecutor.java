package com.company.command;

public class CommandExecutor extends Thread {
    private AircraftCommand command;

    public CommandExecutor(AircraftCommand command)
    {this.command=command;}

    public void run() {

        {
            try {
                sleep(1000L *command.getSeconds());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
