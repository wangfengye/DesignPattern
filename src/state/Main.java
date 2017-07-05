package state;

/**
 * Created by lenovo on 2017/7/5.
 */
public class Main {
    public static void main(String[] args){
        GumballMachine machine = new GumballMachine(10);
        machine.insertQuarter();
        machine.insertQuarter();
        machine.ejectQuarter();
        machine.ejectQuarter();
        while (machine.count>0) {
            machine.insertQuarter();
            machine.trunCrank();
        }
        machine.insertQuarter();
        machine.trunCrank();
    }
}
