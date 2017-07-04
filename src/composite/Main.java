package composite;

/**
 * Created by lenovo on 2017/7/4.
 */
public class Main {
    public static void main(String[] args) {
        Menu menu1 = new Menu("1.1");
        Menu menu2 = new Menu("1.2");
        Menu menu = new Menu("1");
        menu.add(menu1);
        menu.add(menu2);
        menu.print();

    }
}
