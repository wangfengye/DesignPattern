package vistor;

/**
 * Created by lenovo on 2017/7/6.
 */
public class Main {
    public static void main(String[] args){
        //不同访问者访问统一对象 ,获取结果不同
        Visitor v1= new VisitorA();
        Visitor v2= new VisitorB();
        Visitables ables =new Visitables();
        ables.add(new VisitableA("maple",10));
        ables.add(new VisitableB("apple",20));
       ables.accept(v1);
       ables.accept(v2);
    }
}
