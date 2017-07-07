package proxy;

/**
 * Created by lenovo on 2017/7/7.
 * 静态代理
 */
public class ProxyDemo {
    public static void main(String[] args){
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        proxySubject.request();
    }

}
interface Subject{
    void request();
}
class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("似水流年 ---from real");
    }
}
class ProxySubject implements Subject{
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.print("代理转发:");
        subject.request();

    }
}

