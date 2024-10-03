package Bakery;

public class StrawberryShortCake extends Bread{
    private int strawberries;

    //no parameter
    public StrawberryShortCake(){
        super();
        this.strawberries = 5;
    }
    //constructor
    public StrawberryShortCake(int flour, double water, int salt, int sugar, int bakingPowder,int yeast, String breadName,boolean state, String recipe, int strawberries){
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state, recipe);
        this.strawberries = strawberries;

    }

    //setter

    public void setStrawberries(int strawberries){this.strawberries = strawberries;}

    //getter

    public int getStrawberries(){return strawberries;}

    //getIngredients

    public String getIngredients(){
        return super.getIngredients() + strawberries + " strawberries";
    }

    //recipe

    public String recipe(){
        return "This is a recipe for Strawberry Shortcake\n "+
                "Cut the strawberries and let them sit in some sugar to draw in their juices for 30 minutes \n " +
                "Mix the dry ingredients \n" +
                "preheat the oven to 400 fahrenheit, then pour out the dough and roll it out onto a tray with a sheet on it. \n" +
                "Bake for 12 - 15 minutes. \n" +
                "After baking, assemble the cake. Add the strawberry in between each layer.";
    }

}
