# SGQHPG08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Updating Inventory Count

In this example, we demonstrate how the  **pre-increment operator (`++x`)**  updates a variable  **before**  its value is used in an operation.

 **When executed, the code will show:** 

```
Stock available: 11
Stock available: 12
Stock available: 13

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T04:52:51.729Z  

```java
class Codechef {
    public static void main(String[] args) {
        int itemsInStock = 10; // Initial stock count

        // Display stock count after incrementing
        System.out.println("Stock available: " + ++itemsInStock);
        System.out.println("Stock available: " + ++itemsInStock);
        System.out.println("Stock available: " + ++itemsInStock);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SGQHPG08)