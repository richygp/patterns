package net.i2cat.structural.proxy.test;

import net.i2cat.structural.proxy.CommandExecutor;
import net.i2cat.structural.proxy.CommandExecutorProxy;

public class ProxyPatternTest {
    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
        try {
            commandExecutor.runCommand("ls -ltr");
            commandExecutor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message:: " + e.getMessage());
        }
    }
}
