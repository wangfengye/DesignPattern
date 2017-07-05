package state;

/**
 * Created by lenovo on 2017/7/4.
 * 糖果机
 */
public class GumballMachine {
    private State soldOut;
    private State sold;
    private State hasQuarter;
    private State noQuarter;
    private State winAnother;
    private State state;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        sold =new Sold(this);
        soldOut= new SoldOut(this);
        hasQuarter= new HasQuarter(this);
        noQuarter =new NoQuarter(this);
        winAnother= new WinAnother(this);
        if (count>0)state =noQuarter;
        else state=soldOut;
    }

    public void insertQuarter() {
        System.out.println("[投币]");
        state.insertQuarter();
    }
    public void  ejectQuarter(){
        System.out.println("[退币]");
        state.ejectQuarter();
    }
    public void trunCrank(){
        System.out.println("[摇柄]");
        state.turnCrank();
        dispense();
    }

    public void dispense() {
        System.out.println("[出糖]");
        state.dispense();
    }
    public void releaseBall(){
        count--;
        System.out.println("---售出糖:1颗;剩余:"+count+"颗");
    }

    public void setState(State state){
        this.state =state;
    }

    public State getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(State soldOut) {
        this.soldOut = soldOut;
    }

    public State getSold() {
        return sold;
    }

    public void setSold(State sold) {
        this.sold = sold;
    }

    public State getHasQuarter() {
        return hasQuarter;
    }

    public void setHasQuarter(State hasQuarter) {
        this.hasQuarter = hasQuarter;
    }

    public State getNoQuarter() {
        return noQuarter;
    }

    public void setNoQuarter(State noQuarter) {
        this.noQuarter = noQuarter;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getWinAnother() {
        return winAnother;
    }

    public void setWinAnother(State winAnother) {
        this.winAnother = winAnother;
    }
}
