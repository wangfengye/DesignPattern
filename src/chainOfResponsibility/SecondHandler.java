package chainOfResponsibility;

/**
 * Created by lenovo on 2017/7/5.
 */
public class SecondHandler extends Handler {
    @Override
    void handleRequest(int money) {
        //处理
        if (money < 100) System.out.println("[NO.2处理]:通过");
        else {
            handlerNext(money);
        }
    }
}
