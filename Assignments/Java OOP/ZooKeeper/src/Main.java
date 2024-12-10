//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();

        gorilla.eatBananas();
        gorilla.eatBananas();

        gorilla.climb();

        gorilla.displayEnergy();

        Bat bat = new Bat();
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();

        bat.eatHumans();
        bat.eatHumans();
        

        bat.fly();
        bat.fly();


        bat.displayEnergy();

    }

}