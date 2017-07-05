package flyWeight;

/**
 * Created by lenovo on 2017/7/5.
 */
public class ConcreteFlyweight implements Flyweight{
    private Character intrinsicState =null;

    public ConcreteFlyweight(Character innerStare) {
        this.intrinsicState = innerStare;
    }

    @Override
    public void operation(String state) {
        System.out.println("Intrinsic State:"+this.intrinsicState);
        System.out.println("Extrinsic State:"+state);
    }
}
