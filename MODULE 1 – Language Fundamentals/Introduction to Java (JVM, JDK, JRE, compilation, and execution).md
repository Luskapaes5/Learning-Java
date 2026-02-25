# Introduction to Java (JVM, JDK, JRE, compilation, and execution)


### What is Java

- A high-level programming language. The high in this context means that it's easier to read and write than low level languages like C or Assembly. These two languages interact more directly with the hardware, making them more complex and closer to the hardware.

- Object-oriented. The code is structured around objects that make organization, modularity and abstraction easier. Objects are abstract things that hold their own information and methods. These methods can be reused in different parts of the program, making the code more efficient and easier to maintain.

- Platform-independent. You can write it once, and it can run on any system that has a JVM (Java Virtual Machine) like Windows, Linux, Mac, etc.

- Widely used in software development, including mobile, web and enterprise beacuse.

### Java basic path

    .java source code
        ↓ (javac)
    .class bytecode
        ↓ (JVM + JIT at runtime)
    machine code (binary)
        ↓
    Executed by CPU

- To run a Java program, the source code is first written in a .java file. The javac compiler then converts this source code into a .class file, which contains bytecode rather than machine code. When the program is executed, the JVM loads the .class file and uses Just-In-Time (JIT) compilation to translate the bytecode into machine code. At this stage, the original .java code has been converted into binary instructions that can be understood and executed by the CPU. A few terms are worth understanding in this brief introduction:

- JVM: Java Virtual Machine transform the .class bytecode into binary code to make the machine read (via JIT). JVM also manage memory allocation. Each OS (Operating System)
has it's own JVM. Java is universal because of the JVM especification to each system.

- JDK: Java Development Kit is a software development environment used to build Java applications. It includes the Java compiler (javac), the Java Runtime Environment (JRE), and the Java Virtual Machine (JVM), along with additional development tools. it makes possible to write and run Java code on your computer.

- JRE: Java Runtime Environment is a software package used to run .class files. It cannot run .java files because it does not include the Java compiler (javac). It contains the JVM and the core Java libraries required for execution.

### Conceptual Hierarchy

    JDK
    ├── JRE
    │    ├── JVM
    │    └── Libraries
    └── javac + dev tools
