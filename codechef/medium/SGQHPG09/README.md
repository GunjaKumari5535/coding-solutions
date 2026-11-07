# SGQHPG09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Pre and Post Increment

What will be the output of the following Java program?

```
class Codechef {
    public static void main(String[] args) {
        int value = 5;
        System.out.println(++value);  
        System.out.println(value++);  
        System.out.println(++value);  
        System.out.println(value);    
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T04:54:31.839Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/SGQHPG09)