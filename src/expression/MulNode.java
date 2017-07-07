package expression;

/**
 * Created by lenovo on 2017/7/7.
 */
public class MulNode extends SymbolNode {
    public MulNode(INode left, INode right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return super.left.interpret()*super.right.interpret();
    }
}
