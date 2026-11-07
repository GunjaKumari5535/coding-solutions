# DCTRHJ13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example- Create a Full Name by +

In this example, we demonstrate how to concatenate strings using the `+` operator in Java.
The `+` operator allows us to join multiple strings together, creating a new string in the process.

 **Expected Output:** 

```
Full Name: John Doe

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T08:13:16.493Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Declaring two string variables
        String firstName = "John";  // First part of the name
        String lastName = "Doe";    // Second part of the name

        // Concatenating the first name and last name with a space
        String fullName = firstName + " " + lastName;  // Using + operator to concatenate

        // Printing the full name
        System.out.println("Full Name: " + fullName);  // Output: John Doe
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DCTRHJ13)