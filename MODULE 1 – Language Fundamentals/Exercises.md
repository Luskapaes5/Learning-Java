## 1.1 Exercises

### Conceptual

1. Define JVM, JRE, and JDK in one sentence each.
2. What is bytecode?
3. Why is Java considered platform-independent?
4. Does the JRE include the Java compiler? Explain.

---

### Process Understanding

5. Describe the steps from a `.java` file to CPU execution.
6. What is the role of the JIT compiler?

---

### Practical

7. Create a simple Java program.
8. Compile it using `javac`.
9. Run it using `java`.
10. Delete the `.class` file and try running the program again. What happens?

---

### Reflection

11. Why does Java use a virtual machine instead of compiling directly to native machine code?


## 1.2 Exercises

### Conceptual

1. Why must all Java code be inside a class?
2. What is the purpose of the `main` method?
3. Why must the `main` method be `static`?
4. What happens if the file name does not match the public class name?

---

### Structure Analysis

5. Identify and explain each part of this method signature:

   ```java
   public static void main(String[] args)
   ```

6. What is the role of `String[] args`?

---

### Practical

7. Write a Java program that prints your name.
8. Rename the file so it does not match the class name and attempt to compile it. What error occurs?
9. Remove the `static` keyword from the `main` method and try to run the program. What happens?
10. Remove the semicolon from a statement and attempt compilation. Describe the error.

---

### Reflection

11. Why does the JVM require a specific method signature to start execution?


## 1.3 Exercises

### Conceptual

1. What is a primitive type in Java?
2. List all 8 primitive types.
3. What is the difference between `int` and `long`?
4. What is the difference between `float` and `double`?
5. Why is `boolean` not considered a numeric type?

---

### Type Analysis

6. Which primitive type would you use to store:
   - A person's age?
   - The price of a product?
   - A single character?
   - A true/false condition?

7. What happens if you try to store a value larger than the maximum limit of an `int`?

---

### Practical

8. Declare one variable of each primitive type.
9. Assign values to each variable and print them.
10. Try assigning a decimal number to an `int`. What error occurs?
11. Declare a `byte` variable and assign a value greater than 127. What happens?

---

### Reflection

12. Why does Java use fixed-size primitive types instead of dynamically sized numeric types?