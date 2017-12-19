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

## Variables
A variable is a piece of memory to which we can assign data to make it easy to reuse. We use variables as tools to make our code more understandable. Every variable requires a *type declaration* when we initialize it, in order to help with *speed and safety*. 

**Speed** because all variables of the same type require the same amount of memory and by declaring the type at initialization *Java is able to allocate only the proper amount*.

**Safety** to help us catch our mistakes before our program runs. Also to alert us if we are assigning wrong value types to variables.

The **pattern:** ```type variableName```

**Data Types**

Here are some of the most-used *primative types*:
- **int:** An int holds integers but limited to numbers between -2147483648 and 2147483647.
- **long:** These are for larger integers up to 2^63 (around 2 quintillion).
- **boolean:** A boolean represents one of two values: true or false.
- **double:** Doubles are for floating point numbers like 3.14159265. Doubles are far more precise than floats.
- **char:** The char data type is used to store a single character, like '$' or 'A'.

Java also has  *object types*:
- **String:** Represents a sequence of characters.
- **BigInteger:** Represents an integer that can be any size at all.

Deeper look at types, how big they are, and their ranges:
- byte (1 byte) -- Range: -128 to 127
- short (2 bytes) -- Range: -32,768 to 32,767
- int (4 bytes) -- Range: -2,147,483,648 to 2,147,483, 647
- long (8 bytes) -- Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
- float (4 bytes) -- Range: approximately ±3.40282347E+38F
- double (8 bytes) -- Range: approximately ±1.79769313486231570E+308
- char (2 bytes) -- Range: 0 to 65,536
- boolean (n/a) -- Range: true or false

It's important to be aware of the memory allocation for each type. Also casting down (bigger to smaller range) can cause unexpected results.

**Explicitly Casting**

Explicitly casting is when we declare the type that we want to convert to in our source code. For example:
```java
class Casting {
    public static void main(String[] args) {
        double d = 35.25;
        double dd = 35.99;
        
        // casting the double d into a int
        int i = (int) d;
        
        // casting the double dd into a int
        int ii = (int) dd;
        System.out.println(i); // output 35
        System.out.println(ii); // output 35
    }
}
```

**Implicit Casting**

Depending on the context, Java will implicitily cast types for us. For example:
```java
class Casting {
    public static void main(String[] args) {
        int i = 35;
        float f = i; // from int to float
        System.out.println("The number is: " + f); // from float to string and the output is: The number is: 35.0
    }
}
```
Java will allow implicit conversions as long as the target type has a range large enough for the conversion.

## Importing
> Quick excerpt about importing: Java has many built in classes and methods that are readily available to developers. To tell Java we want to use these special classes we just have to use an import statement before our class definition.

## Strings
**Strings** represent a sequence of characters.

Strings belong to a class. *Instances of the String class are immutable, so once you create a String, it cannot be modified.*

**Methods of the String class**
- Length: Strings have a method to determine their length.
- Concatenate: A String method that allows two strings to be squashed together. Since each each string is immutable, this results in a brand new string. The '+' sign is also overloaded to provide the same functionality: "Welcome," + " ninja" + "!"; // displays "Welcome, ninjas!"
- Format: Another way of concatenating strings!
```java
String ninja = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.);
System.out.println(ninja);
// Will print out Hi Jack, you owe me $25.00 !
// Where %s is expecting a string
// And %.2f is expecting a float data type. The value 2 will just place two values to right of the decimal point.
```
- IndexOf: The indexOf() method searches left-to-right inside the given string for a 'target' string. The indexOf() method returns the index number where the target string is first found or -1 if the target is not found.

## Conditionals
> We use conditionals in conjunction with operators to control the flow of the program. Remember:
- A condition always returns true or false
- As long as something has a value (Which almost everything in Java does) it can be used in a condition

## Methods
Due to the object oriented nature of Java, you will only be dealing with methods and never stand alone functions. 

**Method Declaration**

Methods are just functions that are attached to an object. Each method will have a code body and a method declaration which includes the access level, return type, name, and parameter variables.
- code body: the block of code that you want to be repeated whenever you invoke or call your method
- return type: the return value must either be a class, a primitive, or void
- parameter variables: possible inputs for your method, when calling it in the future, the arguments supplied must match the order and type in your method declaration

**Method Signatures**

A method signature for ```public String fizzBuzz(int number) {} ``` looks like ```fizzBuzz(int)``` the information contained in the signature is:
1. name
2. parameter type

Signatures allows us to do something called *overloading* methods

**Overloading Methods**

