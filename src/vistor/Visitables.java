package vistor;

import java.util.ArrayList;

/**
 * Created by lenovo on 2017/7/6.
 */
public class Visitables {
    ArrayList<Visitable> mList;

    public Visitables() {
        this.mList =new ArrayList<>();
    }
    public void add(Visitable v){
        mList.add(v);
    }
    public void accept(Visitor visitor){
        for (Visitable able :
                mList) {
            able.accept(visitor);
        }
    }


}
