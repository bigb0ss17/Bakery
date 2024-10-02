package Bakery;

public class StrawberryShortCake extends Bread{
    private int strawberries;

    //constructors
    public StrawberryShortCake(){
        super();
        this.strawberries = 5;
    }
    //no parameter
    public StrawberryShortCake(int flour, double water, int salt, int sugar, int bakingPowder,int yeast, String breadName,boolean state, String recipe, int strawberries){
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state, recipe);
        this.strawberries = strawberries;

    }

    //setter

    public void setStrawberries(int strawberries){this.strawberries = strawberries;}

    //getter

    public int getStrawberries(){return strawberries;}

}
