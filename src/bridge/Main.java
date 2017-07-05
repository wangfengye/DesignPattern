package bridge;

/**
 * Created by lenovo on 2017/7/5.
 */
public class Main {
    public static void main(String[] args){
        Engine engine =new Engine2000();
        Car car=new Bus(engine);
        car.install();
    }
}
interface Engine{
    void install();
}
class Engine2000 implements Engine{
    public Engine2000() {
    }

    @Override
    public void install() {
        System.out.println(" 安装Engine2000");
    }
}
abstract class Car{
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    abstract void install();
}
class Bus extends Car{
    public Bus(Engine engine) {
        super(engine);
    }

    @Override
    void install() {
        System.out.print("Bus:");
        getEngine().install();
    }
}
