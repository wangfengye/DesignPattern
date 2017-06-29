package factory;

/**
 * Created by lenovo on 2017/6/28.
 */
public class SendFactory {
    public static Sender produce(String type) {
        if ("mail".equals(type)) return new MailSender();
        if ("sms".equals(type)) return new SmsSender();
        System.out.print("该类型不存在");
        return null;
    }
}
