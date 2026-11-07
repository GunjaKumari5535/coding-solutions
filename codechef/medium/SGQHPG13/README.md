# SGQHPG13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Tracking Remaining Attempts

In this example, we demonstrate how to use the  **post-decrement operator (`x--`)**  to update a counter while still using its original value in the current operation.

 **When executed, the code will show:** 

```
Attempts left: 3  
Attempts left: 2  
Attempts left: 1  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T04:58:08.914Z  

```java
class Codechef {
    public static void main(String[] args) {
        int remainingAttempts = 3; // Initial attempts count

        // Simulating attempts using post-decrement
        System.out.println("Attempts left: " + remainingAttempts--);
        System.out.println("Attempts left: " + remainingAttempts--);
        System.out.println("Attempts left: " + remainingAttempts--);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SGQHPG13)