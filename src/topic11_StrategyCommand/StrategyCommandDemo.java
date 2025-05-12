package topic11_StrategyCommand;

import java.util.Scanner;

public class StrategyCommandDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите одну из комманд start, pause, stop: ");
        String command = scanner.nextLine();
        CommandProcessor.getCommandByKey(command).execute();

    }
}
