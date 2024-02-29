package game.characters;

import java.util.List;

public class Monk extends Character {
    private String martialArtsStyle;
    private int meditationLevel;
    private boolean isVegetarian;
    private int agilityBoost;
    private boolean hasHealingHands;
    private boolean isMartialArtsMaster;
    private String[] knownTechniques;
    private String mantra;




    private List<Spearman> enemies;

    public Monk(String name, Coordinates coordinates, List<Spearman> enemies) {
        super(name, coordinates, 2, 0);
        this.enemies = enemies;
    }

    @Override
    public void step() {
        if (isAlive()) {
            Spearman target = findNearestEnemy(); // Находит ближайшего противника
            System.out.println(getName() + " is taking a step.");
            if (target != null) {
                if (isAdjacent(target)) {
                    // Противник в соседней клетке, наносим удар
                    attack(target);
                } else {
                    // Противник в другой клетке, двигаемся в его направлении
                    moveTowardsEnemy(target);
                }
            }
        }
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

    private boolean isAdjacent(Character target) {
        int dX = Math.abs(target.getCoordinates().getX() - getCoordinates().getX());
        int dY = Math.abs(target.getCoordinates().getY() - getCoordinates().getY());

        return (dX == 1 && dY == 0) || (dX == 0 && dY == 1);
    }

    private boolean isAlive() {
        // Проверка, жив ли персонаж
        return health > 0;
    }

    private Spearman findNearestEnemy() {//  метод поиска врагов
        Spearman nearestEnemy = null;
        double minDistance = Double.MAX_VALUE;

        for (Spearman enemy : enemies) {
            double distance = enemy.getCoordinates().calculateDistance(getCoordinates());
            if (distance < minDistance) {
                minDistance = distance;
                nearestEnemy = enemy;
            }
        }
        return nearestEnemy;
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
