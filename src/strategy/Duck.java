package strategy;

/**
 * Created by lenovo on 2017/7/5.
 */
public abstract class Duck {
    FlyBehaviour flyBehaviour;
    abstract void display();
    void fly(){
        flyBehaviour.fly();
    };
}
