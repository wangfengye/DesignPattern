package flyWeight;

/**
 * Created by lenovo on 2017/7/5.
 */
public class Main {
    public static void main(String[] args){
        FlyweightFactory factory =new FlyweightFactory();
        Flyweight a=factory.factory('a');
        Flyweight b=factory.factory('b');
        Flyweight c=factory.factory('a');
        a.operation("a");
        b.operation("b");
        c.operation("c");
    }
}
