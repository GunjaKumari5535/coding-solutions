# QVQICP08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Block Nesting Demonstrator

In this example, we demonstrate how code blocks are used to structure and execute a Java program.

Inside the class, the main method serves as the entry point, and separate code blocks `{}` are used to organize execution. The `System.out.println()` method is used inside each block to print messages to the console.

When executed, the code will display a structured message output.

```
Executing Block 1
Executing Block 2

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T04:53:49.319Z  

```java
class Codechef {  
    public static void main(String[] args) {
        // Execute the first block
        {
            System.out.println("Executing Block 1");
        } 
        
        // Execute the second block
        {
            System.out.println("Executing Block 2");
        }
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/QVQICP08)