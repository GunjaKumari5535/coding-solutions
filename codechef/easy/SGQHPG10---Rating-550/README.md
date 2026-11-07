# SGQHPG10 - Rating 550

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Warehouse Stock Update System

A warehouse system tracks stock levels.

- When new stock arrives, the total stock count is increased by 1 using the pre-increment operator (++x).
- The system then calculates the remaining items that don’t fit into full packs using the modulus (%) operator.

 **Expected Output:** 

```
Stocks after Pre-increment 51
Leftover packs are 3

```

Update the code in the IDE to solve this problem.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T04:56:56.911Z  

```java
class Codechef {
    public static void main(String[] args) {
        int stockCount = 50, itemsPerPack = 6;

        int updatedStock = ++stockCount;  // Pre-increment stock count when new stock arrives
        int remainingItems = updatedStock%itemsPerPack; // Find leftover items after full packing

        System.out.println("Stocks after Pre-increment "+updatedStock);
        System.out.println("Leftover packs are "+remainingItems);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SGQHPG10)