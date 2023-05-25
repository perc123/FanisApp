package cli;


import commandPattern.ICommand;

import java.util.Scanner;

public class Console implements IConsole{
    private ICommand command;
    private Scanner scanner;

    public Console() {
        this.command = null;
        this.scanner = new Scanner(System.in);
    }
    @Override
    public void run() {
        System.out.println("Welcome to the CD collection!\t\t\tby Fanis Gioles");

        while (true) {
            System.out.println("Available commands:");
            System.out.println("- insert");
            System.out.println("- show list size");
            System.out.println("- edit");
            System.out.println("- remove");
            System.out.println("- help");
            System.out.println("- clear list");
            System.out.println("- sort list");
            System.out.println("- exit");

            System.out.print("Enter a command: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }
            command.execute();
        }
        scanner.close();
    }

    @Override
    public void setCommand(ICommand command) {

    }

}
