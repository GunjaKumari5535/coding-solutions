# JPRACMCQ10 - Rating 650

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Multiple Choice Question

Recently, Chef visited his doctor. The doctor advised Chef to drink  **at least**  $2000$ ml of water each day.

Chef drank $X$ ml of water today. Select the options where Chef followed the doctor's advice.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T04:43:34.965Z  

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
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		// write your code here
    		int sum = x+y;
    		if(sum >6){
    		    System.out.println("YES");
    		}
    		else {
    		    System.out.println("NO");
    		}
		}
		
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JPRACMCQ10)