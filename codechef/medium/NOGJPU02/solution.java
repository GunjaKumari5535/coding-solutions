
class ReadingTracker {
    public static void main(String[] args) {
        // Step 1: Declare and initialize totalPages and pagesRead
int totalPages = 350;
int pagesRead = 0;

        // Step 2: Print initial status
        
System.out.println("Initial Reading Status: ");
        // Step 3: Update pagesRead after the first session (user read 50 pages)
      
        System.out.println("Total Pages: "+ totalPages+ ", Pages Read: "+ pagesRead);
        

        // Step 4: Print status after the first session
        System.out.println("After first session: ");
  pagesRead = pagesRead + 50;
        // Step 5: Update pagesRead after the second session (user has read 75 more)
        
        System.out.println("Total Pages: "+ totalPages+ ", Pages Read: "+pagesRead);

        // Step 7: Print final status
        pagesRead = pagesRead+ 75;
        System.out.println("After second session: ");
        System.out.println("Total Pages: "+ totalPages+ ", Pages Read: "+ pagesRead);
    }
}