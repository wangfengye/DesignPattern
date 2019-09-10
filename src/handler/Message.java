package handler;

/**
 * @author maple on 2019/9/10 10:59.
 * @version v1.0
 * @see 1040441325@qq.com
 */
public class Message {
     Handler target;
     String message;
     long when;
     Message next;

    public Message(String message) {
        this.message = message;
    }
}
