# CBNFLQ08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are working on a utility to display time durations in a user-friendly format. Given a total duration in seconds, your task is to convert this duration into hours, minutes, and remaining seconds.

You will be provided with an initial variable `totalSecondsInput` representing the total duration in seconds. You need to calculate:

- The number of full hours.
- The number of full minutes from the remaining seconds after accounting for hours.
- The number of seconds remaining after accounting for hours and minutes.

Store your results in the provided variables: `hours`, `minutes`, and `seconds`. A helper variable `remainingSecondsAfterHours` is also provided for your convenience in breaking down the calculation.

Remember:

- There are 3600 seconds in an hour.
- There are 60 seconds in a minute.
### Sample 1:
Input
Output

```
7384
```

```
Hours: 2
Minutes: 3
Seconds: 4
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T05:23:23.582Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int totalSecondsInput = 7384;

        // Calculate full hours
        int hours= totalSecondsInput/3600;
   int remainingSecondsAfterHours = totalSecondsInput%3600;
        // Calculate full minutes from remaining seconds
         int minutes = remainingSecondsAfterHours/60;

        // Remaining seconds after extracting minutes
int seconds =remainingSecondsAfterHours% 60;

        // Output the result
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CBNFLQ08)