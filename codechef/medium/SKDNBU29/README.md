# SKDNBU29

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Using Modulus

What will be the output of the following Java program?

```
public class Codechef {
    public static void main(String[] args) {
        int number = 35;
        number %= 6; 
        number %= 4;
        System.out.println("Final Number: " + number);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:57:49.773Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/SKDNBU29)