package vistor;

/**
 * Created by lenovo on 2017/7/6.
 */
public class VisitableB implements Visitable {
    private String  name;
    private int age;

    public VisitableB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
