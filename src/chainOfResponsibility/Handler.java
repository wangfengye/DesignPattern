package chainOfResponsibility;

/**
 * Created by lenovo on 2017/7/5.
 */
public abstract class Handler {
    Handler handler;

    abstract void handleRequest(int money);

    public void handlerNext(int money) {
        if (handler != null) handler.handleRequest(money);
        else {
            System.out.println("无人处理");
        }
    }

    public Handler nextHandler(Handler handler) {
        this.handler = handler;
        return handler;
    }
}
