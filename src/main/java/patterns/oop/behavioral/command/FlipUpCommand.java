package patterns.oop.behavioral.command;

/** The Command for turning on the light - ConcreteCommand #1 */
class FlipUpCommand implements Command {
    private Light theLight;

    public FlipUpCommand(Light light) {
        this.theLight = light;
    }

   // Command
    public void execute() {
        theLight.turnOn();
    }
}
