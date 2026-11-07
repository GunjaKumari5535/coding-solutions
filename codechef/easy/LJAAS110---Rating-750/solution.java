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



