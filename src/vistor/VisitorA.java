package vistor;

/**
 * Created by lenovo on 2017/7/6.
 */
public class VisitorA implements Visitor {
    @Override
    public void visit(VisitableA visitableA) {
       System.out.println( visitableA.getAge());
    }

    @Override
    public void visit(VisitableB visitableB) {
        System.out.println( visitableB.getAge());
    }
}
