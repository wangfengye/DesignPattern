package handler;

/**
 * @author maple on 2019/9/10 11:03.
 * @version v1.0
 * @see 1040441325@qq.com
 */
public abstract class Handler {
    private MessageQueue messageQueue;

    public Handler() {
        messageQueue = Looper.myLooper().mQueue;
    }

    public abstract void dispatchMessage(Message message);

    public void sendMessageDelayed(Message message, long delay) {
        message.target = this;
        message.when = System.currentTimeMillis() + delay;
        messageQueue.enqueueMessage(message);

    }
}
