## Design patterns Report

# Introduction 

A design pattern is a generic repeatable solution to a typically occurring problem in software design in software engineering. A design pattern isn't a finalised design that can be turned into code right away. It's a description or template for solving an issue that may be applied to a variety of scenarios.

# Usage of Design Patterns

Design patterns can help developers save time by providing tried-and-true development paradigms. Effective software design necessitates taking into account challenges that may not be apparent until later in the implementation process. For coders and architects acquainted with the patterns, reusing design patterns helps to eliminate minor flaws that can lead to large difficulties and improves code readability.

Design patterns define a common language and are tailored to a given context. A facade design pattern, for example, denotes a single class which provides simplified methods required by client and delegates calls to methods of existing system classes, thus all developers who are familiar with single class which provides simplified methods will use single objects, and they will be able to detect whether a code is following a facade pattern.

People frequently only know how to apply specific software design strategies to specific challenges. These methods are challenging to apply to a larger set of issues. Design patterns are generic solutions that are described in a way that does not necessitate specifics connected to a specific situation.

Design patterns have evolved through time to give the best answers to specific challenges encountered during software development. Learning these patterns makes it easier and faster for inexperienced engineers to learn software design.

Patterns also help engineers to speak about software interactions using well-known, well-understood terms. Compared to ad-hoc designs, common design patterns may be refined over time, making them more resilient.

# Brief history of design patterns

Design patterns have been around since the late 1970s, when architect Christopher Alexander and a few others published A Pattern Language: Towns, Buildings, and Construction. This book introduced design patterns in an architectural setting, offering 253 patterns that created a pattern language, according to the authors.

In 1986, Donald Norman and Stephen Draper released User Centered System Design, which introduced the notion of a pattern language. The use of pattern languages in interaction design, which is the practise of creating interactive digital goods, settings, systems, and services for human use, was recommended in this book.

