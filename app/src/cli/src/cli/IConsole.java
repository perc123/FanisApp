package cli;

import commandPattern.ICommand;


public interface IConsole {
    void run();
    void setCommand(ICommand command);
}
