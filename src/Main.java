import game.characters.*;
import game.characters.Character;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import game.characters.Coordinates;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<Spearman> enemies = new ArrayList<>();
        List<Monk> enemies2 = new ArrayList<>();

        // Создаем координаты и пехотинца
        Coordinates spearmanCoordinates = new Coordinates(3, 4);
        Spearman team1 = new Spearman("Team1", spearmanCoordinates, enemies);
        Spearman team1Spear = new Spearman("Team1", spearmanCoordinates, enemies);


        Coordinates coordinatesTeam2 = new Coordinates(2,5);
        Monk team2 = new Monk("Team2",coordinatesTeam2,enemies2);

        // Добавляем противников в список
        Spearman enemy1 = new Spearman("Enemy1", new Coordinates(2, 3), new ArrayList<>());
        Spearman enemy2 = new Spearman("Enemy2", new Coordinates(2, 1), new ArrayList<>());
        Monk enemy3 = new Monk("EnemyM3", new Coordinates(2, 56), new ArrayList<>());
        Monk enemy4 = new Monk("EnemyM4", new Coordinates(4, 4), new ArrayList<>());

        // ... добавьте еще противников, если нужно
        enemies.add(enemy1);
        enemies.add(enemy2);
        enemies2.add(enemy3);
        enemies2.add(enemy4);

        // Вызываем метод step() для каждого раунда или по необходимости

        team2.setHealth(100);
        team2.setHealth(100);
        team1.setHealth(100);
        team1.setHealth(100);

        team2.step();


        team1.step();

        }
    }
