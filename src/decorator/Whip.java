package decorator;

/**
 * Created by lenovo on 2017/6/30.
 * 奶油
 */
public class Whip extends CondimentDecorator{
    Berverage berverage;

    public Whip(Berverage berverage) {
        this.berverage = berverage;
    }
    @Override
    public String getDesciption() {
        return berverage.getDesciption()+",Whip";
    }

    @Override
    public double cost() {
        return berverage.cost()+.10;
    }

    @Override
    public int getSize() {
        return 0;
    }
}


