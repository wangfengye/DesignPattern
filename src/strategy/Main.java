package strategy;

/**
 * Created by lenovo on 2017/7/5.
 */
public class Main {
    public static void main(String[] args){
        Duck model =new ModelDuck();
        Duck simple= new SimpleDuck();
        model.display();
        model.fly();
        simple.display();
        simple.fly();
    }
}
