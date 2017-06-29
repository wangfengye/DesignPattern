package methodInvocation;

/**
 * Created by lenovo on 2017/6/29.
 */
public class Main {
    public static void main(String[] args){
        Control control = new Control();
        Light light = new Light();
        LightCommand command = new LightCommand(light);
        control.setCommand(command);
        control.buttonWasPressed();

        Command command1 = new MusicCommand(new Music());
        control.setCommand(command1);
        control.buttonWasPressed();
    }
}
