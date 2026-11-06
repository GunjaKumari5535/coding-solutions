# CRQDWE25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check Vehicle Number Properties

Use the modulus operator (`%`) to extract the last digit of a vehicle number and check whether it is  **even or odd**. This will help you understand how Java calculates remainders and checks divisibility.

 **Steps to Complete:** 

- Declare integer variables lastDigit and evenOdd to store the output.
- Extract the last digit using % 10 and store it in lastDigit.
- Determine even/odd status using % 2 and store the result in evenOdd: 0 → Even 1 → Odd
- Print the last digit and even/odd status.

 **Expected Output:** 

```
Last digit of vehicle number: 8  
Even/Odd check (0 = Even, 1 = Odd): 0  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:40:16.419Z  

```java
// Declare class Codechef 
class Codechef {
    
    //  Define the main method
    public static void main(String[] args) {
        
        //  Declare an integer variable for the vehicle number
        int vehicleNumber = 278; 
        
        //  Declare variables lastDigit and evenOdd to store the output.
int lastDigit;
int evenOdd;



        //  Extract the last digit using modulus
lastDigit = vehicleNumber%10;
evenOdd = lastDigit%2;

        //  Check if the number is even or odd using modulus


        //  Print the results
        System.out.println("Last digit of vehicle number: " + lastDigit);
        System.out.println("Even/Odd check (0 = Even, 1 = Odd): " + evenOdd);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CRQDWE25)