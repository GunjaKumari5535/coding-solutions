# CRQDWE28

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Calculating Average

In this example, we demonstrate how to use floating-point division in Java to calculate the average of two numbers.
The floating-point division allows us to retain decimal precision when computing the average.

 **When executed, the code will show:** 

```
Average Score: 87.75

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:29:57.984Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Declare two floating-point variables to store scores
        double score1 = 85.5;
        double score2 = 90.0;
        
        // Perform floating-point division to calculate the average
        double average = (score1 + score2) / 2;
        
        // Print the calculated average
        System.out.println("Average Score: " + average);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CRQDWE28)