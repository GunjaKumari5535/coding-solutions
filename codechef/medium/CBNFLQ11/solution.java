class BookstoreInventory {
    public static void main(String[] args) {
         int initialStock = 150;
         int receivedStock = 75;
         int soldStock = 45;
          int currentStock = initialStock;
          int finalStock =  initialStock + receivedStock- soldStock;
        System.out.println("Final stock: "+ finalStock);
        
        
    }
}