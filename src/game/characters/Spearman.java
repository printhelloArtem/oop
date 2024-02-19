package game.characters;

public class Spearman extends Character{
    private String spearType;
    private int blockingAbility;
    private boolean isPhalanxFormation;
    private int spearLength;
    private boolean hasThrowingSpears;
    private int chargingSpeed;
    private String battleCry;
    private boolean isShielded;

    public Spearman(String name, Coordinates coordinates) {

        super(name, coordinates);
        // Конструктор по умолчанию без параметров


    }


    public void findNearestEnemy(Spearman[] enemies) {//  метод поиска врагов
        Spearman nearestEnemy = null;
        double minDistance = Double.MAX_VALUE;

        for (Spearman enemy : enemies) {
            double distance = enemy.getCoordinates().calculateDistance(getCoordinates());
            if (distance < minDistance) {
                minDistance = distance;
                nearestEnemy = enemy;
            }
        }

        System.out.println(getName() + " found nearest enemy: " + nearestEnemy.getName());
    }


    @Override
    public void attack() {
        System.out.println("Spearman thrusts with a powerful spear");
    }

    @Override
    public void defend() {
        System.out.println("Spearman blocks with the spear");
    }

    @Override
    public void heal() {
        System.out.println("Spearman uses a bandage for healing");
    }
}
