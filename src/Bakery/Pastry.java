package Bakery;

public class Pastry extends Bread{
    private int eggs;
    private String filling;

    //no parameter constructor
    public Pastry (){
        super();
        this.eggs = 2;
        this.filling = "cream";

    }

    //constructor
    public Pastry(int flour, double water, int salt, int sugar, int bakingPowder,int yeast, String breadName,boolean state, String recipe, int eggs, String filling){
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName,state, recipe);
        this.eggs = eggs;
        this.filling = filling;
    }

    //setter

    public void setEggs(int eggs){this.eggs = eggs;}
    public void setFilling(String Filling){this.filling = filling;}

    //getter

    public int getEggs(){return this.eggs;}
    public String getFilling(){return this.filling;}

    //toString method

    public String toString(){
        return "Pastry";
    }
}
