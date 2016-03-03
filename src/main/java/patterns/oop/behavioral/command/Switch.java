package patterns.oop.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/** The Invoker class */
class Switch {
    private List<Command> history = new ArrayList<Command>();

    public void storeAndExecute(Command cmd) {
        this.history.add(cmd); // optional
        cmd.execute();
    }
}
