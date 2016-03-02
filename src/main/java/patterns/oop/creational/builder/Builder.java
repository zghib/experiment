package patterns.oop.creational.builder;

/**
 Builder Pattern says that "construct a complex object from simple objects using step-by-step approach"

 It is mostly used when object can't be created in single step like in the de-serialization of a complex object.

 Advantage of Builder Design Pattern

 The main advantages of Builder Pattern are as follows:

 It provides clear separation between the construction and representation of an object.
 It provides better control over construction process.
 It supports to change the internal representation of objects.

 There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.

 Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time,
 the type of arguments are same and from client side its hard to maintain the order of the argument.
 Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional parameters need to send as NULL.
 If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.
 */

public class Builder {

}
