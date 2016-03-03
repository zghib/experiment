package patterns.oop.behavioral.visitor;

interface ICarElement {
    void accept(ICarElementVisitor visitor);
}
