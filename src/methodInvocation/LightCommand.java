package methodInvocation;

/**
 * Created by lenovo on 2017/6/29.
 */
public class LightCommand implements Command {
    Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
            light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
