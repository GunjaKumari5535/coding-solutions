# DCTRHJ16

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T08:19:13.921Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Given Variables
       String bookTitle = "Book";
       String authorName = "Jon Doe";
       int totalPages= 20;
       double membershipNumber= 67890d;

        // Print individual details
        System.out.println("Book Title: "+ bookTitle);
        System.out.println("Author: "+ authorName);
        System.out.println("Total Pages: "+totalPages);
        System.out.println("Memebership Number: "+ membershipNumber);
        // Concatenate details into a summary
        String bookSummary = bookTitle +" by "+ authorName+ "has"+ totalPages+  "pages.Borrowed by memeber #"+membershipNumber;
        
        System.out.println("Library Book Summary: " + bookSummary);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DCTRHJ16)