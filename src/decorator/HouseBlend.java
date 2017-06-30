package decorator;

/**
 * Created by lenovo on 2017/6/30.
 * 星巴克咖啡
 */
public class HouseBlend extends Berverage{
    @Override
    public String getDesciption() {
        desciption ="HouseBlend";
        return desciption;
    }

    @Override
    public double cost() {
        return .89;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
