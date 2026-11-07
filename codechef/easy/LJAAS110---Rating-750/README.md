# LJAAS110 - Rating 750

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Print factorial

Write a program that uses a do-while loop to find the factorial of a given input number.

### Sample 1:
Input
Output

```
5
```

```
120
```

### Explanation:

1 x 2 x 3 x 4 x 5 = 120

### Sample 2:
Input
Output

```
6
```

```
720
```

### Explanation:

1 x 2 x 3 x 4 x 5 x 6 = 720

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T04:35:18.679Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
 Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
   long factorial=1;
          do {
              factorial *=n ;
              n--;
          } while(n>1);
          System.out.println(factorial);
     }
     
     
 }




```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS110)