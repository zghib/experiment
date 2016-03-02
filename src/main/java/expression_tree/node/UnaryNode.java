package expression_tree.node;

public class UnaryNode extends Node {

    private final Node right;


    /** Ctor */
    public UnaryNode(Node right) {
        this.right = right;
    }


    /** Return the right child. */
    @Override
    public Node right() {
        return this.right;
    }
}