Method overloading is when we call two methods with the same name in the same class. For example:
```java
    // ...
    public String fizzBuzz(int number) {
    // ...
    public String fizzBuzz(String number, int numberTwo) {
    // ...
```
Whichever method is called is based on what argument type and the method signature.

## Arrays
Arrays in Java are a fixed-size sequential collection of elements of the same type with a zero-based index. *Note:* In Java an array has a fixed size (after initialization) meaning you cannot add or remove items from an array.

**ArrayList**

The ```util``` module provides us with an ```ArrayList``` that is not fixed in size, but is still a sequential zero-based index collection of elements. We can add as many items as we need to.
```java
import java.util.ArrayList;
ArrayList<Integer> myArray = new ArrayList<Integer>();
```
First ```<Integer>``` is a part called *generics* it tells our ArrayList of the acceptable types it can hold. Generics help to keep our compiler, and us, from making mistakes.

## Loops
Two main types of loops, the while loop and the for loop. There is also the enhanced for loop which can't do everything that the other two can do, but does provide a nice convenience.

**While Loop**

The while loop is checking a condition (true or false) and looping through a block of code. If the condition never switches then it will become an infinite loop, therefore it is important to make sure that we are modifying some aspect of the program to make the switch, eventually.

**For Loop**

A specialized while loop. The most common ```for``` statement you'll see is comprised of 4 key parts: 
- the initialization (```int i = 0```)
- the termination (```i < 7```)
- the increment (```i++```)
- the body statment (```System.out.println('bar')```)
```java
for (int i = 0; i < 7; i++){
    System.out.println("bar");
}
```

**Enhanced For Loop**
```java
for (String name : dynamicArray){
    System.out.println("hello " + name);
    // other operations using name
}
// parts referenced below
for (element container : collection){
    body statements
}
```

## Maps
While arrays and lists are useful not everything is stored in a specific sequential order. On the Java platform key-value pairs are store in what we call "Maps". The primary type being the HashMap.

**HashMap**

HashMaps allow you to store key-value pairs, but does not have any order. 
```java
import java.util.HashMap;
HashMap<String, String> userMap = new HashMap<>();
// once you've created it you can put your key-value pairs in:
userMap.put("nninja@codingdojo.com", "Nancy Ninja");
userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
// and also get them out:
String name = userMap.get("nninja@codingdojo.com");
```
You can do much more with HashMaps, to check that out click: https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html

## Exception Handling
Sometimes it is impossible to avoid errors. We might be making a call to a database, read or write to a file, or even just using a class written by someone else - all of these are exceptional situations that could cause errors that would bring our program to a stop. However, most code you interact with is kind enough to know when a risky operation is happening and will declare that it might *throw* an exception of a certain type.

**Try/Catch**

In Java we can utilize a ```try``` statement. This will try out some risky code and then catch any exceptional events that arise. Example:
```java
class DeliverMessage{
    public static void main(String[] args){
        UnreliableFriend friend = new UnreliableFriend();
        try{
            friend.deliverMessage();
            System.out.println("The message was delivered!");
        } catch (OutOfGasException e){
            System.out.println("Hey, uh, so, I ran out of gas..");
            // back-up plan here.
        }
    }
}
```
# Java OOP
## Objects and Classes
An **Object** is a collection of behaviors and properties that all revolve around the same concept; this collection of behaviors and properties are called *instance members*. They are reusable and are created from blueprints known as *classes*.

You create a **Class** in Java by starting with the keyword ```class``` and the name of the class followed by ```{ }```. Classes should be named with a noun. Also the convention is to use **PascalCase**.

In Java you can have multiple classes in the same file but only one class that is public and that public class must be named identically to the file's name.

##Method
Once again a ```method``` is just a function that belongs to a class. A method can do things like print, get, set, or delete information, or anything else you can think of. We name methods after verbs.

One of the most important concepts relating to OOP is that objects only share certain aspects about themselves publically. **Public Methods** deal with how to interact with the object, but we keep all the details about the logic we are performing inside those functions **private**. This gives us control over what information we are croadcasting.

**Defining Terms**

- **modifiers:** ```private``` is the access modifier that defines the access type of the method. A private method will only be visible to the object itself and cannot be called from other classes.
    - ```private```: only the class in which it is declared can see and access the method, this is the most restrictive access level
    - ```protected```: protected access gives subclasses a change to use the method, while preventing a nonrelated class from trying to use it
    - ```public```: Every class everywhere has access to the method
