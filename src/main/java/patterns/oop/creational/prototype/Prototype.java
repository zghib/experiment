package patterns.oop.creational.prototype;

public abstract class Prototype implements Cloneable {
    public abstract Prototype clone();
}

class ConcretePrototype1 extends Prototype {
    @Override
    public Prototype clone() {
        return this.clone();
    }
}

class ConcretePrototype2 extends Prototype {
    @Override
    public Prototype clone() {
        return this.clone();
    }
}