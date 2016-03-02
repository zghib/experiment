package expression_tree.node;

import expression_tree.visitor.Visitor;

public class MultiplyNode extends BinaryNode {

    public MultiplyNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int item() {
        return '*';
    }

    /**
     * Define the @a accept() operation used for the Visitor pattern
     * to accept the @a visitor.
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


}
