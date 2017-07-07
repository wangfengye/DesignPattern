package mediator;

/**
 * Created by lenovo on 2017/7/7.
 */
public abstract class IColleague {
    protected IMediator mediator;

    public IColleague() {
    }
    public void setMediator(IMediator mediator){
        this.mediator =mediator;
    }
    //自身方法
    public void sendMessage(String message){
        if (mediator==null){
            System.out.println("尚未注册");
            return;
        }
        mediator.operation(message);
    }
    //与中介者通信
    public abstract void getMessage(String message);
}
