# SGQHPG18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Reducing Stock

In this example, we demonstrate how the  **pre-decrement operator (`--x`)**  updates a variable  **before**  its value is used in an operation.

 **When executed, the code will show:** 

```
Stock remaining: 9  
Stock remaining: 8  
Stock remaining: 7  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T05:00:27.559Z  

```java
class Codechef {
    public static void main(String[] args) {
        int stock = 10; // Initial stock count

        // Display stock count after decrementing
        System.out.println("Stock remaining: " + --stock);
        System.out.println("Stock remaining: " + --stock);
        System.out.println("Stock remaining: " + --stock);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SGQHPG18)