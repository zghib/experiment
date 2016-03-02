package expression_tree.node;

import expression_tree.visitor.Visitor;

public class AddNode extends BinaryNode {

    public AddNode(Node left, Node right) {
        super(left, right);
    }


    @Override
    public int item() {
        return '+';
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
