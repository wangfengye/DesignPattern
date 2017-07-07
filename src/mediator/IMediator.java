package mediator;

import java.util.ArrayList;

/**
 * Created by lenovo on 2017/7/7.
 */
public abstract class IMediator {
    protected ArrayList<IColleague> colleagues;

    public IMediator() {
        this.colleagues = new ArrayList<>();
    }

    public abstract void operation(String message);
    public void register(IColleague conlleague){
        colleagues.add(conlleague);
        conlleague.setMediator(this);//注册同时自己获取中介者的引用
    }


}
