package game.characters;

public class Monk extends Character{
    private String martialArtsStyle;
    private int meditationLevel;
    private boolean isVegetarian;
    private int agilityBoost;
    private boolean hasHealingHands;
    private boolean isMartialArtsMaster;
    private String[] knownTechniques;
    private String mantra;

    public Monk(String name, Coordinates coordinates) {
        super(name, coordinates);
    }


    public void findNearestEnemy(Monk[] enemies) {
        Monk nearestEnemy = null;
        double minDistance = Double.MAX_VALUE;

        for (Monk enemy : enemies) {
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
        System.out.println("Monk delivers a powerful martial arts strike");
    }

    @Override
    public void defend() {
        System.out.println("Monk enters a defensive stance");
    }

    @Override
    public void heal() {
        System.out.println("Monk meditates for healing");
    }
}
