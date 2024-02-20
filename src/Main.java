import game.characters.*;
import game.characters.Character;
import java.util.Arrays;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Character[] characters = {
                new Archer("Archer1", new Coordinates(3, 5), 10),
                new Sniper("Sniper",new Coordinates(3,5),4)
        };

        Arrays.sort(characters, Comparator.comparingInt(Character::getInitiative).reversed());

        for (Character character : characters) {
            character.step();
        }

    }
}
