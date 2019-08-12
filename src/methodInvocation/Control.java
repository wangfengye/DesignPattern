package methodInvocation;

/**
 * Created by lenovo on 2017/6/29.
 */
public class Control {
    private Command command;
    private Command undoCommand;

    public Control(Command command) {
        this.command = command;
    }

    public void action() {
       command.execute();
        undoCommand = command;
    }

    public void back() {
        undoCommand.undo();
    }
}
