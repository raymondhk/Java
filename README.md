# Java
> Why Java? Java is one of the most widely used programming languages, but aside from its popularity the fact that it can run on almost every computer without changing behavior as well as its huge selection of libraries and tools makes it the first choice for many developers.

## Java Fundamentals
**Java's features**
- Strong and Static Typing
- Compiled Language
- Object Oriented
- Widely Used
- Ecosystem
- Java's API

**Strong and Weak**

JavaScript is a weakly typed language, meaning that a variable's type can be changed to another type on the fly.

Strongly typed languages help to catch errors early and fail fast. With strongly typed languages you cannot convert types on the fly.

**Dynamic and Static**

*Dynamic and Static* refers to when we assign types to variables. Languages with *static typing* assign a type to declared variables at compile time and set aside the right amount of memory for that variable. *Dynamic typing* assigns types only when the variable declaration code runs during execution and changes the memory allocated for the variable as needed (this comes at the cost of program speed while it reorganizes things).

Java, C, and Swift are statically typed.

JavaScript, Python, and Ruby are dynamically typed.

```java
int ourInt; // 1
String ourString = "hello world";   // 2
ourInt = "Hello world"; //3
```
1. We can declare variables without assigning a value because Java knows how much memory to allocate for that space.
2. We can assign the value of a variable as we declare them too!
3. This will throw an error before we even run our code because the types do not match.

Java is trying to help you write safe code that is free from errors. It is also beneficial when working with existing code bases to know exactly what data types a function needs to take in as its parameters.

**Compiled Language**

Java goes through analysis and optimization before it is run. The compiler can find repetitive code that you failed to optimize and do this for us, resulting in a faster program. *Compiling* results in *bytecode* files that you can then execute using the JRE.

**Object Oriented**

Java is a fully object oriented programming language. More on this later.
