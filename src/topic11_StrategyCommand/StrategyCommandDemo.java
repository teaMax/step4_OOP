package topic11_StrategyCommand;

import java.util.Scanner;

public class StrategyCommandDemo {
    public static void main(String[] args) {
        String command = CommandProcessor.getCommandFromScanner();
        CommandProcessor.getCommandByKey(command).execute();
    }
}
