package thread;

import javafx.concurrent.Worker;
import sun.nio.ch.ThreadPool;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author maple on 2019/1/9 11:57.
 * @version v1.0
 * @see 1040441325@qq.com
 * futureTask 使用: 其提供了便捷的异步任务操作
 * 1. 获取异步任务返回值
 * 2. 监听异步任务执行完成
 * 3. 取消异步任务.
 */
public class Main {
    public static void main(String[] args) {
        log("核心数: " + Runtime.getRuntime().availableProcessors());
        testCallable_Future();
        testFutureTask();

    }

    private static void testFutureTask() {
        ExecutorService executors = Executors.newCachedThreadPool();
        FutureTask<String> futureTask = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000);
                log("----futureTask running");
                return "a finished";
            }
        });

        executors.execute(futureTask);
        log("start");
        try {

            log(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    /**
     * callable _future 获取异步返回
     */
    private static void testCallable_Future() {
        ExecutorService pool = Executors.newCachedThreadPool();
        Future<String> aF = pool.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                log("running");
                Thread.sleep(2000);
                return "a finished";
            }
        });
        try {
            log(aF.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    public static void log(String data) {
        System.out.println(dateFormat.format(System.currentTimeMillis()) + "---" + Thread.currentThread().getName() + "--" + data);
    }
}
