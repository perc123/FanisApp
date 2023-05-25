package commandPattern;


public class CommandImpl implements ICommand {
    public enum Operator {INSERT, SHOW_LIST_SIZE, EDIT, REMOVE, HELP, EXIT, CLEAR_LIST, SORT_LIST}

    private Operator operator;

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
                break;
            case SHOW_LIST_SIZE:
                System.out.println("Executing SHOW LIST SIZE operation...");
                // Add your implementation for the SHOW LIST SIZE operation here
                break;
            case EDIT:
                System.out.println("Executing EDIT operation...");
                // Add your implementation for the EDIT operation here
                break;
            case REMOVE:
                System.out.println("Executing REMOVE operation...");
                // Add your implementation for the REMOVE operation here
                break;
            case HELP:
                System.out.println("Executing HELP operation...");
                // Add your implementation for the HELP operation here
                break;
            case CLEAR_LIST:
                System.out.println("Executing CLEAR LIST operation...");
                // Add your implementation for the CLEAR LIST operation here
                break;
            case SORT_LIST:
                System.out.println("Executing SORT LIST operation...");
                // Add your implementation for the SORT LIST operation here
                break;
            default:
                System.out.println("Unknown command!");
                break;
        }
    }
}

