package AbstractFactory;

/**
 * Created by lenovo on 2017/6/28.
 */
public class Main {
    public static void main(String[] args){
        new MailFactory().produce().send("design pattern");
    }
}
