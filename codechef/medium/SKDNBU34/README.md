# SKDNBU34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Setting the Same Base Salary

A company is setting the same base salary for three new employees before applying raises. The base salary is initialized using chained assignment.

What will be the output of the following Java program?

```
class Codechef {
    public static void main(String[] args) {
        int emp1, emp2, emp3;
        emp1 = emp2 = emp3 = 30000; 
        emp2 += 5000; // Raise for emp2

        System.out.println("Employee 1 Salary: " + emp1);
        System.out.println("Employee 2 Salary: " + emp2);
        System.out.println("Employee 3 Salary: " + emp3);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T10:03:21.131Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/SKDNBU34)