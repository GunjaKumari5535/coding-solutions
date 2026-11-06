# SKDNBU33

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Initializing Scores

In this example, we demonstrate how  **chained assignment**  allows multiple variables to be assigned the  **same initial score**  in a single statement.

 **When executed, the code will show:** 

```
Student 1 Score: 50  
Student 2 Score: 50  
Student 3 Score: 50  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T10:02:43.144Z  

```java
class Codechef {
    public static void main(String[] args) {
        int student1, student2, student3; // Declaring multiple variables

        // Assigning the same initial score using chained assignment
        student1 = student2 = student3 = 50;

        // Printing the initialized scores
        System.out.println("Student 1 Score: " + student1);
        System.out.println("Student 2 Score: " + student2);
        System.out.println("Student 3 Score: " + student3);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SKDNBU33)