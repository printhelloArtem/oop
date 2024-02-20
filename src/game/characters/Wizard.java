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

    private int mana;

    public Wizard(String name,Coordinates coordinates,int mana){


        super(name,coordinates,1);
        this.mana = mana;






    }
    public void findNearestEnemy(Wizard[] enemies) {
        Wizard nearestEnemy = null;
        double minDistance = Double.MAX_VALUE;

        for (Wizard enemy : enemies) {
            double distance = enemy.getCoordinates().calculateDistance(getCoordinates());
            if (distance < minDistance) {
                minDistance = distance;
                nearestEnemy = enemy;
            }
        }


        System.out.println(getName() + " found nearest enemy: " + nearestEnemy.getName());
    }

    public void step() {
        if (isAlive() && mana > 0) {
            findNearestEnemy();
            shoot();
            decreaseArrows();
        }
    }

    private boolean isAlive() {
        return true; // Проверка, жив ли маг
    }

    public void decreaseArrows() {
       mana--;
        System.out.println("pull: " + (mana));
    }

    private void shoot() {
        System.out.println(getName() + " shoots!");
    }

    private void findNearestEnemy() {
        System.out.println(getName() + " found nearest enemy and aims.");
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
