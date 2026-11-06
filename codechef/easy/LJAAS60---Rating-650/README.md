# LJAAS60 - Rating 650

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Grades of Student

Write a program to print the grades of 3 students based on the marks they have obtained provided as input. The student is graded  **A**  if marks are greater than  **90**,  **B**  if marks are greater than  **70**,  **C**  if greater than or equal to  **40**, else  **F**.

[ **Note:**  You need to take inputs for all 3 students.]

### Sample 1:
Input
Output

```
95  
40  
20  
```

```
A  
C  
F  
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T10:50:44.542Z  

```java
import java.util.Scanner;

class Main
{
	public static void main (String[] args) 
	{
		// your code goes here
Scanner sc = new Scanner(System.in);
 int marks1 = sc.nextInt();
 
 //For student 1
 if(marks1 >90){
     System.out.println("A");
 }
     else if(marks1 >70 && marks1 <90){
         System.out.println("B");
     }
     else if(marks1 >=40 && marks1<70){
         System.out.println("C");
         
     }
     else {
         System.out.println("F");
     }
     
     //for Student 2 
      int m2 = sc.nextInt();
      if(m2>90){
          System.out.println("A");
          
      }
      else if(m2>70 && m2<90){
          System.out.println("B");
      }
      else if(m2>=40 && m2<70){
          System.out.println("C");
      }
      else {
          System.out.println("F");
      }
       //for student 3 
       int m3 = sc.nextInt();
       if(m3 >90){
           System.out.println("A");
       }
       else if(m3 >70 && m3 <90){
           System.out.println("B");
       }
       else if(m3 >=40 && m3<70){
           System.out.println("C");
       }
       else {
           System.out.println("F");
       }
 }
	}


```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS60)