# CBNFLQ10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A baker is preparing to bake a large batch of cookies using a classic recipe. The original recipe yields 24 cookies and requires:

- 2.5 cups of flour
- 8.0 ounces of chocolate chips
- The baker decides to make three times the number of cookies. Therefore, the required quantities of both flour and chocolate chips need to be tripled.
- However, the baker finds out that they only have enough chocolate chips for half of this tripled batch. So, the chocolate chips quantity needs to be halved after tripling.

Your task is to modify the `flourCups` and `chocoChipsOunces` variables using compound assignment operators and print the final amounts.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T05:27:51.228Z  

```java
class RecipeAdjuster {
    public static void main(String[] args) {
        int originalServings = 24; // Original recipe makes 24 cookies
        double flourCups = 2.5;
        double chocoChipsOunces = 8.0;

        //Triple the recipe quantities.
        
        flourCups *=3;
        chocoChipsOunces *=3;
        
        

        //Adjust chocolate chips. The baker only has enough for half of the tripled amount.
        
        chocoChipsOunces /= 2;

    
        System.out.println(flourCups);
        System.out.println(chocoChipsOunces);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CBNFLQ10)