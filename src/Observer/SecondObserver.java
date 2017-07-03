package Observer;

/**
 * Created by lenovo on 2017/7/3.
 */
public class SecondObserver implements Observer{
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.print("second: "+humidity);
    }
}
