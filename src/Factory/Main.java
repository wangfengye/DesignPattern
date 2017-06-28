package Factory;

/**
 * Created by lenovo on 2017/6/28.
 */
public class Main {
    public static void main(String[] args){
        SendFactory.produce("mail").send("hello");
    }
}
