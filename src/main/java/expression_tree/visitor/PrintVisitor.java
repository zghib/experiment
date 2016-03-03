package expression_tree.visitor;

import expression_tree.Platform;
import expression_tree.node.AddNode;
import expression_tree.node.DivideNode;
import expression_tree.node.LeafNode;
import expression_tree.node.MultiplyNode;
import expression_tree.node.NegateNode;
import expression_tree.node.SubtractNode;

/**
 * @class PrintVisitor
 *
 * @brief This class serves as a visitor that print the contents of
 *        each type of node in an expression tree.  This class plays
 *        the role of the "ConcreteVisitor" in the Visitor pattern.
 */
public class PrintVisitor implements Visitor {

    /** Ctor */
    public PrintVisitor() {
    }


    /** Visits a @a LeafNode and prints it contents. */
    public void visit(LeafNode node) {
        Platform.instance().addString(node.item() + " ");
    }


    /** Visit a @a NegateNode and prints its contents. */
    public void visit(NegateNode node) {
        Platform.instance().addString("-");
    }


    /** Visit a @a AddNode and prints its contents. */
    public void visit(AddNode node) {
        Platform.instance().addString("+ ");
    }


    /** Visit a @a SubtractNode and prints its contents. */
    public void visit(SubtractNode node) {
        Platform.instance().addString("- ");
    }


    /** Visit a @a DivideNode and prints its contents. */
    public void visit(DivideNode node) {
        Platform.instance().addString("/ ");
    }


    /** Visit a @a MultiplyNode and print its contents. */
    public void visit(MultiplyNode node) {
        Platform.instance().addString("* ");
    }
}
