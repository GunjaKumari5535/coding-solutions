# JPRACMCQ11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multiple Choice Question

Chef and Chefina are playing with dice. In one turn, both of them roll their dice at once.

They consider a turn to be  *good*  if the  **sum**  of the numbers on their dice is greater than $6$.
Given that in a particular turn Chef and Chefina got $X$ and $Y$ on their respective dice, select the options which are good turns.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T04:40:35.392Z  

```cpp
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		// write your code here
    		int sum = a+b;
    		System.out.println(sum);
		}
		
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JPRACMCQ11)