# SKDNBU15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fuel Consumption Tracker

Write a program to update the remaining fuel in a vehicle after a trip using the  **subtraction assignment (`-=`)**  operator. The program should deduct the fuel consumed from the initial fuel level and display the updated fuel level.

Take two float variables: fuelLevel = 45.5, fuelConsumed = 12.3

 **Expected Output:** 

```
33.2

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:50:31.915Z  

```java
class Codechef {
    public static void main(String[] args) {
        
        float fuelLevel = 45.5f, fuelConsumed = 12.3f;
        // Cook your dish here
        fuelLevel -= fuelConsumed;
        System.out.println(fuelLevel);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SKDNBU15)