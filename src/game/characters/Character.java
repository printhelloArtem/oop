package game.characters;

public abstract class Character {
    protected int health;
    protected int strength;
    protected int defense;

    private Coordinates coordinates; // добавлено поле для хранения координат
    private String name;
    public Character(String name,Coordinates coordinates ) {
        this.name = name;
        this.coordinates = coordinates;

    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
    public String getName() {
        return name;
    }



    public abstract void attack();

    public abstract void defend();

    public abstract void heal();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}