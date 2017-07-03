package adapter;

/**
 * Created by lenovo on 2017/7/3.
 */
public class Main {
    public static void main(String[] args){
        testTurkey(new WildTurkey());
        Duck duck = new MallardDuck();
        testTurkey(new DuckAdapter(duck));

    }
    private static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.hop();

    }
}
