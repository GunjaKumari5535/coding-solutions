# JPRACMCQ6 - Rating 750

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Multiple Choice Question

Alice has scored $X$ marks in her test and Bob has scored $Y$ marks in the same test.
Alice is happy if she scored at least twice the marks of Bob’s score.
Print "Yes" is she is happy.
Other wise print nothing.

 **Option 1:** 

```
if (X >= 2 * Y) {
    System.out.println("YES");
}

```

 **Option 2:** 

```
if (X > 2*Y) {
    System.out.println("YES");
}

```

 **Option 3:** 

```
if (2*Y <= X) {
    System.out.println("YES");
}

```

 **Option 4:** 

```
if (2*Y >= X) {
    System.out.println("YES");
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T11:03:49.413Z  

```cpp
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Codechef {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // Read the two integers from the line
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        
        // Check if current speed Y is strictly greater than threshold X
        if (y > x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JPRACMCQ6)