package game.characters;

public abstract class Character implements Steppable  {
    protected int health;
    protected int strength;
    protected int defense;

    private int initiative;

    private Coordinates coordinates; // добавлено поле для хранения координат
    private String name;

    public Character(String name,Coordinates coordinates,int initiative ) {
        this.name = name;
        this.coordinates = coordinates;
        this.initiative = initiative;

    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
    public String getName() {
        return name;
    }

    public int getInitiative() {
        return initiative;
    }




    @Override
    public  void step(){

    }
    public abstract void attack();

    public abstract void defend();

    public abstract void heal();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}