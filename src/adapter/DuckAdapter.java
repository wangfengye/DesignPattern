package adapter;

/**
 * Created by lenovo on 2017/7/3.
 * duck 转 Turkey
 */
public class DuckAdapter implements Turkey {
    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void hop() {
        duck.fly();
    }
}
