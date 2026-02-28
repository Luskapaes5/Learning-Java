# Module 1 – Practical Exercises

Covers:
- 1.1 Compilation and execution
- 1.2 Program structure
- 1.3 Primitive types
- 1.4 Variables and constants
- 1.5 Operators

---

## Exercise 1 – Compilation Flow Verification

1. Create a file named `ModuleOneTest.java`.
2. Write a minimal valid Java program with a `main` method.
3. Compile it using:
   ```
   javac ModuleOneTest.java
   ```
4. Confirm that a `.class` file was generated.
5. Execute it:
   ```
   java ModuleOneTest
   ```
6. Delete the `.class` file and try running again. Explain the result.

---

## Exercise 2 – Variable and Primitive Practice

Create a program that declares:

- One `int`
- One `double`
- One `char`
- One `boolean`
- One constant using `final`

Assign meaningful values and print all of them.

Then:
- Change the non-final variables.
- Attempt to change the constant and observe the compiler error.

---

## Exercise 3 – Arithmetic Operations

Create a program that:

1. Declares two numeric variables.
2. Prints:
   - Sum
   - Subtraction
   - Multiplication
   - Division
   - Remainder

Then:

3. Change one variable to `double`.
4. Observe the difference in division behavior.

---

## Exercise 4 – Relational and Logical Operators

Create a program that:

1. Declares an integer `age`.
2. Declares a boolean `hasPermission`.
3. Creates a boolean variable `isAllowed` using relational and logical operators.
4. Prints the result.

Test different values and observe how `&&` and `||` behave.

---

## Exercise 5 – Increment Behavior

Write a program that demonstrates:

- Prefix increment (`++x`)
- Postfix increment (`x++`)

Print the values before and after each operation and explain the difference.

---

## Exercise 6 – Scope and Static Behavior

Create a class with:

- One instance variable
- One static variable
- Two methods that modify them

Then:

1. Create two objects of the class.
2. Modify the static variable using one object.
3. Print the value from the other object.
4. Observe and explain the result.

---

## Exercise 7 – Expression Evaluation

Given:

```java
int result = 5 + 3 * 2;
```

1. Print the result.
2. Rewrite using parentheses to change the result.
3. Explain operator precedence.

---

## Exercise 8 – Integrated Calculation Program

Create a program that:

1. Declares:
   - `final double TAX_RATE`
   - `double productPrice`
   - `int quantity`
2. Calculates:
   - Total price
   - Tax amount
   - Final price
3. Prints a structured numeric output.

Use:
- Arithmetic operators
- Assignment operators
- Proper variable naming
- Correct program structure

---

Completion of these exercises means you have applied every core concept of Module 1.