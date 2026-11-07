# SGQHPG23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Calculating Discount

In this example, we demonstrate how  **increment and decrement operators**  affect expressions when applied within calculations.

A store gives customers a  **loyalty discount**  based on the number of purchases they have made. The discount starts at `5%` and increases for every additional purchase made.

 **When executed, the code will show:** 

```
Discount Percentage: 8%
Remaining Purchases: 3

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T05:04:00.600Z  

```java
class Codechef {
    public static void main(String[] args) {
        int purchases = 3; // Initial number of purchases

        // Calculating discount with pre-increment
        int discount = ++purchases * 2;

        // Printing discount and remaining purchases
        System.out.println("Discount Percentage: " + discount + "%");
        System.out.println("Remaining Purchases: " + --purchases);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SGQHPG23)