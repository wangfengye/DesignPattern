package AbstractFactory;

/**
 * Created by lenovo on 2017/6/28.
 */
public class MailFactory implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
