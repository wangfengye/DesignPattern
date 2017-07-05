package state;

/**
 * Created by lenovo on 2017/7/5.
 */
public class HasQuarter implements State {
    GumballMachine machine;

    public HasQuarter(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("---已投币");
    }

    @Override
    public void ejectQuarter() {
        machine.setState(machine.getNoQuarter());
    }

    @Override
    public void turnCrank() {
       int random = (int) (Math.random()*10);
        if (random<5&&machine.getCount()>=2)machine.setState(machine.getWinAnother());
        else machine.setState(machine.getSold());
    }

    @Override
    public void dispense() {
        System.out.println("已投币");
    }
}
