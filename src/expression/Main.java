package expression;

/**
 * Created by lenovo on 2017/7/7.
 */
public class Main {
    public static void main(String[] args){
        String in="2 * 3 * 6";
        Calculator calculator =new Calculator();
        calculator.build(in);
        System.out.println(calculator.compute());
    }
}
