package state;

/**
 * Created by lenovo on 2017/7/5.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
