package expression_tree.visitor;

import java.util.Stack;

import expression_tree.Platform;
import expression_tree.node.AddNode;
import expression_tree.node.DivideNode;
import expression_tree.node.LeafNode;
import expression_tree.node.MultiplyNode;
import expression_tree.node.NegateNode;
import expression_tree.node.SubtractNode;

/**
 * @class EvaluationVisitor
 *
 * @brief This plays the role of a visitor for evaluating nodes in an
 *        expression tree that is being iterated in post-order fashion
 *        (and does not work correctly with any other iterator).  This
 *        class plays the role of the "ConcreteVisitor" in the Visitor
 *        pattern.
 */
public class EvaluationVisitor implements Visitor {

    /** 
     * Stack containing the integral total of the expression tree
     * that's being visited.
     */
    private Stack<Integer> stack = new Stack<Integer>();


    /** Ctor. */
    public EvaluationVisitor() {
    }


    /** Visit a @a LeafNode. */
    public void visit(LeafNode node) {
        stack.push(node.item());
    }


    /** Visit a  SubtractNode. */
    public void visit(NegateNode node) {
        if (stack.size() >= 1)
            stack.push(-stack.pop());
    }


    /** Visit a @a AddNode. */
    public void visit(AddNode node) {
        if (stack.size() >= 2)
            stack.push(stack.pop() + stack.pop());
    }


    /** Visit a @a SubtractNode. */
    public void visit(SubtractNode node) {
        if (stack.size() >= 2) {
            int rhs = stack.pop();
            stack.push(stack.pop() - rhs);
        }
    }


    /** Visit a @a DivideNode. */
    public void visit(DivideNode node) {
        if (stack.size() >= 2) {
            if (stack.peek() != 0) {
                int rhs = stack.pop();
                stack.push(stack.pop() / rhs);
            } else {
              Platform platform = Platform.instance();
                platform.errorLog("EvaluationVisitor", "\n\n**: Division by zero is not allowed. ");
                platform.errorLog("EvaluationVisitor", "Resetting evaluation visitor.\n\n");
                reset();
            }
        }
    }


    /** Visit a @a MultiplyNode. */
    public void visit(MultiplyNode node) {
        if (stack.size() >= 2)
            stack.push(stack.pop() * stack.pop());
    }


    /** Print the total of the evaluation. */
    public int total() {
        if (!stack.isEmpty())
            return stack.peek();
        else
            return 0;
    }


    /** Resets the evaluation to it can be reused. */
    public void reset() {
        stack.clear();
    }
}
