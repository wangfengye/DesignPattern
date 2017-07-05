package prototype;

/**
 * Created by lenovo on 2017/7/5.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("------浅拷贝-----------");
        Person p1,p2,p3;
        p1=new Person("a",1);
        p1.addNumber(1);
        p1.addNumber(2);
        p2=p1.clone();
        p3=p1;
        p1.setAge(2);
        p1.addNumber(3);
        System.out.println("p1:"+p1.toString());
        System.out.println("p2:"+p2.toString());
        System.out.println("p3:"+p3.toString());
        System.out.println("------深拷贝-----------");
        Man m1,m2,m3;
        m1=new Man(1);
        m1.addNO(1);
        m1.addNO(2);
        m2=m1.clone();
        m3= m1;
        m1.setNo(2);
        m1.addNO(3);
        System.out.println("m1:"+m1.toString());
        System.out.println("m2:"+m2.toString());
        System.out.println("m3:"+m3.toString());
    }
}
