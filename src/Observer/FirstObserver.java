package Observer;

/**
 * Created by lenovo on 2017/6/30.
 */
public class FirstObserver implements Observer{

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.print("first: " +temp);
    }
}
