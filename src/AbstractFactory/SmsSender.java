package AbstractFactory;

/**
 * Created by lenovo on 2017/6/28.
 */
public class SmsSender implements Sender {
    @Override
    public void send(String message) {
        System.out.print("短信: "+message);
    }
}
