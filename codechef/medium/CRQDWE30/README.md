# CRQDWE30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Currency Exchange Rates and Conversions

A financial institution tracks currency exchange rates and conversions.
In this task, you'll store currency values as `double` and use floating-point division (`/`) to calculate the equivalent value in another currency.

 **Steps to Complete:** 

- Store the result in convertedAmount.
- Print the total amount, exchange rate, and converted amount.

 **Expected Output:** 

```
Total Amount in INR: 100.0  
Exchange Rate (1 USD to INR): 82.5  
Converted Amount in USD: 1.2121212121212122  

```

Write the code and test different exchange rates!

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:34:29.508Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Declare a double variable for total amount in USD
        double totalAmountUSD = 100.0; 

        // Declare a double variable for the exchange rate
        double exchangeRate = 82.5; 
    double convertedAmount = totalAmountUSD/ exchangeRate;
    System.out.println("Total Amount in INR: "+ totalAmountUSD);
    System.out.println("Exchange Rate (1 USD to INR): "+ exchangeRate);
    System.out.println("Converted Amount in USD: "+convertedAmount);
      
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CRQDWE30)