Meanwhile, Kent Beck and Ward Cunningham had started looking at patterns and how they may be used in software design. They employed a number of design patterns to aid Tektronix's Semiconductor Test Systems Group in accomplishing a design project in 1987. Beck and Cunningham followed Alexander's recommendation for user-centered design (allowing representatives of the project's users to decide on the design outcome) while also giving them with certain design patterns to help them out.

While working on his PhD thesis, Erich Gamma understood the relevance of recurrent design patterns. He thought that design patterns may make building reusable object-oriented software easier, and he wondered how to properly describe and explain them. Gamma and Richard Helm began cataloguing patterns prior to the 1991 European Conference on Object-Oriented Programming.

Ralph Johnson and John Vlissides joined Gamma and Helm at an OOPSLA workshop in 1991. The Gang of Four (GoF) went on to create Design Patterns: Elements of Reusable Object-Oriented Software, a popular book that details 23 design patterns divided into three categories.

Pattern Languages of Programs was founded in 1994 by the Hillside Group, a non-profit organisation located in the United States, with the goal of developing and refining the art of software design patterns. Many instances of domain-specific design patterns have emerged from these ongoing conferences. Consider design patterns in the context of concurrency.

Patterns in Java was published by Mark Grand in 1998. Design patterns not included in the GoF book, such as concurrency patterns, were added in this book. Grand also described design patterns and their solutions using the Unified Modeling Language (UML). The Java language was used to explain and describe the examples in the book.

# The Three-Step Design Pattern Learning Process

- Acceptance Accept the reality that design patterns will be crucial in your software development efforts
- Recognition Recognize the importance of learning about design patterns and keeping an eye out for them in order to know when to employ them.
- Internalization Finally, you "internalise" the patterns to the point where you know ("intuitively") which one(s) would assist you in solving a particular situation.

# Criticism of design patterns

One of the most common criticisms levelled about design patterns is how "generic" they are. For example, in languages without lambdas/first-class functions, the Strategy Pattern implementation appears to be more significant (and difficult) (compare Java vs. Ruby, or even the C# "functional" approach).

The majority of design pattern objections I've seen are motivated by a dislike for the structure and naming of what they regard to be just acceptable object-oriented practises. Programming to interfaces and other SOLID concepts are at the heart of most patterns. When we teach patterns, we have the impression that we are encouraging developers, particularly younger developers, to attempt to squeeze all issues into the set of patterns that they have learned, resulting in more opaque and burdensome problems than if they had adopted a more'straightforward' approach.

I agree that once you learn patterns, you tend to abuse them, but you usually move out of that stage fast and into a much more productive and professional software career.

## Software design patterns by classification

Based on their use, modern software design patterns are divided into four categories: creational, structural, behavioural, and concurrency.

The intricacy, depth of detail, and scope of application to the overall system being created distinguish design patterns. I like the metro construction analogy: you can make a junction safer by installing track emergency systems or constructing a multi-level interchange with tracking systems.

Architectural patterns are the most general and high-level patterns. These patterns may be implemented in almost any programming language. They may be used to build the architecture of a whole application, unlike other patterns.

# Creational patterns

The process of instantiation is abstracted with a creational pattern, which separates how objects are generated, constructed, and represented from the programming that relies on them. Object creational patterns delegate instantiation to other objects, whereas class creational patterns leverage inheritance to alter the classes that are created.

- Abstract factory: This pattern creates and returns one of many families of related objects or encapsulates a number of distinct factories with a similar theme without defining their particular classes.


- Builder: Separates the building of a complicated item from its representation, allowing for the creation of several representations using the same construction method. By abstracting the processes of object building, various implementations of the steps may be used to create various representations of the objects.


- Factory method: Defines an object creation interface, but allows subclasses to choose which class to instantiate. This pattern allows a class's initialization to be deferred to subclasses. A similar pattern is dependency injection. 


- Singleton: Ensures that a class only has one instance and offers a global access point to it.

# Structural patterns

The structural pattern shows us how to put classes and objects together to make bigger structures. Inheritance is used in a structural class pattern to create a resultant interface or implementation (for example, multiple inheritance mixes two or more classes into one class). A structural object pattern combines many objects to create a new function.

- Adapter: changes the interface of a class into the interface that customers expect. An adaptor enables classes that would otherwise be unable to collaborate owing to conflicting interfaces to do so. It accomplishes this by offering a client-facing interface while maintaining the original class interfaces inside. The Wrapper pattern is another name for the Adapter pattern.


- Bridge: Allows an abstraction to be decoupled from its implementation, allowing the two to vary independently. To divide responsibilities into distinct classes, the bridge employs encapsulation, aggregation, and inheritance.


- Decorator: Adds extra responsibilities to an object dynamically while keeping the same interface. For expanding functionality, decorators are a versatile alternative to subclassing.


- Composite: Creates tree structures from items that reflect part-whole hierarchies. Clients can use Composite to handle individual objects and object combinations consistently.


- Facade: Provides a uniform interface for a group of subsystem interfaces. Facade is a higher-level interface for the subsystem that makes it easier to use. Poorly constructed APIs can be wrapped in a single well-defined API using facades.


- Flyweight:Sharing is used to efficiently support a large number of related items. A flyweight is an entity that uses as little memory as possible by exchanging data with other similar things. When a basic repeating representation would result in an excessive quantity of allocated memory, it provides a mechanism to utilise objects in enormous numbers.


- Proxy: This item acts as a proxy or placeholder for another object. The access to the other item is controlled by this proxy.

# Behavioral patterns

Algorithms and the assignment of responsibility amongst objects are the subject of behavioural patterns. They deal with both object and class patterns, as well as the communication patterns that exist between them. Inheritance is used in a behavioural class pattern to spread behaviour among classes. A behavioural object pattern, on the other hand, makes advantage of object composition.

- Command: Uses an object to hold all of the information required to invoke a method later. The name of the method, the object that owns the method, and the values for the method arguments are all included in this data. The command object is created by the client, who also supplies the information needed to invoke the method. When the method should be invoked is decided by the invoker. Finally, the receiver is a member of the class that contains the code for the method.

- Visitor: An operation to be performed on the elements of an object structure is represented by this class. Without modifying the classes of the components on which it acts, Visitor allows you to specify a new operation.


- Strategy: Defines a set of algorithms, encapsulates them, and allows them to be swapped out. The algorithm's strategy allows it to change independently of the customers who utilise it.


- Iterator: Allows developers to progressively access the constituents of an aggregate object without disclosing the underlying representation.


- Observer: Defines a one-to-many relationship between objects, in which a state change in one object causes all of its dependents to be immediately alerted and changed. The Publish-subscribe pattern is also known as the Observer pattern.


- Chain of responsibility: Allows more than one object to handle a request, without coupling the request's sender and recipient. This pattern connects receiving objects and transmits a request along the chain until it is handled by one of the objects.

# Implementation

We are implementing 4 design patterns.

 - Singleton pattern
 - Builder pattern
 - Adapter pattern
 - Factory pattern
