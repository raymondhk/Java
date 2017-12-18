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

**Keywords**

Our .java file that is used to create our java program is called the **source file** and the content inside is called the **source code**. After running *javac [file.java]* and successfully compiling Java automatically generates a **.class** file. This file contains **bytecode**. **Bytecode** is computer-independent but partially compiled and is then run in the terminal.

## OOP Introduction
Some basic code:
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```
- ```HelloWorld``` is a class. Java uses object-oriented programming for everything. In fact, it is not possible to write a function that doesn't belong to a class. **It it important to note that our file name must be the same name as our class.**
- ```main``` is a method that defines the entry point for an executable Java file, it is required for any file that is intended to be run from the command line. A method is just a name for a function that belongs to a class. Since everything must belong to a class, *all functions in Java are methods*.

**Syntax**

In writing Java code keep these in mind:
- **Case Sensitivity:** Java is case sensitive, which means 'Hello' and 'hello' have a different meaning.
- Class Names: Class names are written in **PascalCase (UpperCamelCase)**, earch word is capitalized and there are no spaces between them.
- Method Names: All method names should start with a lower case letter, if there are multiple words in the method name they should be written in **lowerCamelCase**. Typically verbs are used as method names.
- **Program Filename:** The name of the program file should match the class name exactly.
- Mandatory Method:Java Program processing starts from the main() method which is mandatory part of every executable Java program. It should look like:
```java
public static void main(String[] args){
    // your code
}
```

**Example:**
```java
class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```
- Every application begins with a **class** definition. A class can contain multiple methods (which should be enclosed between the class opening and closing curly brace tag).
- The entry point (for an executable Java file) is the **main() method** so it is important that you have a main() method. The method signature for the main() method contains three modifiers:
    - **public:** This is known as an *access modifier*. Any **public** method we write is accessible from any other class or method in our project.
    - **static:** This means that the method belongs to and is called from the class itself rather than from an instance of the class.
    - **void:** This indicates that the main() method doesn't return anything.

More to come on these terms.

