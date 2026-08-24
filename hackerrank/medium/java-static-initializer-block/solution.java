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
       
