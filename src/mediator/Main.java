package mediator;

/**
 * Created by lenovo on 2017/7/7.
 */
public class Main {
    public static void main(String[] args){
        IMediator mediator = new Mediator();
        IColleague colleagueA =new ColleagueA();
        IColleague colleagueB =new ColleagueB();
        mediator.register(colleagueA);
        mediator.register(colleagueB);
        colleagueA.sendMessage("回忆里逞强 fromA");
    }
}
