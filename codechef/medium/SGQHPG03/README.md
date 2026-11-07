# SGQHPG03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Counting Button Clicks

In this example, we demonstrate how to use the  **post-increment operator (`x++`)**  to update a counter while still using its original value in the current operation.

 **When executed, the code will show:** 

```
Click number: 0  
Click number: 1  
Click number: 2  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T04:48:33.691Z  

```java
class Codechef {
    public static void main(String[] args) {
        int buttonClicks = 0; // Initial click count

        // Simulating button clicks using post-increment
        System.out.println("Click number: " + buttonClicks++);
        System.out.println("Click number: " + buttonClicks++);
        System.out.println("Click number: " + buttonClicks++);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SGQHPG03)