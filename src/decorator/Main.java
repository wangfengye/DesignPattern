package decorator;

/**
 * Created by lenovo on 2017/6/30.
 */
public class Main {
    public static void main(String[] args){
        Berverage berverage = new Espresso(0);
        berverage =new Mocha(berverage);
        berverage=new Soy(berverage);
        berverage=new Whip(berverage);
        System.out.println(berverage.getDesciption()+": "+berverage.cost());
    }
}
