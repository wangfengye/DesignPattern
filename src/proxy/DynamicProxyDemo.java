package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lenovo on 2017/7/7.
 * 动态代理
 */
public class DynamicProxyDemo {
    public static void main(String args[]){
        Real real = new Real();
        ProxyHandler handler = new ProxyHandler(real);
        DynamicSubject proxy = (DynamicSubject) Proxy.newProxyInstance(Real.class.getClassLoader(),Real.class.getInterfaces(),handler);
        proxy.request();
    }

}
interface DynamicSubject{
    void request();
}
class Real implements DynamicSubject{
    @Override
    public void request() {
        System.out.println("时光偷走了流年 ---from real");
    }
}
class ProxyHandler implements InvocationHandler{
    private DynamicSubject subject;

    public ProxyHandler(DynamicSubject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Proxy===before=======");
        Object result =method.invoke(subject,args);
        System.out.println("========after========");

        return result;
    }
}


