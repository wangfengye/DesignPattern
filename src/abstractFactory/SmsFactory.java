package abstractFactory;

/**
 * Created by lenovo on 2017/6/28.
 */
public class SmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
