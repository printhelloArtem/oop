package game.characters;

public class Sniper extends Character {

        private String rifleType;
        private int accuracy;
        private boolean isCamouflaged;
        private int bulletVelocity;
        private String preferredDistance;
        private boolean hasSilencer;
        private int camouflageSkill;
        private String[] knownSnipingLocations;

        public Sniper(String name,Coordinates coordinates) {
            // Конструктор по умолчанию без параметров
                super(name,coordinates);
        }


        public void findNearestEnemy(Sniper[] enemies) {
                Sniper nearestEnemy = null;
                double minDistance = Double.MAX_VALUE;

                for (Sniper enemy : enemies) {
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
            System.out.println("Sniper takes a precise shot");
        }

        @Override
        public void defend() {
            System.out.println("Sniper finds cover");
        }

        @Override
        public void heal() {
            System.out.println("Sniper uses a medical kit");
        }
    }
