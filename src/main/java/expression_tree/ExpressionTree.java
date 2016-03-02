package expression_tree;

import expression_tree.node.Node;
import expression_tree.visitor.Visitor;

public class ExpressionTree {

    private final Node root;


    public ExpressionTree(Node root) {
        this.root = root;
    }


    public boolean isNull() {
        return root == null;
    }


    public Node getRoot() {
        return root;
    }


    public int item() throws Exception {
        return root.item();
    }


    public ExpressionTree left() {
        return new ExpressionTree(root.left());
    }


    public ExpressionTree right() {
        return new ExpressionTree(root.right());
    }


    public void accept(Visitor visitor) {
        root.accept(visitor);
    }

}
