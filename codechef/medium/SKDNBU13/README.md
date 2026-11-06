# SKDNBU13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Deducting Expenses

In this example, we demonstrate how to declare an integer variable, use the subtraction assignment operator (`-=`) to update its value, and print the result.
The `-=` operator helps efficiently reduce a variable’s value without repeating code.

 **When executed, the code will show:** 

```
Updated Wallet Balance: 300

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:49:34.297Z  

```java
class Codechef {
    public static void main(String[] args) {
        int walletBalance = 500; // Initial balance

        // Deducting expense using -= operator
        walletBalance -= 200;

        // Printing the updated balance
        System.out.println("Updated Wallet Balance: " + walletBalance);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SKDNBU13)