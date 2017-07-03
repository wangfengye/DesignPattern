package adapter;

/**
 * Created by lenovo on 2017/7/3.
 */
public class MallardDuck implements Duck {
    private final static String TAG =MallardDuck.class.getSimpleName();
    @Override
    public void quack() {
        System.out.println(TAG+ " 人生若只如初见,何时秋风悲画扇");
    }

    @Override
    public void fly() {
        System.out.println(TAG+" 等闲变却故人心,却道故心人易变");
    }
}
