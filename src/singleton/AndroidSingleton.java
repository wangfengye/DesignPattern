package singleton;

/**
 * @author maple on 2019/8/11 14:45.
 * @version v1.0
 * @see 1040441325@qq.com
 * android 源码中的单例.
 */
public abstract class AndroidSingleton<T> {
    private T mInstance;
    abstract T create();
    public T get(){
        synchronized (this){
            if (mInstance==null)mInstance=create();
            return mInstance;
        }
    }

}
