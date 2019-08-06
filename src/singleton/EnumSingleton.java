package singleton;

/**
 * @author maple on 2019/8/6 18:09.
 * @version v1.0
 * @see 1040441325@qq.com
 * 枚举单例
 */
public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {
        System.out.println("init");
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public void action() {
        System.out.println("action");
    }

    public static void main(String[] args) {
        EnumSingleton.getInstance().action();
        EnumSingleton.getInstance().action();
    }
}
