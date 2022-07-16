package com.company.command;

public class CommandExecutor {
    public static void main(String[] args) {
        CommandPool commandPool = new CommandPool();
        commandPool.addCommand(new RaisingFlaps(5,10));
        commandPool.addCommand(new StartEngine(6,7));
        commandPool.start();
    }
}
