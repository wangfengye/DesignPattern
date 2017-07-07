package expression;

/**
 * Created by lenovo on 2017/7/7.
 */
public abstract class SymbolNode implements INode {
    INode left;
    INode right;

    public SymbolNode(INode left, INode right) {
        this.left = left;
        this.right = right;
    }


}
