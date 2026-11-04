import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int sum =( (n*n)+n)/2;
        // or int sum = n(n+1)/2;
        System.out.println(sum);
    }
}