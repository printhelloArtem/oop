package game.characters;



public class Rogue extends Character {
    private int stealth;
    private int theftExperience;
    private String favoriteWeapon;
    private String disguise;
    private boolean isPoisoned;
    private int lockpickingSkill;
    private String[] knownPoisons;
    private int agilityBoost;

    public Rogue(String name,Coordinates coordinates) {

        // Конструктор по умолчанию без параметров
        super(name,coordinates,2,0);
    }

    public void findNearestEnemy(Rogue[] enemies) {
        Rogue nearestEnemy = null;
        double minDistance = Double.MAX_VALUE;

        for (Rogue enemy : enemies) {
            double distance = enemy.getCoordinates().calculateDistance(getCoordinates());
            if (distance < minDistance) {
                minDistance = distance;
                nearestEnemy = enemy;
            }
        }

        System.out.println(getName() + " found nearest enemy: " + nearestEnemy.getName());
    }

    public void step() {
    }


    @Override
    public void attack() {
        System.out.println("Rogue performs a backstab");
    }

    @Override
    public void defend() {
        System.out.println("Rogue dodges the attack");
    }

    @Override
    public void heal() {
        System.out.println("Rogue uses poison for healing");
    }
}
