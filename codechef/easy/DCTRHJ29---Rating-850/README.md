# DCTRHJ29 - Rating 850

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### MCQ - String Comparison with equals

What will be the output of the following Java code snippet?

```
class Codechef {
    public static void main(String[] args) {
        String greeting1 = "Hello, World!";
        String greeting2 = new String("Hello, World!"); 
        String greeting3 = "hello, world!";
        
        boolean result1 = greeting1.equals(greeting2);
        boolean result2 = greeting1.equals(greeting3);
        
        System.out.println(result1);
        System.out.println(result2);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T09:09:29.259Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        // Declaring and initializing strings
        String str1 = "Good Morning";
        String str2 = "Good Morning";
        String str3 = "Good Evening";

        // Comparing strings using equals()
        boolean isEqual1 = str1.equals(str2); // Comparing str1 and str2
        boolean isEqual2 = str1.equals(str3); // Comparing str1 and str3

        // Printing the results
        System.out.println("Is str1 equal to str2? " + isEqual1); // Output: true
        System.out.println("Is str1 equal to str3? " + isEqual2); // Output: false
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DCTRHJ29)