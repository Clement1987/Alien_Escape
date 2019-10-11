import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlienEscape {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> equipement = new ArrayList<>();

    public static void main (String[] args) {
        //Title début

        LaunchGame();

        //Title fin
    }

    public static void LaunchGame() {   


    }

    //SANDRA



    //CLEMENT



    //QUENTIN
    

    //GLOBAL

    public static void say (String message) {
        System.out.println(message);
    }

    public static String choice (String question, String[] choices) {
        String[] answerIndex = new String [] {"1", "2", "3", "4", "5"};
        String[] answerList = choices;
		String playerAnswer = "";
		while (!Arrays.asList(answerList).contains(playerAnswer)) {
            say(question);
            say("");
            for (int i = 0; i < answerList.length; i++) {
                say( "< " + answerIndex[i] + " > " + answerList[i]);
            }
            say("");
            playerAnswer = sc.nextLine();
        }
        return playerAnswer;
    }

}