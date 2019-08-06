package sync;

/**
 * @author maple on 2019/1/3 11:46.
 * @version v1.0
 * @see 1040441325@qq.com
 */

import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 内置锁的可重入性:子类内置索方法调用父方法,线程是持有的一个对象锁,两个方法是使用同一个锁进入
 * synchronized 范围
 * 1. 代码块  锁对象
 * 2. 静态方法 锁类
 * 3. 普通方法 锁当前实例对象
 *
 * synchronized 优化
 * 无锁状态 虚拟机自动去除不可能存在共享资源竞争的锁
 * 偏向锁 同一线程再次请求锁,直接获取锁
 * 轻量级锁 适用于线程交替执行同步块的场景
 * 重量级锁 自旋锁优化,(线程持有锁耗时端的情况)线程没有真实挂起,而是执行空的循环(50~100次),再尝试获取锁,,
 *
 * CAS(compare and swap)一种多线程环境下实现同步的机制 : 读取 - 比较 - 修改
 * 原子性基础,处理器保证单核指令原子性,多核使用lock(锁定内存区域)保证指令的原子性;
 * CAS 操作包含参数: 内存位置,预期数值,新值
 * CAS 使用native(C++)实现 根据不同平台实现不同的指令
 * ABA问题,(即处理过程中,其他线程多次修改变量,最终修改结果不变,CAS操作无法感知)
 * 处理方式:对值操作添加版本号,
 *
 */
public class Main {

    // 对象锁

    public synchronized void test1() {

    }

    public void test2() {
        //对象锁(内置锁)
        synchronized (this) {

        }
    }

    //类锁
    public synchronized static void test3() {

    }

    public static void main(String[] args) {
        //testErr();
        testThread();
    }

    /**
     * 验证 try()catch()无法捕获其他线程的异常
     */
    private static void testErr() {
        Thread.setDefaultUncaughtExceptionHandler((t, e) ->
                System.out.println("线程:" + t.getName() + " 异常: " + e.getMessage()));
        try {
            new Thread(() -> {
                int a = 0;
                a = 5 / a;
            }, "child").start();
        } catch (Exception e) {
            System.out.println("线程:" + Thread.currentThread().getName() + " 异常: " + e.getMessage());
        }
    }

    private static void testThread(){
        Thread thread = new Thread(()->{System.out.println("线程:" + Thread.currentThread().getName());},"A");
        thread.run();
        thread.start();
    }
}
