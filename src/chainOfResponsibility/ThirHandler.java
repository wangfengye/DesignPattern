package chainOfResponsibility;

/**
 * @author maple on 2019/8/9 16:00.
 * @version v1.0
 * @see 1040441325@qq.com
 */
public class ThirHandler extends Handler{
    @Override
    void handleRequest(int money) {
        if (money<500){
            System.out.println("[NO.3处理]:通过");
        }else {
            handlerNext(money);
        }
    }
}
