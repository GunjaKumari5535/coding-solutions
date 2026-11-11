# Print With Separator

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two strings  **s1**  and  **s2**, and a separator symbol separator, print s1 and s2 with separator between them, followed by a new line.

 **Examples :** 

```
Input: s1 = "Hello", s2 = "World", separator = "@"
Output: Hello@World
Explanation: s1 and s2 are printed with the @ symbol in between.
```

```
Input: s1 = "Geeks", s2 = "For", separator = "-"
Output: Geeks-For
Explanation: s1 and s2 are printed with the - symbol in between.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T14:23:46.208Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String separator = sc.nextLine();

        // code here
        System.out.println(s1+separator+s2);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-with-separator/1)