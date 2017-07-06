package vistor;

/**
 * Created by lenovo on 2017/7/6.
 */
public class VisitorB implements Visitor{
    @Override
    public void visit(VisitableA visitableA) {
        System.out.println( visitableA.getName());
    }

    @Override
    public void visit(VisitableB visitableB) {
        System.out.println( visitableB.getName());
    }
}
