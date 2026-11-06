# SKDNBU11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Bank Interest Calculator

Write a program to calculate the new account balance after adding interest using the  **addition assignment (`+=`)**  operator. The interest is added to the existing balance, and the program should display the updated balance.

 **Expected Output:** 
If stored and printed correctly, your output should look something like:

```
5251.25

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:49:10.702Z  

```java
class Codechef {
    public static void main(String[] args){
        
        double accountBalance = 5000.50, interest = 250.75;
        // Cook your dish here
        accountBalance += interest;
        System.out.println(accountBalance);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SKDNBU11)