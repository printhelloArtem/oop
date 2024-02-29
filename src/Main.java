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

        // Создаем координаты и пехотинца
        Coordinates spearmanCoordinates = new Coordinates(0, 0);
        Spearman team1 = new Spearman("Team1", spearmanCoordinates, enemies);

        Coordinates coordinatesTeam2 = new Coordinates(2,4);
        Spearman team2 = new Spearman("Team2",coordinatesTeam2,enemies);

        // Добавляем противников в список
        Spearman enemy1 = new Spearman("Enemy1", new Coordinates(2, 3), new ArrayList<>());
        Spearman enemy2 = new Spearman("Enemy2", new Coordinates(2, 1), new ArrayList<>());
        // ... добавьте еще противников, если нужно
        enemies.add(enemy1);
        enemies.add(enemy2);
        // Вызываем метод step() для каждого раунда или по необходимости

        team2.setHealth(100);
        team1.setHealth(100);
        team1.setHealth(100);
        team1.setHealth(100);

        team2.step();
        team1.step();
        team1.step();
        team1.step();
        }
    }
