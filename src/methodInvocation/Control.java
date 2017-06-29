package methodInvocation;

/**
 * Created by lenovo on 2017/6/29.
 */
public class Control {
    Command slot;
    public void setCommand(Command command){
        slot =command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
