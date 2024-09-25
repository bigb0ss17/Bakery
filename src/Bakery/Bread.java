package Bakery;

public abstract class Bread{
    private int sugar;
    private double water;


    public Bread(){

    }

    public Bread(int sugar, double Water){

    }

    public int getSugar(){return sugar;}

    public abstract void doSomething();


}
