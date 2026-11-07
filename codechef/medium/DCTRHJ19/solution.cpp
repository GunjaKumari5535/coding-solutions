class Codechef {
    public static void main(String[] args) {
        // Declaring strings for street, city, and country
        String street = "123 Main St";
        String city = "Springfield";
        String country = "USA";

        // Concatenating strings using concat() method
        String fullAddress = street.concat(", ").concat(city).concat(", ").concat(country);

        // Printing the concatenated address
        System.out.println("Full Address: " + fullAddress);
    }
}