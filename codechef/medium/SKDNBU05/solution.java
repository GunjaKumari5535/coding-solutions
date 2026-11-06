class Codechef {
    public static void main(String[] args) {
        // Given variables: Prices of two items and a discount amount
        int itemPrice1 = 50, itemPrice2 = 30, discount = 10;

        // Calculate total price before discount
 int totalPrice = itemPrice1+ itemPrice2;

        // Apply discount to get the final price

int finalPrice = totalPrice - discount; 
        // Calculate average price per item after discount
 int averagePrice = finalPrice/2;
 

        // Print the final bill details
        System.out.println("Total Price is : "+totalPrice);    // Prints total price before discount
        System.out.println("Final Price after the discount is : "+finalPrice);    // Prints final price after discount
        System.out.println("Average Price is : "+averagePrice);  // Prints average price per item
    }
}
