package factory;

import java.util.ArrayList;

/**
 * Created by lenovo on 2017/6/28.
 */
public class MailSender implements Sender{

    @Override
    public void send(String message) {
        System.out.print("mail: "+message);
    }
}
