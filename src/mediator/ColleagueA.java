package mediator;

/**
 * Created by lenovo on 2017/7/7.
 */
public class ColleagueA extends IColleague{

    @Override
    public void getMessage(String message) {
        System.out.println("A: "+message);
    }

}
