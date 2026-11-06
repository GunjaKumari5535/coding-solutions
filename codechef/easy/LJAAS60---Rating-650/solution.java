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

