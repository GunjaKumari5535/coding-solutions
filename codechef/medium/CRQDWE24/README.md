# CRQDWE24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Calculating Remainders Using the Modulus Operator

What will be the output of the following Java program?

```
class Codechef {
    public static void main(String[] args) {
        int num1 = 17;
        int num2 = 5;
        int num3 = num1 % num2;
        num1 = num1 % num3;
        num2 = num2 % num3;
        System.out.println(num1 + num2);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:36:02.712Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/CRQDWE24)