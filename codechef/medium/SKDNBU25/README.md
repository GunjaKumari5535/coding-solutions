# SKDNBU25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Data Storage Converter

Write a program to convert total storage size into smaller units using the division assignment (`/=`) operator. The program should divide the total storage size by a conversion factor to determine the equivalent size in a smaller unit.

```
totalStorage = 1024000, conversionFactor = 1024

```

 **Expected Output:** 

```
1000

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:57:11.622Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Given variables: Total storage in kilobytes and conversion factor
int totalStorage = 1024000;
int conversionFactor = 1024;


        // Convert kilobytes to megabytes using /= 
totalStorage /= conversionFactor;

        // Print the updated storage size
        System.out.println(totalStorage);  // Prints the storage size in MB
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SKDNBU25)