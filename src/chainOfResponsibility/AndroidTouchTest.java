package chainOfResponsibility;

/**
 * @author maple on 2019/8/11 12:26.
 * @version v1.0
 * @see 1040441325@qq.com
 * 模拟android ViewGroup调用 dispatchTouchEvent.
 */
public class AndroidTouchTest {
    public static void main(String[] args){
            new B().dispatch();
    }
    static  class  A{
        boolean dispatch(){
            System.out.println("A:dispatch");
            onTouch();
            return true;
        }
        boolean onTouch(){
            System.out.println("A:onTouch");
            return true;
        }
    }
    static class B extends A{
        boolean dispatch(){
            System.out.println("B:dispatch");
            super.dispatch();
            return true;
        }
        boolean onTouch(){
            System.out.println("B:onTouch");
            return true;
        }
    }
}
