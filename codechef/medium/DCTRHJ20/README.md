# DCTRHJ20

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Customer Order Summary

Write a program to generate a customer order summary using the `concat()` method.
The program should take the customer's name, the ordered dish, and the total price of the order.
Then, it should print the complete order summary by concatenating these details using the `concat()` method.

```
customerName = "Alice"
orderedDish = "Pasta"
totalPrice = 12.99

```

 **Expected Output:** 
If stored and printed correctly, the program will output something like:

```
Customer: Alice
Ordered Dish: Pasta
Total Price: $12.99
Order Summary: Alice ordered Pasta. The total price is $12.99.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T08:41:49.709Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Given Variables
        String customerName = "Alice";
        String orderedDish = "Pasta";
        double totalPrice = 12.99;

        // Using concat() method to create the order summary...Complete the remaining code
        String orderSummary = "Customer: ".concat(customerName)
                                    .concat("\nOrdered Dish: ")
                                    .concat(orderedDish)
                                    .concat("\nTotal Price: $")
                                    .concat(String.valueOf(totalPrice))
                                    .concat("\nOrder Summary: ")
                                    .concat(customerName)
                                    .concat(" ordered ")
                                    .concat(orderedDish)
                                    .concat(".  The total price is $")
                                    .concat(String.valueOf(totalPrice))
                                    .concat(".");
                                

        // Print the final order summary
        System.out.println(orderSummary);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DCTRHJ20)