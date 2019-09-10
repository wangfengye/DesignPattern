package handler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @author maple on 2019/9/10 11:06.
 * @version v1.0
 * @see 1040441325@qq.com
 * JAVA层实现Handler机制,通过 ReentrantLock +condition.阻塞线程.消息队列链表存储.
 * 源码中是在Cpp中实现的.暂未查看.
 */
public class Main {
    public static void main(String[] args) {
        Looper.prepare();
        Handler handler = new Handler() {
            @Override
            public void dispatchMessage(Message message) {//模拟android:发送onCreate.
                onCreate();
            }
        };
        handler.sendMessageDelayed(new Message("a"), 1);
        Looper.loop();
    }

    public static DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private static void onCreate() {
        Handler handler = new Handler() {
            @Override
            public void dispatchMessage(Message message) {

                System.out.println(dateFormat.format(System.currentTimeMillis()) + "---" + Thread.currentThread().getName() + "--" + message.message);
            }
        };
        new Thread(new Runnable() {
            @Override
            public void run() {
                handler.sendMessageDelayed(new Message("a"), 0);//0
                try {
                    Thread.sleep(1000);
                    handler.sendMessageDelayed(new Message("b"), 3000);//4
                    handler.sendMessageDelayed(new Message("c"), 2000);//3
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                handler.sendMessageDelayed(new Message("A"), 2000);//2
                try {
                    Thread.sleep(2000);
                    handler.sendMessageDelayed(new Message("B"), 3000);//5
                    handler.sendMessageDelayed(new Message("C"), 2000);//4
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
}
