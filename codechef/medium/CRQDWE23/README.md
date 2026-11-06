# CRQDWE23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Finding Remainders

In this example, we demonstrate how to declare multiple integer variables, use the modulus operator (`%`), and print the remainder values in Java.
The modulus operator finds the remainder when one number is divided by another.

 **When executed, the code will show:** 

```
Remainder when 20 is divided by 6 : 2
Remainder when 15 is divided by 4 : 3

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:35:05.545Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Declare integer variables
        int num1 = 20;
        int num2 = 6;
        int num3 = 15;
        int num4 = 4;

        // Perform modulus operation
        int remainder1 = num1 % num2; // 20 % 6 = 2
        int remainder2 = num3 % num4; // 15 % 4 = 3

        // Print results
        System.out.println("Remainder when 20 is divided by 6 : " + remainder1);
        System.out.println("Remainder when 15 is divided by 4 : " + remainder2);
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/CRQDWE23)