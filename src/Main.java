import game.characters.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rogue rogue = new Rogue();
        Sniper sniper = new Sniper();
        Crossbowman crossbowman = new Crossbowman();
        Monk monk = new Monk();
        Peasant peasant = new Peasant();
        Spearman spearman = new Spearman();
        Wizard wizard = new Wizard(100,50,100,50,"sword","cloth",0,true,50,"fireball",true,"Levitation",8);


        System.out.println(wizard);//Не совсем понял нужно ли создавать конструктор для каждого из наследников поэтому создал только для одного
        System.out.println(monk);
        System.out.println(crossbowman);
        System.out.println(spearman);
        System.out.println(peasant);
        System.out.println(rogue);
        System.out.println(sniper);



    }
}
