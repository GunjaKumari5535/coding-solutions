# CBNFLQ11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A small bookstore tracks its inventory for a popular novel. At the start of the day, they have an `initialStock` of 150 copies. During the day, they receive a new shipment (`receivedStock`) which consists of 75 copies. Later, they sell `soldStock` which amounts to 45 copies.

Your task is to calculate and display the `finalStock` count at the end of the day. You will work with a variable `currentStock`, which should be initialized with the `initialStock`.

You  **must**  use compound assignment operators.

Finally, print the value of `currentStock`.

### Sample 1:
Input
Output

```
 
```

```
Final stock: 180
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T05:31:47.530Z  

```java
class BookstoreInventory {
    public static void main(String[] args) {
         int initialStock = 150;
         int receivedStock = 75;
         int soldStock = 45;
          int currentStock = initialStock;
          int finalStock =  initialStock + receivedStock- soldStock;
        System.out.println("Final stock: "+ finalStock);
        
        
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CBNFLQ11)