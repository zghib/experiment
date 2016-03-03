package expression_tree.command;

import expression_tree.state.TreeOps;

/**
 * @class QuitCommand
 * 
 * @brief Instructs the input dispatching loop to shut down.  This
 *        plays the role of the "ConcreteCommand" in the Command
 *        pattern.
 */
public class QuitCommand
        extends UserCommand {
    /** 
     * Constructor that provides the appropriate @a TreeOps.
     */
    QuitCommand(TreeOps context) {
        super.treeOps = context;
    }

    /** Quit the input dispatching loop. */
    public void execute() {
        //TODO: InputDispatcher.instance().endInputDispatching();
    }

    /** Print the valid commands available to users. */
    public void printValidCommands(boolean verboseField) {
    }
}
