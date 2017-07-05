package strategy;

/**
 * Created by lenovo on 2017/7/5.
 */
public class SimpleDuck extends Duck {
    public SimpleDuck() {
        this.flyBehaviour=new Fly();
    }

    @Override
    void display() {
        System.out.println(SimpleDuck.class.getName());
    }


}
