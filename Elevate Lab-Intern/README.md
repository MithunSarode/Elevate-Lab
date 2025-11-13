

Calculator Program (Java) — README



<h1>Overview</h1>



This Java program is a simple \*\*console-based calculator\*\* that performs basic arithmetic operations:



Addition (+)

Subtraction (–)

Multiplication (\*)

Division (/)



The program uses a \*\*loop\*\* to allow the user to perform multiple calculations until they choose to exit by typing \*\*`x`\*\* or \*\*`X`\*\*.



---



<h1>Features</h1>



✔ Accepts operators (`+`, `-`, `\*`, `/`)

✔ Reads two integers for the calculation

✔ Handles division safely (avoids divide-by-zero)

✔ Uses a \*\*while loop\*\* for repeated operations

✔ Exits the program when the user enters `x` or `X`

✔ Uses the Java `Scanner` class for user input



---



<h1>Code Explanation</h1>



1. Importing Scanner



```java

import java.util.Scanner;

```



This allows the program to read user input from the console.



---



2. Variable Initialization



```java

int res = 0;

```



`res` stores the result of each calculation.



---



3. Infinite Loop for Multiple Operations



```java

while (true) {

&nbsp;   ...

}

```



This loop continues until the user enters `'x'` or `'X'`.



---



4. Reading the Operator



```java

char OP = sc.next().trim().charAt(0);

```



\* Reads a word from the user

\* Removes extra spaces

\* Extracts the first character

&nbsp; This allows input like `+`, `\*`, `/`, etc.



---



5. Checking Valid Operators



```java

if (OP == '+' || OP == '-' || OP == '\*' || OP == '/') {

```



If the operator is valid, the program asks for the two numbers.



---



6. Reading Two Numbers



```java

int a = sc.nextInt();

int b = sc.nextInt();

```



These inputs are used for the selected operation.



---



7. Performing the Operation



Each operation is handled using individual `if` statements:



```java

if (OP == '+') res = a + b;

if (OP == '-') res = a - b;

if (OP == '\*') res = a \* b;

```



Division has a special check:



```java

if (OP == '/') {

&nbsp;   if (b != 0) {

&nbsp;       res = a / b;

&nbsp;   }

}

```



---



8. Exiting the Program



```java

else if (OP == 'x' || OP == 'X')

&nbsp;   break;

```



This stops the loop and ends the calculator.



---



9. Handling Invalid Operators



```java

else {

&nbsp;   System.out.println("Invalid Operation");

}

```



---



10. Printing the Result



```java

System.out.println(res);

```



The result is printed after each valid calculation.



---



<h3>Sample Input/Output</h3>



Example



```java

Enter the OP : +

Enter the 1st Number: 10

Enter the 2nd Number: 5

15



Enter the OP : \*

Enter the 1st Number: 4

Enter the 2nd Number: 3

12



Enter the OP : x

```



---



<h3>How to Run This Program</h3>



1\. Save the code as `Calculator.java`

2\. Open terminal/command prompt

3\. Compile the program:



 ```java

  javac Calculator.java

  ```

4\. Run the program:



 ```java

  java Calculator

  ```



---



<h3>Conclusion</h3>



This program demonstrates:



\* Basic input handling using `Scanner`

\* Conditional logic using `if`

\* Repeated execution using loops

\* Safe mathematical operations






