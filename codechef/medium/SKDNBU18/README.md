# SKDNBU18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Calculating Total Cost

In this example, we demonstrate how to declare an integer variable, use the multiplication assignment operator (` *=`) to update its value, and print the result. The `* =` operator helps efficiently scale values without repetitive code.

 **When executed, the code will show:** 

```
Total Cost: 60

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:51:04.510Z  

```java
class Codechef {
    public static void main(String[] args) {
        int costPerItem = 15; // Cost of one item

        // Calculating total cost using *= operator
        costPerItem *= 4;

        // Printing the total cost
        System.out.println("Total Cost: " + costPerItem);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SKDNBU18)