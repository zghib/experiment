package patterns.oop.behavioral.command;

/** The Command for turning off the light - ConcreteCommand #2 */
class FlipDownCommand implements Command {
    private Light theLight;

    public FlipDownCommand(Light light) {
        this.theLight = light;
    }

// Command
    public void execute() {
        theLight.turnOff();
    }
}
