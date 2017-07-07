package expression;

import java.util.Stack;

/**
 * Created by lenovo on 2017/7/7.
 */
public class Calculator {
    private String statement;
    private INode node;
    public void build(String s){
        INode left =null, right=null;
        Stack stack =new Stack();
        statement =s;
        String[] sArr= statement.split(" ");
        for (int i=0;i<sArr.length;i++){
            System.out.println(sArr[i]);
            if (sArr[i].equalsIgnoreCase("*")){

                left=(INode)stack.pop();
                int val = Integer.parseInt(sArr[++i]);
                right =new ValueNode(val);
                stack.push(new MulNode(left,right));
            }else {
                stack.push(new ValueNode(Integer.parseInt(sArr[i])));
            }
        }
        this.node = (INode) stack.pop();
    }
    public int compute(){
        return node.interpret();
    }
}
