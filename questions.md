# Sample Java Questions
1. **What are the Important features of Java 8 release?**
    1. Interface changes with default and static methods
    2. Functional interfaces and Lambda Expressions
    3. Java Stream API for collection classes
    4. Java Date Time API

2. **What do you mean by platform independence of Java?**
> Platform independece menas that you can run the same Java Program in any Operating System.

3. **What is JVM and is it platform independent?**
> Java Virtual Machine (JVM) is the heart of java programming language. JVM is responsible for converting byte code into machine readable code. JVM is not platform independent thats why you have different JVM for different operating systems. We can customize JVM with Java Options, such as allocating minimum and maximum memory to JVM. It's called virtual because it provides interface that doesn't depend on the underlying OS.

4. **What is the difference between JDK and JVM?**
> Java Development Kit (JDK) is for development purpose and JVM is a part of it to execute the java program. JDK provides all the tools executables and binaries required to compile, debug, and execute a Java Program. The execution part is handled by JVM to provide machine independence.

5. **What is the difference between JVM and JRE?**
> Java Runtime Environment (JRE) is the implementation of JVM. JRE consists of JVM and java binaries and other classes to execute any program successfully. JRE doesn't contain any development tools like java compiler, debugger etc. If you want to execute any java program, you should have JRE installed.

6. **Which class is the superclass of all classes?**
> ```java.lang.Object``` is the root class for all the java classes and we don't need to extend it.

7. **Why Java doesn't support multiple inheritance?**
> Java doesn't support multiple inheritance in classes because of the 'Diamond Problem'. More here: https://www.journaldev.com/1775/multiple-inheritance-in-java

However multiple inheritance is supported in interfaces. An interface can extend multiple interfaces bnecause they just declare methods and implementation will be present in the implementing class. So there is no issue of diamond problem with interface.

8. **Why Java is not pure Object Oriented language?**
> Java is not said to be pure object oriented because it supports primitive types such as int, byte, short, long, etc. 

9. **What is the difference between path and classpath variable**
> PATH is an environment variable used by operating system to locate executables. That's why when we install Java or want any executable to be found by OS, we need to add the directory location in the PATH variable. 

Classpath is specific to java and used by java executables to locate class files. We can provide classpath location while running java application and it can be a directory, ZIP files, JAR files, etc.

10. **What is the importance of main method in Java?**
> main() method is the entry point of any standalone java application. The syntas of main method is ```public static void main(String args[])```.

The main method is public and static so that java can access it without initializing the class. The input parameter is an array of String through which we can pass runtime arguments to the java program.

11. **What is overloading and overriding in Java?**
> When we have more than one method with the same name in a single class but the arguments are different, then it is called as method overloading.

Overriding concept comes in picture with inheritance when we have two methods with same signature, one in the parent class and one in the child class. Overriding is a feature that allows a subclass or a child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.

12. **Can we overload main method?**
> Yes, we can have multiple methods with name 'main' in single class. However if we run the class, java runtime environment will look for the main method with syntax as ```public static void main(String args[])```.

13. **Can we have multiple public classes in a java source file?**
> No, we can't have more than one public class in a single java source file. A single source file can have multiple classes that are not public.

14. **What is Java Package and which package is imported by default?**
> Java Package is the mechanism to organize the java classes by grouping them. The grouping logic can be based on functionality or modules based. A java class fully classified name contains package and class name. For example, ```java.lang.Object``` is the fully classified name of ```Object``` class that is part of ```java.lang``` package.

```java.lang``` package is imported by default and we don't need to import any class from this package explicitly.

15. **What are access modifiers?**
> Java provides access control through public, private and protected access modifier keywords. When none of these are used, it's called default access modifier. A java class can only have public or default access modifier.

16. **What is final keyword?**
> The final keyword is used with Class to make sure no other class can extend it, for example String class is final and we can't extend it.

We can use final keyword with methods to make sure child classes can't override it.

The final keyword can be used with variables to make sure that it can be assigned only once. However, the state of the variable can be changed.

Java interface variables are by default final and static.

17. **What is static keyword?**
>The static keyowrd can be used with class level variables to make it global. 

The static keyword can be used with methods also, a static method can access only static variables of class and invoke static methods of the class

18. **What is finally and finalize in Java?**
> The finally block is used with try-catch to put the code that you want to get executed always, even if any exception is thrown by the try-catch block, finally block is mostly used to release resources created in the try block.

the finalize() method is a special method in Object class that we can override in our classes. This method get's called by the garbage collector when the object is going through garbage collection. This method is usually overridden to release system resources when the object is going through garbage collection.

19. **Can we declare a class as static?**
> We can't declare a top-level class as static however, an inner class can be declared as static. If inner class is decalred as static it is called a static nested class. Static nested class is same as any other top-level class and is nested for only packaging convenience.

20. **What is static import?**
> If we have to use any static variable or method from other classes usually we import the class and then use the method/variable with the class name.

Use of static import can cause confusion so it's better to avoid it. Overuse of static import can make your program unreadable and unmaintainable.

21. **What is try-with-resources in Java?**
> We can create resources inside try block and use it. Java takes care of closing it as soon as try-catch vlock gets finished. It is an auto resource management.

22. **What is multi-catch block in Java?**
> It is a block where we can catch multiple exceptions in a single catch block. This makes our code shorter and cleaner when ever catch block has similar code.

23. **What is static block?**
> Java static block is a group of statements that gets executed when the class is loaded into memory by Java ClassLoader. It is used to initialize static variables of the class. Mostly it's used to create static resources when class is loaded.

24. **What is an interface?**
> Interfaces provide a way to achieve abstraction in Java and is used to define the contract for the subclasses to implement.

Interfaces are good for starting point to define Type and create top level hierarchy in our code.

25. **What is an abstract class?**
> Abstract classes are used in java to create a class with some default method implementation for subclasses. An abstract class can have abstract method without body and it can have methods without implementation too.

The abstract keyword is used to create an abstract class. Abstract classes can't be instantiated and mostly used to provide base for sub-classes to extend and override or implement the abstract methods.

26. **What is the difference between abstract class and interface?**
> Key differences: 
- A class can only extend one abstract class, but can implement multiple interfaces
- Abstract classes can have method implementations whereas interfaces can't
- We can run abstract class if it has main() method whereas we can't run an interface

27. **Can an interface implement or extend another interface?**
> Interfaces don't implement another interface they extend it. Since interfaces can't have method implementations there is no 'diamond issue', therefore an interface can extend multiple interfaces.
