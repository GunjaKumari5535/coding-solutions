# DCTRHJ18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Concatenating Strings

In this example, we demonstrate how to concatenate strings using the `concat()` method to form a full address by combining a street, city, and country.

 **When executed, the code will show:** 

```
Full Address: 123 Main St, Springfield, USA

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T08:21:45.233Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Declaring strings for street, city, and country
        String street = "123 Main St";
        String city = "Springfield";
        String country = "USA";

        // Concatenating strings using concat() method
        String fullAddress = street.concat(", ").concat(city).concat(", ").concat(country);

        // Printing the concatenated address
        System.out.println("Full Address: " + fullAddress);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DCTRHJ18)