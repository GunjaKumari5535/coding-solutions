class Codechef {
    public static void main(String[] args) {
        int stockCount = 50, itemsPerPack = 6;

        int updatedStock = ++stockCount;  // Pre-increment stock count when new stock arrives
        int remainingItems = updatedStock%itemsPerPack; // Find leftover items after full packing

        System.out.println("Stocks after Pre-increment "+updatedStock);
        System.out.println("Leftover packs are "+remainingItems);
    }
}
