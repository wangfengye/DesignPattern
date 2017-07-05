package state;

/**
 * Created by lenovo on 2017/7/5.
 */
public class Sold implements State{
    GumballMachine machine;

    public Sold(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {
        machine.releaseBall();
     if (machine.getCount()>0)machine.setState(machine.getNoQuarter());
        else machine.setState(machine.getSoldOut());
    }
}
