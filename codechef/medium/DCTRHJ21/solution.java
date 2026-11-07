class Codechef {
    public static void main(String[] args) {
        // Given Variables
        String customerName = "Alice";
        String orderedDish = "Pasta";
        double totalPrice = 12.99;

        // Using concat() method to create the order summary...Complete the remaining code
        String orderSummary = "Customer: ".concat(customerName)
                                    .concat("\nOrdered Dish: ")
                                    .concat(orderedDish)
                                    .concat("\nTotal Price: $")
                                    .concat(String.valueOf(totalPrice))
                                    .concat("\nOrder Summary: ")
                                    .concat(customerName)
                                    .concat(" ordered ")
                                    .concat(orderedDish)
                                    .concat(".  The total price is $")
                                    .concat(String.valueOf(totalPrice))
                                    .concat(".");
                                

        // Print the final order summary
        System.out.println(orderSummary);
    }
}
