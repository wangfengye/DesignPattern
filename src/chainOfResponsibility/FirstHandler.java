package chainOfResponsibility;

/**
 * Created by lenovo on 2017/7/5.
 */
public class FirstHandler extends Handler {
    @Override
    void handleRequest(int money) {
        if (money < 30) {
            //处理
            System.out.println("[NO.1处理]:通过");
        } else {
            handlerNext(money);
        }
    }
}
