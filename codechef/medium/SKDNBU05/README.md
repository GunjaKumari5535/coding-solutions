# SKDNBU05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Grocery Bill Calculator

Write a program to calculate the total bill after a discount and find the average price per item using the given variables. Use assignment (`=`), addition (`+`), subtraction (`-`), and division (`/`) operators.

 **Steps to Complete:** 

- Calculate the total price and apply the discount.
- Find the average price per item.
- Print the final bill details.

Run the code and modify the values to test different scenarios!

 **Expected Output:** 

```
Total Price is : 80
Final Price after the discount is : 70
Average Price is : 35

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T09:44:51.851Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Given variables: Prices of two items and a discount amount
        int itemPrice1 = 50, itemPrice2 = 30, discount = 10;

        // Calculate total price before discount
 int totalPrice = itemPrice1+ itemPrice2;

        // Apply discount to get the final price

int finalPrice = totalPrice - discount; 
        // Calculate average price per item after discount
 int averagePrice = finalPrice/2;
 

        // Print the final bill details
        System.out.println("Total Price is : "+totalPrice);    // Prints total price before discount
        System.out.println("Final Price after the discount is : "+finalPrice);    // Prints final price after discount
        System.out.println("Average Price is : "+averagePrice);  // Prints average price per item
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SKDNBU05)