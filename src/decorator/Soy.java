package decorator;

/**
 * Created by lenovo on 2017/6/30.
 * 豆浆
 */
public class Soy extends CondimentDecorator {
    Berverage berverage;

    public Soy(Berverage berverage) {
        this.berverage = berverage;
    }
    @Override
    public String getDesciption() {
        return berverage.getDesciption()+",Soy";
    }

    @Override
    public double cost() {
        return berverage.cost()+.15;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
