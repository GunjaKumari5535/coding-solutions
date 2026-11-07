# SGQHPG24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### A Factory Production

A factory produces 8 units per cycle, and production is increasing daily. The manager wants to calculate how many units will be produced in the next cycle using the pre-increment operator.

What will be the output of the following Java program?

```
class Codechef {
    public static void main(String[] args) {
        int units = 8;
        int nextCycleProduction = ++units * 2; 

        System.out.println("Next Cycle Production: " + nextCycleProduction);
        System.out.println("Final Units: " + units);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T05:04:57.910Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/SGQHPG24)