import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlienEscape {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> equipement = new ArrayList<>();
    private static MyAlien alien = new MyAlien("name");
    private static String playerAnswer;
    private static boolean playing;

    public static void main (String[] args) {
        //Title début

        playing = true;
        LaunchGame();

        //Title fin
    }

    public static void LaunchGame() {


        if (playing) stay(); 
        priest();


    }

    //SANDRA
        public static void kitchen() {
            say("Vous poussez la porte, immmédiatement une forte odeur de curry vous pique les recepteurs olfactifs. La faible lueur d'un feu étrange éclaire la pièce. " 
                + "Dans le récipient au dessus du feu, vous distinguez des denrées humaines sous forme liquide.");
            
            String question = "\nVous nourir un peu serait une bonne idée, mais vous ne savez pas si votre métabolisme sera s'adapter...";
            String[] choices = {"Se nourir", "Sortir sans rien toucher"};

            playerAnswer = choice(question, choices);

            if(playerAnswer.equals("1")) {
                say("Affamé, vous vous saisisez à pleine mains du récipient de denrées. Une douleur fulgurente vous traverse la peau, vous lachez prise et le liquide se renverse sur vous."
                    + "\nTout en hurlant à des fréquences humainement inaudibles, vous attrapez un bout de tissu pour vous essuyer, mais vous glissez dans le liquide et manquez de vous assomer."
                    + "\nQuand vous reprenez vos esprits, le tissu s'est enflammé et le feu commence à se propager."
                    + "\nAprès 30 min d'intenses efforts, vous avez réussi à éteindre le feu. Vous ressortez de la pièce, fourbu...");
                alien.setLife(alien.getLife() - 20);
            } else {
                say("Malgré la tentation, vous faites marche arrière... Votre estomac se souviens encore de sa dernière indigestion fulgurente...");
            }
        }

        public static void priest() {
            say("Vous poussez la porte, un homme en toge blanche est agenouillé devant un hotel de pierre. Il se retourne lentement, il n'a pas l'air suppris de vous voir.");

            String question = "\nMon enfant, approchez-vous dans la lumière, que je vous donne ma bénédiction\", dit-il calmement.";
            String[] choices = {"Recevoir la bénédiction du prêtre", "Rebrousser chemin"};

            playerAnswer = choice(question, choices);

            if (playerAnswer.equals("1")) {
                say("Vous vous approchez maladroitement du prêtre, il dessine d'étranges signes dans l'air et prononce des paroles incompréhensibles." 
                    + "\nVous sentez une sensation de chaleur se répendre depuis vos membres porteurs, votre corps semble soudain léger et alerte." 
                    + "\nVous ressortez, vous ne pouvez vous empêcher de repenser à ses grandes pupile dilatées...");
                alien.setVitality(alien.getVitality() + 50);
            } else {
                say("\nVotre instinct vous pousse à rebrousser chemin... A la réflexion l'homme avait d'énormes pupilles dilatées...");
            }


        }





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