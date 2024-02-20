package game.characters;

 public class Archer extends Character {

     private int arrows;

     public Archer(String name, Coordinates coordinates, int arrows) {
         super(name, coordinates, 0);
         this.arrows = arrows;
     }

     public int getArrows() {
         return arrows;
     }

     @Override
     public void step() {
         if (isAlive() && arrows > 0) {
             findNearestEnemy();
             shoot();
             decreaseArrows();
         }
     }

     public void findNearestEnemy(Archer[] enemies) {
         Archer nearestEnemy = null;
         double minDistance = Double.MAX_VALUE;

         for (Archer enemy : enemies) {
             double distance = enemy.getCoordinates().calculateDistance(getCoordinates());
             if (distance < minDistance) {
                 minDistance = distance;
                 nearestEnemy = enemy;
             }
         }

         System.out.println(getName() + " found nearest enemy: " + nearestEnemy.getName());
     }

     private void findNearestEnemy() {
         System.out.println(getName() + " found nearest enemy and aims.");
     }

     private void shoot() {
         System.out.println(getName() + " shoots!");
     }

     private boolean isAlive() {
         return true; // Проверка, жив ли лучник
     }

     public void decreaseArrows() {
         arrows--;
         System.out.println("bullets: " + (arrows));
     }


     @Override
     public void attack() {
         System.out.println(getName() + " attacks with a bow");
     }

     @Override
     public void heal() {
         System.out.println(getName() + " uses a healing potion");
     }

     @Override
     public void defend() {
         System.out.println(getName() + " defends with a shield");
     }
 }