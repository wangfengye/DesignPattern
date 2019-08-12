package prototype;

import java.util.ArrayList;

/**
 * Created by lenovo on 2017/7/5.
 */
public class Man implements Cloneable {
    private int no;
    private ArrayList<Integer> nos;

    public Man(int no) {
        this.no = no;
        this.nos = new ArrayList<>();
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void addNO(int i) {
        nos.add(i);
    }

    public Man clone() {
        Man man = null;
        try {
            man = (Man) super.clone();
            man.nos = (ArrayList) nos.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return man;
    }

    @Override
    public String toString() {
        return "Man{" +
                "no=" + no +
                ", nos=" + nos +
                '}';
    }
}
