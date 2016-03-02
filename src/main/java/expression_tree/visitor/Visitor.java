package expression_tree.visitor;

import expression_tree.node.AddNode;
import expression_tree.node.DivideNode;
import expression_tree.node.LeafNode;
import expression_tree.node.MultiplyNode;
import expression_tree.node.NegateNode;
import expression_tree.node.SubtractNode;

public interface Visitor {

    void visit(LeafNode node);


    void visit(NegateNode node);


    void visit(AddNode node);


    void visit(SubtractNode node);


    void visit(DivideNode node);


    void visit(MultiplyNode node);
}
