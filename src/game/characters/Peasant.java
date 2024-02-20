package game.characters;

public class Peasant extends Character {
    private int experience;
    private int gold;
    protected int agility;
    protected int intelligence;
    protected int luck;
    protected int charisma;
    protected int dexterity;

    public Peasant(String name, Coordinates coordinates) {
        super(name, coordinates,1,0);
    }


    public void findNearestEnemy(Peasant[] enemies) {
        Peasant nearestEnemy = null;
        double minDistance = Double.MAX_VALUE;

        for (Peasant enemy : enemies) {
            double distance = enemy.getCoordinates().calculateDistance(getCoordinates());
            if (distance < minDistance) {
                minDistance = distance;
                nearestEnemy = enemy;
            }
        }

        System.out.println(getName() + " found nearest enemy: " + nearestEnemy.getName());
    }




    // Конструктор, геттеры, сеттеры

    public void step() {
    }


    @Override
    public void attack() {
        System.out.println("Peasant attacks with a pitchfork to the chest");
    }

    @Override
    public void defend() {
        System.out.println("Peasant defends with a shield");
    }

    @Override
    public void heal() {
        System.out.println("Peasant restores energy");
    }
}


