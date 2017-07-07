package mediator;

/**
 * Created by lenovo on 2017/7/7.
 */
public class Mediator extends IMediator{

    @Override
    public void operation(String message) {
        for (IColleague c:
             colleagues) {
            c.getMessage(message);
        }
    }
}
