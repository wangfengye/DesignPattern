package decorator;

/**
 * Created by lenovo on 2017/6/30.
 */
public abstract class Berverage {
    String desciption = null;

    public abstract String getDesciption();

    public abstract double cost();

    public abstract int getSize();
}