package expression_tree.node;

import expression_tree.visitor.Visitor;

public class NegateNode extends UnaryNode {
    public NegateNode(Node right) {
        super(right);
    }

    /** Return the printable character stored in the node. */
    public int item() {
        return '-';
    }

    /**
     * Define the @a accept() operation used for the Visitor pattern
     * to accept the @a visitor.
     */
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
