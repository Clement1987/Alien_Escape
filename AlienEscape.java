import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlienEscape {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> equipement = new ArrayList<>();
    private static MyAlien alien = new MyAlien("name");
    private static String playerAnswer;

    public static void main (String[] args) {
        //Title début

        LaunchGame();

        //Title fin
    }

    public static void LaunchGame() {

        stay();

    }

    //SANDRA



    //CLEMENT



    //QUENTIN

    public static void stay () {
        String question = "Souhaitez-vous sortir de votre cellule et explorer la Zone 51 ?";
        String[] answerList = new String[] {"Oui","Non"};
        playerAnswer = choice (question, answerList);
    }

    //GLOBAL

    public static void say (String message) {
        System.out.println(message);
    }

    public static String choice (String question, String[] choices) {
        String[] answerIndex = new String [choices.length];
        for (int j = 0; j < choices.length; j++) {
            answerIndex[j] = Integer.toString(j+1);
        }
        String[] answerList = choices;
		String pAnswer = "";
		while (!Arrays.asList(answerIndex).contains(pAnswer)) {
            say(question);
            say("");
            for (int i = 0; i < answerList.length; i++) {
                say( "< " + answerIndex[i] + " > " + answerList[i]);
            }
            say("");
            System.out.print("Answer : ");
            pAnswer = sc.nextLine();
            say("");
        }
        return pAnswer;
    }

}