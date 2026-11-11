# Swap Two Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two numbers  **a**  and  **b**, you need to swap their values so a holds the value of b and b holds the value of a.

**Examples :
**

```
Input: a = 1 b = 2
Output: 2 1
Explanation: Initially a = 1 and b = 2, now a = 2 and b = 1.

```

```
Input: a = 6 b = 7  
Output: 7 6 
Explanation: Initially a = 6 and b = 7, now a = 7 and b = 6.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T14:34:35.350Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // code here
        int  temp;
        temp =a;
        a= b;
        b= temp;
        
        

        System.out.print(a + " " + b);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/swap-the-numbers/1)