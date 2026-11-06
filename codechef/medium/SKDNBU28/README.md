# SKDNBU28

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Distributing Candies

In this example, we demonstrate how to declare an integer variable, use the modulus assignment operator (`%=`) to update its value, and print the result. The `%=` operator helps efficiently calculate remainders in division operations.

 **When executed, the code will show:** 

```
Remaining Candies: 1

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:57:35.784Z  

```java
class Codechef {
    public static void main(String[] args) {
        int candies = 25; // Total number of candies

        // Calculating remaining candies using %= operator
        candies %= 4;

        // Printing the remainder candies
        System.out.println("Remaining Candies: " + candies);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SKDNBU28)