import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    public ArrayList<Integer> getTenRolls (){
        Random random = new Random();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            num.add(random.nextInt(20));
        }
        return num;


    }


    /* Return the random letter. */
     public char getRandomLetter(){
        //declare array contain all letters
        char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        //generate random number bettween 0 to 25
        Random random = new Random();
        int randletter=random.nextInt(26);

        char randomLetter=letters[randletter];

        return randomLetter;

    }
    /* generatePassword of 8 chars */
    public String generatePassword(){
        //declare string contain all letter and convert letter to chracter array
        char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String password="";
        Random random = new Random();
        for (int i=0 ;i<8;i++){
            int randletter=random.nextInt(26);
            char randomLetter=letters[randletter];
            password += randomLetter;
        }
        return password;
    }

    /* List of generatePassword of 8 chars  */
    public String[] getNewPasswordSet(int arraySize){
        String[] wordsList= new String[arraySize];
        for(int i=0 ;i<arraySize;i++){
            wordsList[i]=generatePassword();
        }

        return wordsList;
    }




}
