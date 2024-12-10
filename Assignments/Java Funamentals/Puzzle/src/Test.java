import java.util.ArrayList;
import java.util.Random;
public class Test {
    public static void main(String[] args) {
        PuzzleJava puzzleJava = new PuzzleJava();


        System.out.println(puzzleJava.getTenRolls());
        System.out.println(puzzleJava.getRandomLetter());
        System.out.println(puzzleJava.generatePassword());

        for (int i=0 ; i<puzzleJava.getNewPasswordSet(100).length;i++){
            System.out.println(puzzleJava.getNewPasswordSet(100)[i]);
        }
    }



}
