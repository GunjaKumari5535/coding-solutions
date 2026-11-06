class Codechef {
    public static void main(String[] args) {
        // Given variables: Initial parcels, new arrivals, and number of trucks
        int currentParcels = 250, newParcels = 80, totalTrucks = 7;

        // Add new parcels to current stock
int totalParcles =  currentParcels+ newParcels;

        // Find undelivered parcels using %= after distributing equally among trucks
totalParcles %= totalTrucks;

        //  Print the number of undelivered parcels

System.out.println(totalParcles);
    }
}
