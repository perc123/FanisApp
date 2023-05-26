package commandPattern;


import items.Disk;
import verwaltung.Listable;

public class CommandImpl implements ICommand {
    public enum Operator {INSERT, SHOW_LIST_SIZE, EDIT, REMOVE, HELP, EXIT, CLEAR_LIST, SORT_LIST}

    private Operator operator;
    private Listable listable;
    private Disk item;

    public CommandImpl(String text) {
        this.operator = getOperatorFromText(text);
    }

    private Operator getOperatorFromText(String text) {
        switch (text.toLowerCase()) {
            case "insert":
                return Operator.INSERT;
            case "show list size":
                return Operator.SHOW_LIST_SIZE;
            case "edit":
                return Operator.EDIT;
            case "remove":
                return Operator.REMOVE;
            case "help":
                return Operator.HELP;
            case "exit":
                return Operator.EXIT;
            case "clear list":
                return Operator.CLEAR_LIST;
            case "sort list":
                return Operator.SORT_LIST;
            default:
                throw new IllegalArgumentException("Invalid command: " + text);
        }
    }

    @Override
    public void execute() {
        switch (operator) {
            case INSERT:
                System.out.println("Executing INSERT operation...");
                // Add your implementation for the INSERT operation here
                listable.add(item);
                break;
            case SHOW_LIST_SIZE:
                System.out.println("Executing SHOW LIST SIZE operation...");
                // Add your implementation for the SHOW LIST SIZE operation here
                listable.printAll();
                break;
            case EDIT:
                System.out.println("Executing EDIT operation...");
                listable.edit(item);
                break;
            case REMOVE:
                System.out.println("Executing REMOVE operation...");
                listable.delete(item);
                break;
            case HELP:
                System.out.println("Executing HELP operation...");
                System.out.println("Please write the command you want to run.");
                break;
            case CLEAR_LIST:
                System.out.println("Executing CLEAR LIST operation...");
                listable.clear();
                break;
            case SORT_LIST:
                System.out.println("Executing SORT LIST operation...");
                //implement
                break;
            default:
                System.out.println("Unknown command!");
                break;
        }
    }
}

