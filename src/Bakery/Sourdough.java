package Bakery;

public class Sourdough extends Bread {
    private double starter;

    public Sourdough(){
        super();
        this.starter = 5.0;


    }

    public Sourdough(int flour, double water, int salt, int sugar, int bakingPowder,int yeast, String breadName,boolean state, String recipe, double starter){
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName,state, recipe);
        this.starter = starter;

    }

    //setter

    public void setStarter(double starter){this.starter = starter;}

    //getter

    public double getStarter(){return this.starter;}

    //ingredients

    public String getIngredients(){
        return String.format("%.2f cups of flour\n%.2f cups of water\n%.2f tsps of salt\n%.2f tsps of sugar\n%.2f tsps of baking powder\n%.2f tsps of yeast\n%.2d tablespoons of starter\n " + flour, water, salt, sugar, yeast,bake,starter);
    }

    //recipe

    public String recipe(){
        return "A recipe of Sourdough Bread:\n " +
        "1. Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter.\n" +
        "2. Make the dough\n" +
        "3. Bulk Rise\n" +
        "4. Stretch and fold the dough\n" +
        "5. Cut and shape the dough\n" +
        "6. Second rise\n" +
        "7. Preheat the oven to 450°F towards the tail end of the second rise.\n" +
        "8. Spray the loaf with luke warm water.\n" +
        "9. Bake the bread at 400°F for 20 minutes, until deep golden brown.\n" +
        "10. Remove the bread from the oven.\n" +
        "11.Let the bread cool until good to eat.\n";
        //Can't bake, Sourdough Bread is already baked.
        //The Sourdough Bread is baked now.
    }

    //toString

    public String toString(){
        return "Sourdough Bread";
    }
}
