package Bakery;

public class Pastry extends Bread{
    private int eggs;
    private int butter;

    //no parameter constructor
    public Pastry (){
        super();
        this.eggs = 2;
        this.butter = 2;

    }

    //constructor
    public Pastry(int flour, double water, int salt, int sugar, int bakingPowder,int yeast, String breadName,boolean state, String recipe, int eggs, int butter){
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName,state, recipe);
        this.eggs = eggs;
        this.butter = butter;
    }

    //setter

    public void setEggs(int eggs){this.eggs = eggs;}
    public void setButter(int Butter){this.butter = butter;}

    //getter

    public int getEggs(){return this.eggs;}
    public int getButter(){return this.butter;}

    //recipe

    public String recipe(){
        return "A recipe for a Pastry: \n" +
                "Mix flour, salt, and sugar.\n" +
                "Add butter and eggs \n" +
                "Add water\n" +
                "Stir and then chill the dough for 30 minutes. \n" +
                "Roll and bake at 375 fahrenheit for 15 - 20 minutes.";

    }

    //getIngredients

    public String getIngredients(){
        return super.getIngredients() + eggs + "eggs \n" + butter + " butter";
    }

    //toString method

    public String toString(){
        return "Pastry";
    }
}
