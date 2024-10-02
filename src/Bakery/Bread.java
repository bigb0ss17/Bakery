package Bakery;

public class Bread{
    private int sugar;
    private double water;
    private int flour;
    private int salt;
    private int bakingPowder;
    private int yeast;

    private String breadName;


    private Boolean state;
    private String recipe;

    //constructors


    public Bread(){
        this(1,1.0,1,1,1,1,"Bread Name",false,"Some recipe");

    }

    public Bread(int flour, double water, int salt, int sugar, int bakingPowder, int yeast, String breadName, Boolean state, String recipe){
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.state = state;
        this.recipe = recipe;
    }

    //setter
    public void setFlour(int flour){this.flour = flour;}
    public void setWater(double water){this.water = water;}
    public void setSalt(int salt){this.salt = salt;}
    public void setSugar(int sugar){this.sugar = sugar;}
    public void setBakingPowder(int bakingPowder){this.bakingPowder = bakingPowder;}
    public void setYeast(int yeast){this.yeast = yeast;}
    public void setBreadName(String breadName){this.breadName = breadName;}
    public void getState(Boolean state){this.state = state;}
    public void setRecipe(String recipe){this.recipe = recipe;}


    //getter
    public int getFlour(){return this.flour;}
    public double getWater(){return this.water;}
    public int getSalt(){return this.salt;}
    public int getSugar(){return this.sugar;}
    public int getBakingPowder(){return this.bakingPowder;}
    public int getYeast(){return this.yeast;}
    public String getBreadName(){return this.breadName;}
    public Boolean getState(){return this.state;}
    public String getRecipe(){return this.recipe;}

    //Baked method
    public String bake(){
        if (state){
            return "Baked.";
        } else
            return "Not baked.";
    }

    //getIngredients

    public String getIngredients(){
        return String.format("%.2f cups of flour\n%.2f cups of water\n%.2f tsps of salt\n%.2f tsps of sugar\n%.2f tsps of baking powder\n%.2f tsps of yeast",
                flour, water, salt, sugar, bakingPowder, yeast);
    }


}
