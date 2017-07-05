package strategy;

/**
 * Created by lenovo on 2017/7/5.
 */
public class ModelDuck extends Duck{
    public ModelDuck() {
        this.flyBehaviour=new FlyNoway();
    }

    @Override
    void display() {
        System.out.println(ModelDuck.class.getName());
    }


}
