# DCTRHJ05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Student Information Tracker

Write a program to track a student’s name and marks in three subjects: Mathematics, Science, and English. Use `int` for storing marks in each subject, and calculate the total score by summing the marks in each subject.

```
studentName = "John Doe";
mathMarks = 85;
scienceMarks = 90;
englishMarks = 70;

```

 **Expected Output:** 

```
Student Name: John Doe
Total Score: 245
Score calculation completed.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T08:12:21.703Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Given Variables
        String studentName = "John Doe";  // Student's name
        int mathMarks = 85;  // Marks in Mathematics
        int scienceMarks = 90;  // Marks in Science
        int englishMarks = 70;  // Marks in English

        // Calculate total score
  int total =  mathMarks+ scienceMarks+ englishMarks;

        // Output the student information and total score
System.out.println("Student Name: "+studentName);
System.out.println("Total Score: "+ total);
System.out.println("Score calculation completed.");


    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DCTRHJ05)