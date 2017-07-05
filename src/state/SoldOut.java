package state;

/**
 * Created by lenovo on 2017/7/5.
 */
public class SoldOut implements State{
    GumballMachine machine;

    public SoldOut(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("---已售空");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("---已售空");
    }

    @Override
    public void turnCrank() {
        System.out.println("---已售空");
    }

    @Override
    public void dispense() {
        System.out.println("---已售空");
    }
}
