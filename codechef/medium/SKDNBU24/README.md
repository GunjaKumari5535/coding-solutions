# SKDNBU24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Using Division Assignment

What will be the output of the following Java program?

```
class Codechef {
    public static void main(String[] args) {
        int number = 64;
        number /= 4; 
        number /= 2;
        System.out.println("Final Number: " + number);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:55:57.575Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        int totalDistance = 120; // Total distance to be divided

        // Dividing the distance into equal parts using /= operator
        totalDistance /= 4;

        // Printing the divided distance
        System.out.println("Distance per section: " + totalDistance);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SKDNBU24)