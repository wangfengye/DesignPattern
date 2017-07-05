package state;

/**
 * Created by lenovo on 2017/7/5.
 */
public class NoQuarter implements State{
    GumballMachine machine;

    public NoQuarter(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        machine.setState(machine.getHasQuarter());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("---尚未投币");
    }

    @Override
    public void turnCrank() {
        System.out.println("---尚未投币,无法摇柄");
    }

    @Override
    public void dispense() {
        System.out.println("---尚未投币");
    }
}
