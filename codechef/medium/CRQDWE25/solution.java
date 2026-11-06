// Declare class Codechef 
class Codechef {
    
    //  Define the main method
    public static void main(String[] args) {
        
        //  Declare an integer variable for the vehicle number
        int vehicleNumber = 278; 
        
        //  Declare variables lastDigit and evenOdd to store the output.
int lastDigit;
int evenOdd;



        //  Extract the last digit using modulus
lastDigit = vehicleNumber%10;
evenOdd = lastDigit%2;

        //  Check if the number is even or odd using modulus


        //  Print the results
        System.out.println("Last digit of vehicle number: " + lastDigit);
        System.out.println("Even/Odd check (0 = Even, 1 = Odd): " + evenOdd);
    }
}
