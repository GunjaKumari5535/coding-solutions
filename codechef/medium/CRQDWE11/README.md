# CRQDWE11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Track Poster Stock

Managing inventory is essential for tracking stock levels.
In this task, you will explore how Java can update and track poster stock using arithmetic operations.

 **Steps to Complete** 

- Subtract removedPosters from totalPosters to account for damaged and sold posters.
- Add newPosters to update the stock.
- Print updatedStock to display the final count.

 **Expected Output** 

```
165  

```

Write the code and click the "Run" button to check your results.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:20:12.796Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Declare integer variables for poster inventory
        int totalPosters = 200, removedPosters = 75, newPosters = 40;
        
        // Calculate the updated stock
           int dm = totalPosters- removedPosters;
           int updatedStock = dm + newPosters;
           System.out.println(updatedStock);

        // Print the updated stock

    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CRQDWE11)