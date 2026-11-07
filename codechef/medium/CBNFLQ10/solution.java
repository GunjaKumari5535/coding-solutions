class RecipeAdjuster {
    public static void main(String[] args) {
        int originalServings = 24; // Original recipe makes 24 cookies
        double flourCups = 2.5;
        double chocoChipsOunces = 8.0;

        //Triple the recipe quantities.
        
        flourCups *=3;
        chocoChipsOunces *=3;
        
        

        //Adjust chocolate chips. The baker only has enough for half of the tripled amount.
        
        chocoChipsOunces /= 2;

    
        System.out.println(flourCups);
        System.out.println(chocoChipsOunces);
    }
}