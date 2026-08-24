# Java Loops I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

**Objective**	
In this challenge, we're going to use loops to help us do some simple math.

**Task**	
Given an integer, $N$, print its first $10$ multiples. Each multiple $N \times i$ (where $1 \le i \le 10$) should be printed on a new line in the form: `N x i = result`.

**Input Format**

A single integer, $N$.

**Constraints**

- $2 \le N \le 20$

**Output Format**

Print $10$ lines of output; each line $i$ (where $1 \le i \le 10$) contains the $result$ of $N \times i$ in the form: 	
`N x i = result`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T16:52:35.027Z  

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
       for(int i =1; i<11;i++){
        int result = N*i;
        System.out.printf("%d x %d = %d%n", N, i,result);
       }
        bufferedReader.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-loops-i/problem)