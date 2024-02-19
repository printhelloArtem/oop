import game.characters.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Coordinates monkCoordinates = new Coordinates(3, 5);
        Monk monk = new Monk("Monk", monkCoordinates);
        Coordinates peasantCoordinates = new Coordinates(4, 6);
        Peasant peasant = new Peasant("Peasant", peasantCoordinates);
        Coordinates rogueCoordinates = new Coordinates(4, 6);
        Rogue rogue = new Rogue("Rogue", rogueCoordinates);
        Coordinates sniperCoordinates = new Coordinates(5, 8);
        Sniper sniper = new Sniper("Sniper", sniperCoordinates);
        Coordinates wizardCoordinates = new Coordinates(6, 5);
        Wizard wizard = new Wizard("Wizard", wizardCoordinates);
        Coordinates spearmanCoordinates = new Coordinates(3, 5);
        Spearman spearman = new Spearman("spearman", spearmanCoordinates);
        Coordinates archerCoordinates = new Coordinates(6, 8);
        Archer archer = new Archer("Archer", archerCoordinates);


        Monk[] enemies2 = {
                new Monk("Monk", new Coordinates(3, 5)),
                new Monk("Monk", new Coordinates(3, 4))
        };
        Peasant[] enemies = {
                new Peasant("Enemy1", new Coordinates(7, 2)),
                new Peasant("Enemy2", new Coordinates(2, 8)),

        };
        Rogue[] enemies3 = {
                new Rogue("Enemy", new Coordinates(9, 5)),
                new Rogue("Enemy2", new Coordinates(3, 5))
        };


        Sniper[] enemies4 = {
                new Sniper("Enemy", new Coordinates(7, 5)),
                new Sniper("Enemy2", new Coordinates(3, 5))
        };


        Spearman[] enemies5 = {
                new Spearman("Enemy", new Coordinates(8, 5)),
                new Spearman("Enemy2", new Coordinates(7, 6))
        };


        Wizard[] enemies6 = {
                new Wizard("Enemy", new Coordinates(9, 5)),
                new Wizard("Enemy2", new Coordinates(5, 8))
        };


        Archer[] enemies7 = {
                new Archer("Enemy", new Coordinates(9, 5)),
                new Archer("Enemy2", new Coordinates(5, 8))
        };


        monk.findNearestEnemy(enemies2);
        peasant.findNearestEnemy(enemies);
        wizard.findNearestEnemy(enemies6);
        archer.findNearestEnemy(enemies7);
        spearman.findNearestEnemy(enemies5);
        rogue.findNearestEnemy(enemies3);
        sniper.findNearestEnemy(enemies4);


    }
}
