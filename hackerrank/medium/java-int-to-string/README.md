# Java Static Initializer Block

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer $n$, you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts $n$ into a string $s$ the code will print "*Good job*". Otherwise it will print "*Wrong answer*".

$n$ can range between $-100$ to $100$ inclusive.

**Input Format**

 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T17:35:55.399Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        static int  B;
        static int H;
        static boolean flag = false;
        
        static {
            Scanner sc = new Scanner(System.in);
                 B = sc.nextInt();
                 H = sc.nextInt();
                 sc.close();
                 if(B>0 && H>0){
                    flag = true;
                  }  else {
                        System.out.println("java.lang.Exception: Breadth and height must be positive");
                    }
                 }
                 public static void main(String[] args){
                    if(flag){
                        int area = B*H;
                        System.out.print(area);
                    }
                 }
            }
       

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-int-to-string/problem)