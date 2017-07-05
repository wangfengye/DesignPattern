package chainOfResponsibility;

/**
 * Created by lenovo on 2017/7/5.
 */
public abstract class Handler {
     Handler handler;
    abstract void handleRequest(int money);
    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
