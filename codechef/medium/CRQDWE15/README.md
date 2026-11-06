# CRQDWE15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fundraising Event Management

You are organizing a fundraising event where each sponsor donates a fixed amount, and extra donations are added separately.
Calculate the  **total funds**  by multiplying the  **number of sponsors**  by the  **donation per sponsor**  and adding  **extra donations**.
Print the  **final amount**.

 **Expected Output:** 

```
26000  

```

Write the code and click the "Run" button to check your results.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:23:08.791Z  

```java
class Codechef {
    public static void main(String[] args) {

         // Given Variables
        int sponsors = 4, donationPerSponsor = 4500, extraDonations = 8000;
        int totalFunds = (sponsors* donationPerSponsor)+extraDonations;
        System.out.println(totalFunds);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CRQDWE15)