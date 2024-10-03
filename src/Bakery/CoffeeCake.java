package Bakery;

public class CoffeeCake {
    private double coffee;

    public CoffeeCake(){
        super();
        this.coffee = 3.0;
    }

    public CoffeeCake(int flour, double water, int salt, int sugar, int bakingPowder, int yeast, String breadName, Boolean state, String recipe, double coffee){
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state, recipe);
        this.coffee = coffee;
    }

    //setter

    public void setCoffee(double coffee){this.coffee = coffee;}

    //getter

    public double getCoffee(){return this.coffee;}

    //getIngredients

    public String getIngredients(){
        return super.getIngredients() + coffee + " coffee";
    }

    //recipe
    public String recipe(){
        return "This is a recipe for Coffee Cake\n " +
                "Mix the dry ingredients and then add the coffee \n" +
                "Pour the batter into a baking tray \n" +
                "preheat the oven to 400 fahrenheit, then put the tray in \n" +
                "Bake for 12 - 15 minutes.";
    }

    //toString

    public String toString(){
        return "CoffeeCake";
    }


}
