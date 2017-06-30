package decorator;

/**
 * Created by lenovo on 2017/6/30.
 * 浓咖啡
 */
public class Espresso extends Berverage{
    private int type;//0,1,2分别代表小中大杯

    public Espresso(int type) {
        this.type = type;
    }

    @Override
    public String getDesciption() {
        desciption ="Esprsso";
        return desciption+"_"+getSize();
    }

    @Override
    public double cost() {
        return 1.99;
    }
    @Override
    public int getSize(){
        return type;
    }
}
