class Codechef {
    public static void main(String[] args) {
        // Given variables: Total storage in kilobytes and conversion factor
int totalStorage = 1024000;
int conversionFactor = 1024;


        // Convert kilobytes to megabytes using /= 
totalStorage /= conversionFactor;

        // Print the updated storage size
        System.out.println(totalStorage);  // Prints the storage size in MB
    }
}
