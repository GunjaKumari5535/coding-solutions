# QVQICP09 - Rating 420

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Valid Code Block Usage

Which of the following Java code snippets correctly defines a main method with a code block?

Option 1:

```
public static void main(String[] args) 
    System.out.println("Hello!");

```

Option 2:

```
public static void main(String[] args) {
    System.out.println("Hello!");
}

```

Option 3:

```
public static void main(String[] args) (
    System.out.println("Hello!");
)

```

Option 4:

```
public static void main(String[] args) []
    System.out.println("Hello!");

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T04:54:29.274Z  

```cpp
class Codechef {  
    public static void main(String[] args) {
        // Execute the first block
        {
            System.out.println("Executing Block 1");
        } 
        
        // Execute the second block
        {
            System.out.println("Executing Block 2");
        }
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/QVQICP09)