We will discuss ```static``` a little later.
- **return type:** ```String``` is a return type declaring that a method return a ```Sting``` type. Other return types may be entered whatever your preferred return type is. In Java, you must specify what data type your method will return, otherwise it will result in an error
- **method name:** the convention for choosing a name for your method depends on what return type the method has. For example if the method returns a boolean the convention is to ask a question in the name. We use **lowerCamelCase** for method names.
- **parameter list:** this is common to all programming languages, whatever is enclosed in the opening and closing parenthesis are called parameters, declaring the datatype is required when there are parameters
- **method body:** the method body defines the instructions that are to be executed when the method is called, it is the code between the curly braces
- **method type:** ```static``` defines the method to be a **class method**  that is invoked without reference
- **static modifier:** this is the most common modifier you'll see that is not an access modifier, static methods can be called without creating an object, class methods are useful for creating for creating constants and class fields that need to be used throughout a program

## Member Variables
Attributes of a class would be referred to as **member variables** or **fields**. Three types of variables in Java:
- Member variables - object attributes or fields
- Local variables - variables in method/code blocks that are not member variables
- Parameter variables - those that are declared in your method

**Getters and Setters**

Member variables are typically declared inside the class before any method and are accessed via getter and setter methods. The variables themselves should almost always be declared as ```private``` to prevent access directly to the ```field```. **Getters** are methods that retrieve a field value and **setters** are methods that set the field value.

## Constructors and Method Overloading
A **constructor**  method is a special function that gets called when an instance of an object is created. The difference between a construtor method and other methods are:
- It doesn't have a **return type**
- The name of the constructor **MUST** be the same name of the class to which is belongs
- A constructor is called automatically when a new instance of an object is created

Constructor methods are used to execute some block of code on object instantiation.

Once again **Overloading** a method is just defining new method signatures for the same method name. Example: ```new Vehicle()```, ```new Vehicle('someColor)```, and ```new Vehicle('someColor', 4)```. Remember that the method overloading technique is not only for constuctors; any method can be overloaded.

## this Keyword
In Java, ```this``` refers to the current object within the context of an instance method or constructor. You can refer to any member variable of the current object by using this. 
```java
class Person {
    private int age;
    private String name;
    public Person(int ageParam, String nameParam) {
        this.age = ageParam;
        this.name = nameParam;
    }
}
// above is the same as below
class Person {
    private int age;
    private String name;
    public Person(int ageParam, String nameParam) {
        age = ageParam;
        name = nameParam;
    }
}
```
There is one case when you **MUST** use ```this```, if your parameter variables share the same name as one of your member variables:
```java
class Person {
    private int age;
    private String name;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        
        // this will not set the attribute value. 'age' is a local variable in the constructor method and its value is the very first argument.
        age = age 
    }
}
```

**Constructor Overloading**

Another use of ```this``` is when you have overloaded your constructor, but don't want to have to write any repetitive code.
```java
public class Person {
    private int age;
    private int cmHeight;
    private String name;
    public Person() {
        this(20, "John Doe", 171);
    }
    
    public Person(int age, String name, int cmHeight) {
        this.age = age;
        this.name = name;
        this.cmHeight = cmHeight;
    }
    // ...
```

**Object Superclass**

Since this refers to your object and given that all objects are decendants of the ```Object``` class, this means we are able to use methods inherited from the ```Object``` class.

The ```Object``` class is considered a superclass because it is at the top of the class Hierarchy, it contains methods that all of our objects can use, but to access them you have to use the ```this``` keyword. Some of the most used methods:
- ```getClass()```: returns a ```Class``` object that represents the object's current class
- ```.equals()```: compares two objects for equality and returns a boolean
- ```.toString()```: return a string representation of the object, if you want you can override this method

## Inheritance
Inheritance is one of the most important features of object oriented programming.

**Superclass, subclass, and extending**
```java
public class Human extends Mammal {

}
```
Let's say you had a Mammal class that you've written out and you want to create another class called Human and you want the Human class to have the same methods as the Mammal class, instead of rewriting tons of code you can extend the class.

