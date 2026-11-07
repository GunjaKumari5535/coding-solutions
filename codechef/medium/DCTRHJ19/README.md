# DCTRHJ19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fill in the Blank - String Concatenation

Fill in the blank with the missing line to complete the concatenation and match the expected output.

```
public class Codechef {
    public static void main(String[] args) {
        String part1 = "Java";
        String part2 = "Programming";
        String result = part1_______; // Fill in the blank with the correct method
        System.out.println(result);
    }
}

```

### Expected Output

```
Java Programming

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T08:22:09.004Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/DCTRHJ19)