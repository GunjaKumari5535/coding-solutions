# CRQDWE20

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Calculating the Average Candy Distribution

In a classroom, candies are divided equally among students after accounting for extra candies.
Calculate the total candies available and the average candies each student receives.

 **Steps to Complete:** 

- Multiply packsOfCandies by candiesPerPack and add extraCandies to get totalCandies.
- Divide totalCandies by students to determine averageCandies.
- Print both values.

 **Expected Output:** 

```
42  
4  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:29:10.439Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Write your code here
        int students = 10, packsOfCandies = 5, candiesPerPack = 8, extraCandies = 2;
        int totalCandies = (packsOfCandies* candiesPerPack)+ extraCandies;
       int  averageCandies = (totalCandies / students);
         System.out.println(totalCandies);
         System.out.println(averageCandies);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CRQDWE20)