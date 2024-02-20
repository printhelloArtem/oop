package game.characters;

public class Crossbowman extends Character{

        private String crossbowType;
        private int reloadSpeed;
        private int boltAccuracy;
        private boolean hasExplosiveBolts;
        private int aimingTime;
        private boolean isCrouched;
        private int camouflageSkill;
        private String[] knownBoltTypes;
        private  int arrows;

        public Crossbowman(String name, Coordinates coordinates, int arrows) {
            super(name, coordinates, 4,0);
            this.arrows = arrows;


        }

    public void findNearestEnemy(Sniper[] enemies) {
        Sniper nearestEnemy = null;
        double minDistance = Double.MAX_VALUE;

        for (Sniper enemy : enemies) {
            double distance = enemy.getCoordinates().calculateDistance(getCoordinates());
            if (distance < minDistance) {
                minDistance = distance;
                nearestEnemy = enemy;
            }
        }

        System.out.println(getName() + " found nearest enemy: " + nearestEnemy.getName());
    }

    public void step() {
        if (isAlive() && arrows > 0) {
            findNearestEnemy();
            shoot();
            decreaseArrows();
        }
    }

    private void shoot() {
        System.out.println(getName() + " shoots!");
    }

    public void decreaseArrows() {
        arrows --;
        System.out.println("bullets: " + (arrows));
    }

    private boolean isAlive() {
        return true; // Проверка, жив ли снайпер
    }

    private void findNearestEnemy() {
        System.out.println(getName() + " found nearest enemy and aims.");
    }

    public int getArrows() {
        return arrows;
    }

        @Override
        public void attack() {
            System.out.println("Crossbowman shoots with a crossbow");
        }

        @Override
        public void defend() {
            System.out.println("Crossbowman takes cover");
        }

        @Override
        public void heal() {
            System.out.println("Crossbowman applies a healing salve");
        }
    }


