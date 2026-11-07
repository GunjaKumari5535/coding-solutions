# SGQHPG20 - Rating 1250

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Find the result

What will be the output of the following Java program?

```
class Codechef {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = a-- + ++b - --a - b++;
        System.out.println(c);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T05:01:53.268Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/SGQHPG20)