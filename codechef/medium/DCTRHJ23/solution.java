class Codechef {
    public static void main(String[] args) {
        // Declaring a String
        String originalMessage = "Java Programming";
        
        // try to update original string
        originalMessage.concat(" is fun!");
        
        // Concatenating a new string (creates a new string object)
        String newMessage = originalMessage.concat(" is fun!");
        
        // Printing both the original and new string
        System.out.println("Original Message: " + originalMessage); // Output: Java Programming
        System.out.println("New Message: " + newMessage); // Output: Java Programming is fun!
    }
}
