package chainOfResponsibility;

/**
 * Created by lenovo on 2017/7/5.
 */
public class Main {
    public static void main(String[] args){
        Handler h1=new FirstHandler();
        Handler h2=new SecondHandler();
        h1.setHandler(h2);
        h1.handleRequest(20);
        h1.handleRequest(50);
        h1.handleRequest(500);

    }

}
