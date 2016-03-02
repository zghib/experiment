package expression_tree.node;

public abstract class BinaryNode extends UnaryNode {

    private final Node left;


    public BinaryNode(Node left, Node right) {
        super(right);
        this.left = left;
    }


    @Override
    public Node left() {
        return left;
    }

}
