# SKDNBU23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Splitting Total Distance

In this example, we demonstrate how to declare an integer variable, use the division assignment operator (`/=`) to update its value, and print the result. The `/=` operator helps efficiently scale down values without repetitive code.

 **When executed, the code will show:** 

```
Distance per section: 30

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:55:32.339Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/SKDNBU23)