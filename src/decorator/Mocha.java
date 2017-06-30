package decorator;

/**
 * Created by lenovo on 2017/6/30.
 * 摩卡
 */
public class Mocha extends CondimentDecorator {
    Berverage berverage;

    public Mocha(Berverage berverage) {
        this.berverage = berverage;
    }

    @Override
    public String getDesciption() {
        return berverage.getDesciption()+",Mocha";
    }

    @Override
    public double cost() {
        return berverage.cost()+.10+0.05*berverage.getSize();
    }

    @Override
    public int getSize() {
        return 0;
    }
}
