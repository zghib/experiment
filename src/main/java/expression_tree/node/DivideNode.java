package expression_tree.node;

import expression_tree.visitor.Visitor;

public class DivideNode extends BinaryNode {

    public DivideNode(Node left, Node right) {
        super(left, right);
    }


    @Override
    public int item() {
        return '/';
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
