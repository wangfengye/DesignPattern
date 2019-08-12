package chainOfResponsibility;

/**
 * Created by lenovo on 2017/7/5.
 */
public class Main {
    public static void main(String[] args) {
        Handler headHandler = new FirstHandler();

        headHandler.nextHandler(new SecondHandler())
                .nextHandler(new ThirHandler());
        headHandler.handleRequest(20);
        headHandler.handleRequest(50);
        headHandler.handleRequest(200);
        headHandler.handleRequest(500);

    }

}
