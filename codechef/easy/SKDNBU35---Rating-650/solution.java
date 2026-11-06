class Codechef {
    public static void main(String[] args) {
        // Given variables: Initial stock, new stock added, and damaged units
        int initialStock = 500, newStock = 200, damagedUnits = 50, storageA, storageB, storageC;

        // Adjust initialStock by adding newStock and subtracting damagedUnits
initialStock = initialStock+ newStock - damagedUnits;



        // Assign the final stock count to all storage locations using chained assignment
 storageA=storageB=storageC=initialStock;

        // Print updated stock values in all storage locations
        System.out.println(storageA);
        System.out.println(storageB);
        System.out.println(storageC);
    }
}
