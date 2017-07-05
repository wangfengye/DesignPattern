package state;

/**
 * Created by lenovo on 2017/7/5.
 *  中奖 额外获得一个;
 */
public class WinAnother implements State{
    GumballMachine machine;

    public WinAnother(GumballMachine machine) {
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
        System.out.println("---中奖了,可获得两颗糖");
        machine.releaseBall();
        if (machine.count<=0){
            System.out.print("售空");
            machine.setState(machine.getSoldOut());
        }else {
            machine.releaseBall();
            if (machine.getCount()>0)machine.setState(machine.getNoQuarter());
            else machine.setState(machine.getSoldOut());
        }
    }
}
