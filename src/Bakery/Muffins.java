package Bakery;

public class Muffins extends Bread {
    private String fillings;

    //non parameter
    public Muffins(){
        super();
        this.fillings = "blueberry";
    }

    //constructor
    public Muffins(int flour, double water, int salt, int sugar, int bakingPowder,int yeast, String breadName,boolean state, String recipe, int eggs, int butter){
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName,state, recipe);
        this.fillings = fillings;
    }

    //setter
    public void setFillings (String fillings){this.fillings = fillings;}

    //getter
    public String getFillings(){return this.fillings;}

    //ingredients

    public String getIngredients(){
        return super.getIngredients() + fillings + " fillings";
    }

    //recipe

    public String recipe(){
        return "Recipe for Muffins: \n" +
                "Preheat the oven for 375 fahrenheit and line the muffin tin with liners or grease them \n" +
                "Mix your dry ingredients like flour, sugar, baking powder, salt \n" +
                "Combine the wet ingredients like water \n" +
                "Mix in the filling. \n" +
                "Fill the tins with the batter and bake for 18n - 20 minutes.";
    }

}
