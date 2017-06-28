package singleton;

/**
 * Created by lenovo on 2017/6/28.
 * 单例模式
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton(){}

    /**
     * 存在问题 初始化分两步,1:分配空间;2:初始化实例
     * 1.A,B同时进入第一个判断;通过B
     * 2.A获取锁 ,分配空间,离开同步块
     * 3.B获取锁,此时 instance不为空,但尚未初始化(ps:jvm 指令排序优化,导致B获取代码块在A初始化之前)
     * jdk1.5之后 增加volatile关键字,禁止指令排序优化,保证分配空间的对象已被初始化;
     * @return
     */
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (instance){
                if (instance ==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