In the above example the Human class would become a *subclass* of the Mammal class and the Mammal class would be the *superclass* of the Human. The **extends** keyword tells our compiler the relationship and now the Human class has inherited all the members from its superclass (except it won't have access to private member variables unless through getters and setters).

**Overriding Methods**

You can change or extend the method of a superclass by just writing a method that has the same method signature and return type as the parent method. The new method will be called on the subclass whenever it is invoked. Let's say Mammals have a method ```startSleeping()``` and you want to change it in the Human class:
```java
class Human extends Mammal {
    // ...
    public void startSleeping() {
        System.out.println("Toss and turn");
        super.startSleeping();
    }
}
```
The Humans now toss and turn, but we added the ```super``` keyword to our method now too. With the ```super``` keyword we now can invoke our new method and the parent method in whatever order we choose. If we did not use the ```super``` to call the original method our new method would over write our old whenever we called the class Human.

## Packages
In Java a package is a namespace that contains a set of related classes. It is a grouping of related types that helps to organize code and prevent collision of class names. You can think of packages as similar to folders. This is Java's way of organizing, instead of us having to save our Java classes into a single project folder we can use sub folders (packages) to separate our classes.

## More on Static
Sometimes we want a variable shared across all objects, we achieve this by creating class variables. These variables are in one fixed location in memory, and all objects have access to it. It is also accessible without even creating any instances of the class. Example, what if we want to keep track of how many pbjects frmo the Person class we have created, we need a class variable to hold on to the current count:
```java
public class Person {
    private int age;
    private String name;
    public static int numberOfPeople = 0;
    public Person(int ageParam, String nameParam) {
        age = ageParam;
        name = nameParam;
        numberOfPeople++;
    }
}
```

**Static Methods**

When creating static variables it is common practice to create static methods to access said variables. Example:
```java
public class Person {
    private int age;
    private String name;
    // the variable is now private
    private static int numberOfPeople = 0;
    public Person(int ageParam, String nameParam) {
        age = ageParam;
        name = nameParam;
        numberOfPeople++;
    }
    
    public static int peopleCount() {
        return numberOfPeople;
    }
}
```
Important to note class (static) methods cannot access instance cariables or instance methods directly, in addition, class (static) methods cannot use the ```this``` keyword as there is no instance for this to refer to.

## Interface
Interfaces arise out of the need for several objects to be able to interact with something in the same way. Imagine you had both cat and dog classes but they share functionality, what if they would both need to access ```giveOwnerAffection()``` and ```sleepInside()``` but then implement them differently? We do not need to create new classes for both, instead we can create an interface for each class to implement. 

Following the cat and dog example we would create a ```HousePet``` interface that declares methods  ```giveOwnerAffection()``` and ```sleepInside()```. This also helps us with any future classes that become house pets.

To reiterate: **An interface is not a class** and while writing an interface is similar to writing a class they are two different concepts. A class describes the attrivbutes and behaviors of an object. Amn interface states behaviors that a class must implement.

In an interface you can not specify a specific implementation, more specifically this means you can only specify methods but not implement them.

Commonly: **An interface is a group of related methods with empty bodies**

**Interface Methods**

There are 3 types of interface methods: default, static, and abstract.
- ```default``` methods allow developers to create default methods that do not need implementation
- ```static``` methods are interface member methods, they are implemented on the interface level and are called on the interface not the class, therfore you cannot override static interface methods you can only call them directly on the interface that they were declared
- ```abstract``` methods are methods that are declared without implementation, the ```abstract``` method if implicit and will be the standard method if ```default``` or ```static``` are not declared
Also - ```public``` is the implicit access modifier

**Implementing an Interface**
To implement you simply use the ```implements``` keyword in our class definition. There is one rule: a class that implements an interface must implement all methods that were defined in the interface definiton besides ```default``` and ```static```.

## Abstract
Abstract classes are very similar to interfaces. They cannot be instantiated and methods may or may not have the implementation. However, in abstract classes, fields are not static and final by default. Therfore fields are not constants. Moreover methods may have all three levels of visibility: public, protected, and private. Unlike interfaces, where a class can implement multiple interfaces, a class can only extend one class, whether it is abstract or not.

**Why Abstract?**

Think about the ```Mammal``` class, it was only written so that other classes could extend it. In a large system, you may find yourself designing other such classes that should not themselves be instantiated. These are exactly what abstract classes are for - to prevent ambiguous classes from being instantiated in our code.

**Defining an Abstract Class**

An abstract class is defined with the ```abstract``` keyword in the class definition. An abstract class may or may not contain abstract methods - methods without implementation, but if a class contains an abstract method, the class itself must be abstract.

**Abstract class that implements an interface**

If an abstract class implements an interface it can implement some methods and leave to the subclass to implement the rest of the methods.

**Abstract vs Interfaces**

Consider using abstract classes if any of these statements apply to your situation:
- You want to share code among several closely related classes
- You expected that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private)
- You want to declare non-static or non-final fields, this enables you to define methods that can access and modify the sate of the object to which they belong

Consider using interfaces if any of these statements apply to your situation:
- You expect that unrelated classes would implement your interface
- You want to specify the behavior of a particular data type, but not converned about who implements its behavior
- You want to take advantage of multiple inheritance types


[Java Questions](questions.md)