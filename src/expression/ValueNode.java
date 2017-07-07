package expression;

/**
 * Created by lenovo on 2017/7/7.
 */
public class ValueNode implements INode {
    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
