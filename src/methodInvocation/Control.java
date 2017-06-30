package methodInvocation;

/**
 * Created by lenovo on 2017/6/29.
 */
public class Control {
    private Command[] commands;
    private Command undoCommand;

    public Control() {
        this.commands = new Command[2];
    }

    public void setCommand(Command command, int i) {
        commands[i] = command;
    }

    public void buttonWasPressed(int i) {
        commands[i].execute();
        undoCommand = commands[i];
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }
}
