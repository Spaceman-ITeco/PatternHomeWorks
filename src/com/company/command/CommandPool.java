package com.company.command;

import java.util.ArrayList;

public class CommandPool extends Thread{
    private ArrayList<AircraftCommand> commands;

    public CommandPool()
    {this.commands=new ArrayList<>();}

    public void addCommand(AircraftCommand command){
        commands.add(command);
    }
    private boolean usedCommand(AircraftCommand command)
    {
        return true;
    }
    @Override
    public void run() {
        for (AircraftCommand command: commands)
        {
            try {
                Thread.sleep(10);
                if(commands.size()==0)
                    return;
                if (usedCommand(command))
                {commands.remove(commands.toArray().length-1);
                CommandExecutor executor=new CommandExecutor(command);}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
