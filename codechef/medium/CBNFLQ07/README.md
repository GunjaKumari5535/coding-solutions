# CBNFLQ07

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A bakery makes cookies in batches. You're given:

- cookiesPerBatch: cookies per batch (e.g., 24)
- flourPerBatchGrams: grams of flour per batch (e.g., 250)
- sugarPerBatchGrams: grams of sugar per batch (e.g., 100)
- desiredCookies: total cookies a customer wants (e.g., 60)

Write Java code to calculate and print:

- numFullBatches: full batches that can be made considering the desiredCookies
- totalFlourGrams: flour needed for those batches
- totalSugarGrams: sugar needed for those batches
- remainingCookies: cookies left outside full batches

 **Expected output:** 

```
--- Order Details ---
Desired cookies: 60
Cookies per batch: 24
--- Production Plan ---
Number of full batches to prepare: 2
Total flour needed for full batches: 500g
Total sugar needed for full batches: 200g
Remaining cookies (forming a partial batch from desired amount): 12

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T05:14:33.012Z  

```java
class BakeryOrder {
    public static void main(String[] args) {
        // --- Recipe Details & Order ---
        int cookiesPerBatch = 24;       // Number of cookies one batch makes
        int flourPerBatchGrams = 250;   // Grams of flour per batch
        int sugarPerBatchGrams = 100;   // Grams of sugar per batch
        int desiredCookies = 60;        // Total cookies the customer wants

       
        // 1. Calculate the number of full batches
        int numFullBatches;
        numFullBatches = desiredCookies/ cookiesPerBatch;
        

        // 2. Calculate total flour needed for the full batches
        int totalFlourGrams;
        
totalFlourGrams = numFullBatches*flourPerBatchGrams;
        // 3. Calculate total sugar needed for the full batches
        int totalSugarGrams;
        totalSugarGrams= numFullBatches*sugarPerBatchGrams;

        // 4. Calculate remaining cookies (those forming a partial batch from the desired amount)
        int remainingCookies;
        remainingCookies= desiredCookies% cookiesPerBatch;


        // --- Output ---
        System.out.println("--- Order Details ---");
        System.out.println("Desired cookies: " + desiredCookies);
        System.out.println("Cookies per batch: " + cookiesPerBatch);
        System.out.println("--- Production Plan ---");
        System.out.println("Number of full batches to prepare: " + numFullBatches);
        System.out.println("Total flour needed for full batches: " + totalFlourGrams + "g");
        System.out.println("Total sugar needed for full batches: " + totalSugarGrams + "g");
        System.out.println("Remaining cookies (forming a partial batch from desired amount): " + remainingCookies);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CBNFLQ07)