package methodInvocation;

/**
 * Created by lenovo on 2017/6/29.
 */
public class Main {
    public static void main(String[] args){
   Control control = new Control(new LightCommand(new Light()));
   control.action();
   control.back();

    }
}
