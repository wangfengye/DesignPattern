package expression;

import sun.net.www.protocol.https.HttpsURLConnectionImpl;

import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by lenovo on 2017/7/7.
 */
public class Main {
    public static void main(String[] args){
        String in="2 * 3 * 6";
        Calculator calculator =new Calculator();
        calculator.build(in);
        System.out.println(calculator.compute());
        System.out.println("**************** PriorityBlockingQueue ****************");
        PriorityBlockingQueue<A> a = new PriorityBlockingQueue<>();
        a.put(new A(2));
        a.put(new A(3));
        a.put(new A(1));
        A b;
        while ((b=a.poll())!=null){
            System.out.println(b.toString());
        }
        System.out.println("**************** LinkedHashMap:参数为true,每次get将get值移至最后 ****************");
        LinkedHashMap<String,String> map= new LinkedHashMap<>(16,.75f,true);
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");

        for (Map.Entry<String, String> en :
                map.entrySet()) {
            System.out.println(en.getKey()+"---"+en.getValue());
        }
        System.out.println(map.get("2"));
        for (Map.Entry<String, String> en :
                map.entrySet()) {
            System.out.println(en.getKey()+"---"+en.getValue());
        }

    }
    static class A implements Comparable<A>{
        int i;

        @Override
        public String toString() {
            return "A{" +
                    "i=" + i +
                    '}';
        }

        public A(int i) {
            this.i = i;
        }

        @Override
        public int compareTo(A o) {
            return this.i-o.i;
        }
    }
}
