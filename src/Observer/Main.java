package Observer;

/**
 * Created by lenovo on 2017/7/3.
 */
public class Main {
    public static void main(String[] args){
        WeatherData sub =new WeatherData();
        sub.registerObserver(new FirstObserver());
        sub.registerObserver(new SecondObserver());
        sub.setMesage(80,70,1);
    }

}
