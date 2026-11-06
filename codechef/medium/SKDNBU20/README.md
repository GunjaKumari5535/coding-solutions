# SKDNBU20

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Salary Bonus Calculator

Write a program to update an employee's salary after applying a bonus multiplier using the  **multiplication assignment (`*=`)**  operator.
The program should multiply the current salary by the bonus factor and display the new salary.

```
salary = 45000.75, bonusMultiplier = 1.10

```

 **Expected Output:** 
If stored and printed correctly, your output should look something like:

```
49500.825

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:54:39.030Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Cook your dish here
double  salary = 45000.75d;
 double bonusMultiplier = 1.10d;
 salary *= bonusMultiplier;
 System.out.println(salary);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SKDNBU20)