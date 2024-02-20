import game.characters.*;
import game.characters.Character;
import java.util.Arrays;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Character[] characters = {
                new Archer("Archer1", new Coordinates(3, 5), 10),  //   инициатива 0
                new Sniper("Sniper",new Coordinates(3,5),4),// инициатива 0
                new Wizard("Wizard",new Coordinates(4,7),100)// инициатива 1
        };


        Arrays.sort(characters, Comparator.comparingInt(Character::getInitiative).reversed());

        for (Character character : characters) {
            character.step();
        }
        /*
        ПОЖАЛУЙСТА ЕСЛИ ЧТО ТО НЕ ТАК ДАЙТЕ ВТОРОЙ ШАНС ИСПРАВИТЬ!СПС
         */



    }

}
