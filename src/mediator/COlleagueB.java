package mediator;

/**
 * Created by lenovo on 2017/7/7.
 */
public class ColleagueB extends IColleague {

    @Override
    public void getMessage(String message) {
        System.out.println("B: "+message);
    }


}
