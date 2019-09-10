package handler;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author maple on 2019/9/10 10:59.
 * @version v1.0
 * @see 1040441325@qq.com
 */
public class MessageQueue {
    private Message mQueue = null;
    private ReentrantLock lock = new ReentrantLock();
    private Condition empty = lock.newCondition();

    public Message next() {
        lock.lock();
        if (mQueue==null) {
            try {
                empty.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (mQueue.when>System.currentTimeMillis()){
            try {
                empty.await(mQueue.when-System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Message msg = mQueue;
        mQueue =mQueue.next;
        lock.unlock();
        return msg;
    }

    public void enqueueMessage(Message message) {
        lock.lock();
        empty.signalAll();
        if (mQueue == null) {
            mQueue = message;
        } else {
            Message cur = mQueue;
            while (cur.next != null && message.when > cur.next.when) {
                cur = cur.next;
            }
            Message preNext = cur.next;
            cur.next = message;
            message.next = preNext;
        }
        lock.unlock();
    }
}
