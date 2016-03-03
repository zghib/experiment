package expression_tree.composite;

import expression_tree.node.Node;

/**
 * @class ExpressionTreeFactory
 * 
 * @brief This class implements the Factory Method pattern to create
 *        @a ExpressionTree objects.  If you want a different type
 *        of @a ExpressionTree you can subclass from this class and
 *        override the @a makeExpressionTree() factory method.
 */
public class ExpressionTreeFactory {

    /** 
     * Create a new @a ExpressionTree object that encapsulates the @a
     * componentNodeRoot that's passed as a parameter.
     */
    public ExpressionTree makeExpressionTree(Node componentNodeRoot) {
        return new ExpressionTree(componentNodeRoot);
    }
}
