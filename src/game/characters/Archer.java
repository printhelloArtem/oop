package game.characters;

 public class Archer extends Character {
     public Archer(String name, Coordinates coordinates) {
         super(name, coordinates);
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