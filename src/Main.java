import game.characters.*;
import game.characters.Character;
import java.util.Arrays;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Archer archerTeam1 = new Archer("ArcherFirstTeam", new Coordinates(3, 5), 10);  //  команда 1, инициатива 0
        Wizard wizardTeam1 = new Wizard("WizardFirstTeam", new Coordinates(3, 5), 10);//командла 1.инициатива 1
        Sniper sniperTeam0 = new Sniper("SniperSecondTeam", new Coordinates(3, 7), 10); //команда 0, инициатива 0
        Crossbowman crossbowmanTeam0 = new Crossbowman("CrossbowmanSecondTeam", new Coordinates(4, 6), 10);// команда 0,инициат 4

        Character[] characters = {archerTeam1, wizardTeam1, sniperTeam0, crossbowmanTeam0};


        Arrays.sort(characters, Comparator.comparingInt(Character::getInitiative).reversed());

        int currentTeam = characters[0].getInitiative();  // Инициализируем текущую команду значением первого персонажа

        System.out.println("Первой ходит команда: " + (currentTeam == 0 ? "Команда 0" : "Команда 1"));

        for (Character character : characters) {
            if (currentTeam != character.getInitiative()) {
                currentTeam = character.getInitiative();
                System.out.println("Следующей ходит команда: " + (currentTeam == 0 ? "Команда 0" : "Команда 1"));
            }

            character.step();
        }
    }
}