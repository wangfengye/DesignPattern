package handler;

/**
 * @author maple on 2019/9/10 10:53.
 * @version v1.0
 * @see 1040441325@qq.com
 */
public final class Looper {
    private static final ThreadLocal<Looper> sLooper = new ThreadLocal<>();
     MessageQueue mQueue;

    public Looper() {
        mQueue = new MessageQueue();
    }

    public static void prepare() {//初始化
        if (sLooper.get() != null) {
            throw new RuntimeException("has Init");
        }
        sLooper.set(new Looper());
        System.out.println(Thread.currentThread().getName() + " looper init");
    }
    public static Looper myLooper(){
        return  sLooper.get();
    }

    public static void loop() {//轮询读消息
        System.out.println(Thread.currentThread().getName() + " looper looping");
        Looper looper = sLooper.get();
        if (looper == null) throw new RuntimeException("need prepare first");
        for (; ; ) {
            Message message = looper.mQueue.next();
            if (message == null) {
                System.out.println(Thread.currentThread().getName() + " looper destroyed");
                return;
            }
            message.target.dispatchMessage(message);
        }
    }
}
