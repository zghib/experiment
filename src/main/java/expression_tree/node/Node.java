package expression_tree.node;

import expression_tree.visitor.Visitor;

public abstract class Node {

    public int item() {
        throw new UnsupportedOperationException("ComponentNode::item() called improperly");
    }


    public Node right() {
        return null;
    }


    public Node left() {
        return null;
    }


    public void accept(Visitor visitor) {
        throw new UnsupportedOperationException("ComponentNode::accept() called improperly");
    }

}
