package expression_tree.node;

import expression_tree.visitor.Visitor;

public class LeafNode extends Node {

    private final int item;


    public LeafNode(int item) {
        this.item = item;
    }


    public LeafNode(String item) {
        this.item = Integer.parseInt(item);
    }


    @Override
    public int item() {
        return item;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
