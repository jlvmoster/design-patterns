# Design Patterns

## Object Oriented Basics

### Abstraction
### Encapsulation
### Polymorphism
### Inheritance

## Design Principles

_Identify the aspects of your application that vary and separate them from
what stays the same._
> Take what varies and “encapsulate” it so it won’t affect the rest of your code.
>
> or...
>
> Take the parts that vary and encapsulate them, so that later you can alter
> or extend the parts that vary without affecting those that don’t.

_Program to an interface, not an implementation._
> "Program to an interface" really means "Program to a supertype"

_Favor composition over inheritance._

_Strive for loosely coupled designs between objects that interact._

## Design Patterns

- Strategy - defines a family of algorithms, encapsulates each one, and makes them interchangeable.
  Strategy lets the algorithm vary independently from clients that use it.
- Observer - defines a one-to-many dependency between objects so that when one object changes state,
  all of its dependents are notified and updated automatically.
