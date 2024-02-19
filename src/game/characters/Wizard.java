package game.characters;

public class Wizard extends Character{
    private String staffType;
    private int magicPower;
    private boolean hasFamiliar;
    private int manaPool;
    private String favoriteSpell;
    private boolean isTeleportationMaster;
    private String knownSpells;
    private int meditationLevel;

    public Wizard(

            String name,Coordinates coordinates

    ) {
        super(name,coordinates);


    }
    public void findNearestEnemy(Wizard[] enemies) {
        Wizard nearestEnemy = null;
        double minDistance = Double.MAX_VALUE;

        for (Wizard enemy : enemies) {
            double distance = calculateDistance(enemy.getCoordinates());
            if (distance < minDistance) {
                minDistance = distance;
                nearestEnemy = enemy;
            }
        }

        System.out.println(getName() + " found nearest enemy: " + nearestEnemy.getName());
    }

    private double calculateDistance(Coordinates enemyCoordinates) {
        int xDiff = getCoordinates().getX() - enemyCoordinates.getX();
        int yDiff = getCoordinates().getY() - enemyCoordinates.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }


    @Override
    public void attack() {
        System.out.println("Wizard casts a powerful spell");
    }

    @Override
    public void defend() {
        System.out.println("Wizard creates a magical barrier");
    }

    @Override
    public void heal() {
        System.out.println("Wizard uses a healing potion");
    }

}
