class Codechef {
    public static void main(String[] args) {
        int purchases = 3; // Initial number of purchases

        // Calculating discount with pre-increment
        int discount = ++purchases * 2;

        // Printing discount and remaining purchases
        System.out.println("Discount Percentage: " + discount + "%");
        System.out.println("Remaining Purchases: " + --purchases);
    }
}