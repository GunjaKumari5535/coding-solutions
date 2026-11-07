# DCTRHJ23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Demonstrating String Immutability

In this example, we demonstrate how  **String immutability**  works in Java. The original string remains unchanged even after trying to modify it using string methods like `concat()`. A new string object is created instead of modifying the original.

 **Expected Output:** 

```
Original Message: Java Programming  
New Message: Java Programming is fun!

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T08:58:36.790Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Declaring a String
        String originalMessage = "Java Programming";
        
        // try to update original string
        originalMessage.concat(" is fun!");
        
        // Concatenating a new string (creates a new string object)
        String newMessage = originalMessage.concat(" is fun!");
        
        // Printing both the original and new string
        System.out.println("Original Message: " + originalMessage); // Output: Java Programming
        System.out.println("New Message: " + newMessage); // Output: Java Programming is fun!
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DCTRHJ23)