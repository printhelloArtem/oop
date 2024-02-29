package game.characters;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Spearman extends Character{
    private String spearType;
    private int blockingAbility;
    private boolean isPhalanxFormation;
    private int spearLength;
    private boolean hasThrowingSpears;
    private int chargingSpeed;
    private String battleCry;
    private boolean isShielded;
    private List<Spearman> enemies;


    public Spearman(String name, Coordinates coordinates,List<Spearman>enemies) {

        super(name, coordinates,1,1);

        this.enemies = enemies;
        // Конструктор по умолчанию без параметров



    }


    public List<Spearman> getEnemies() {
        return enemies;
    }

    public void setEnemies(List<Spearman> enemies) {
        this.enemies = enemies;
    }

    public void step() {
        if (isAlive()) {
            Spearman target = findNearestEnemy(); // Находит ближайшего противника
            System.out.println((getName() + " is taking a step."));
            if (target != null) {
                if (isAdjacent(target)) {
                    // Противник в соседней клетке, наносим удар
                    attack(target);
                } else {
                    // Противник в другой клетке, двигаемся в его направлении
                    moveTowardsEnemy(target);
                    attack(target);
                }
            }
        }
    }


    private boolean isAdjacent(Character target) {
        int dX = Math.abs(target.getCoordinates().getX() - getCoordinates().getX());
        int dY = Math.abs(target.getCoordinates().getY() - getCoordinates().getY());

        return (dX == 1 && dY == 0) || (dX == 0 && dY == 1);
    }

    private boolean isAlive() {
// Проверка, жив ли пехотинец
       boolean alive = health > 0;
        System.out.println(getName() + " is alive: " + alive);
        return alive;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    private void attack(Character target) {
// Просто выводим информацию об атаке в консоль
        System.out.println(getName() + " attacks " + target.getName() + "!");
    }

    private void moveTowardsEnemy(Spearman target) {
        int dX = target.getCoordinates().getX() - getCoordinates().getX();
        int dY = target.getCoordinates().getY() - getCoordinates().getY();

        if (Math.abs(dX) > Math.abs(dY)) {
            // Двигаемся по x
            getCoordinates().setX(getCoordinates().getX() + Integer.compare(dX, 0));
        } else {
            // Двигаемся по y
            getCoordinates().setY(getCoordinates().getY() + Integer.compare(dY, 0));
        }

        // Реализация движения
        System.out.println(getName() + " moves towards " + target.getName() + ".");
    }



    public Spearman findNearestEnemy() {
        List<Spearman> nearestEnemies = new ArrayList<>();
        double minDistance = Double.MAX_VALUE;

        for (Spearman enemy : enemies) {
            double distance = enemy.getCoordinates().calculateDistance(getCoordinates());
            if (distance < minDistance) {
                minDistance = distance;
                nearestEnemies.clear();
                nearestEnemies.add(enemy);
            } else if (distance == minDistance) {
                nearestEnemies.add(enemy);
            }
        }

        // Выбираем случайного врага из ближайших, если они есть
        if (!nearestEnemies.isEmpty()) {
            int randomIndex = new Random().nextInt(nearestEnemies.size());
            Spearman nearestEnemy = nearestEnemies.get(randomIndex);
            System.out.println(getName() + " found nearest enemy: " + nearestEnemy.getName());
            return nearestEnemy;
        }

        return null;
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
