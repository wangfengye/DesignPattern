package vistor;

/**
 * Created by lenovo on 2017/7/6.
 * 利用重载 使得访问者可单独为被访问对象执行自己需要的方法
 */
public interface Visitor {
    void visit(VisitableA visitableA);
    void visit(VisitableB visitableB);
}
