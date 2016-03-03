package expression_tree.state;

import java.util.HashMap;

public class UninitializedState extends State {
    /** Formats the traversal order of the state. */
    public void format(TreeOps context, String newFormat) {
        if (newFormat.equals(""))
        /**
         * Default to in-order if user doesn't explicitly
         * request a format order.
         */
            newFormat = "in-order";
        else if (!newFormat.equals("in-order"))
            throw new IllegalArgumentException(newFormat
                                               + " evaluation is not supported yet");

        /** Transition to the designated UninitializedState. */
        context.state(uninitializedStateFactory.makeUninitializedState(newFormat));
    }

    /**
     * @class UninitializedStateFactory
     *
     * @brief Implementation of a factory pattern that dynamically
     *        allocates the appropriate @a State object.
     *
     *        This class is a variant of the Abstract Factory
     *        pattern that has a set of related factory methods
     *        but which doesn't use inheritance.
     */
    static class UninitializedStateFactory {
        /**
         * A HashMap that maps user format string requests to the
         * corresponding UninitializedState implementations.
         */
        private HashMap<String, State> uninitializedStateMap =
                new HashMap<String, State>();

        /** Ctor */
        UninitializedStateFactory() {
            uninitializedStateMap.put
                    ("in-order",
                     new InOrderUninitializedState());
            uninitializedStateMap.put
                    ("pre-order",
                     new PreOrderUninitializedState());
            uninitializedStateMap.put
                    ("post-order",
                     new PostOrderUninitializedState());
            uninitializedStateMap.put
                    ("level-order",
                     new LevelOrderUninitializedState());
        }

        /**
         * Dynamically allocate a new @a State object based on the
         * designated @a format.
         */
        public State makeUninitializedState(String formatRequest) {
            /**
             * Try to find the pre-allocated UninitializedState
             * implementation.
             */
            State state = uninitializedStateMap.get(formatRequest);

            if(state != null)
            /** If we find it then return it. */
                return state;
            else
            /**
             * Otherwise, the user gave an unknown request, so throw
             * an exception.
             */
                throw new IllegalArgumentException(formatRequest
                                                   + "is not a supported format");
        }
    }

    /**
     * A state factory responsible for building uninitilized
     * states.
     */
    private static UninitializedStateFactory uninitializedStateFactory =
            new UninitializedStateFactory();

    static class InOrderUninitializedState extends UninitializedState {
        /**
         * Process the @a expression using an in-order interpreter
         * and update the state of the @a context to the @a
         * InOrderInitializedState.
         */
        public InOrderUninitializedState() {
            super();
        }

        /**
         * Process the @a expression using a in-order interpreter
         * and update the state of @a treeOps to the @a
         * InOrderInitializedState.
         */
        void makeTree(TreeOps treeOps, String inputExpression) {
            /**
             * Use the Interpreter and Builder patterns to create
             * the expression tree designated by user input.
             */
            treeOps.tree(treeOps.interpreter().interpret(inputExpression));

            /** Transition to the InOrderInitializedState. */
            treeOps.state(new InOrderInitializedState());
        }
    }

    /**
     * A state formatted in-order and containing an expression
     * tree.
     */
    static class InOrderInitializedState extends InOrderUninitializedState {
        public InOrderInitializedState() {
        }

        /**
         * Print the current expression tree in the @a context
         * using the designed @a format.
         */
        void print(TreeOps context, String format) {
            State.printTree(context.tree(), format);
        }

        /**
         * Evaluate the yield of the current expression tree in the @a
         * context using the designed @a format.
         */
        void evaluate(TreeOps context, String format) {
            State.evaluateTree(context.tree(), format);
        }
    }

    /**
     * A state formated level order without an expression tree.
     */
    static class LevelOrderUninitializedState extends UninitializedState {
        public LevelOrderUninitializedState() {
        }

        /**
         * Process the @a expression using a level-order
         * interpreter and update the state of the @a context to
         * the @a LevelOrderInitializedState.
         */
        void makeTree(TreeOps context, String expression) {
            throw new IllegalStateException("LevelOrderUninitializedState.makeTree() not yet implemented");
        }
    }

    /**
     * A state formated level order and containing an expression
     * tree.
     */
    static class LevelOrderInitializedState extends LevelOrderUninitializedState {
        public LevelOrderInitializedState() {
        }

        /**
         * Print the current expression tree in the @a context
         * using the designed @a format.
         */
        void print(TreeOps context, String format) {
            State.printTree(context.tree(), format);
        }

        /**
         * Evaluate the yield of the current expression tree
         * in the @a context using the designed @a format.
         */
        void evaluate(TreeOps context, String format) {
            throw new IllegalArgumentException("LevelOrderInitializedState.evaluate() not yet implemented");
        }
    }

    /**
     * A state formated post order without an expression tree.
     */
    static class PostOrderUninitializedState extends UninitializedState {
        /**Ctor*/
        public PostOrderUninitializedState() {
        }

        /**
         * Process the @a expression using a post-order
         * interpreter and update the state of the @a context to
         * the @a PostOrderInitializedState.
         */
        void makeTree(TreeOps context, String expression) {
            throw new IllegalStateException("PostOrderUninitializedState.makeTree() not yet implemented");
        }
    }

    /**
     * A state formated post order and containing an expression
     * tree.
     */
    static class PostOrderInitializedState extends PostOrderUninitializedState {
        /** Ctor */
        public PostOrderInitializedState() {
        }

        /**
         * Print the current expression tree in the @a context
         * using the designed @a format.
         */
        void print(TreeOps context, String format) {
            State.printTree(context.tree(), format);
        }

        /**
         * Evaluate the yield of the current expression tree
         * in the @a context using the designed @a format.
         */
        void evaluate(TreeOps context, String param) {
            throw new IllegalArgumentException("PostOrderInitializedState.evaluate() not yet implemented");
        }
    }

    /**
     * A state formated pre-order without an expression tree.
     */
    static class PreOrderUninitializedState extends UninitializedState {
        /** Ctor */
        public PreOrderUninitializedState() {
        }

        /**
         * Process the @a expression using a pre-order interpreter
         * and update the state of the @a context to the @a
         * PreOrderUninitializedState.
         */
        void makeTree(TreeOps context, String format) {
            throw new IllegalStateException("PreOrderUninitializedState.makeTree() not yet implemented");
        }
    }

    /**
     * A state formated pre-order and containing an expression
     * tree.
     */
    static class PreOrderInitializedState extends PreOrderUninitializedState {
        /** Ctor */
        public PreOrderInitializedState() {
        }

        /**
         * Print the current expression tree in the @a context
         * using the designed @a format.
         */
        void print(TreeOps context, String format) {
            State.printTree(context.tree(), format);
        }

        /**
         * Evaluate the yield of the current expression tree in
         * the @a context using the designed @a format.
         */
        void evaluate(TreeOps context, String format) {
            throw new IllegalArgumentException("PreOrderInitializedState.evaluate() not yet implemented");
        }
    }
}
