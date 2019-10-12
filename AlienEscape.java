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

        //QUENTIN
        if (playing) stay();
        if (playing) firstMeet();

        //SANDRA
        priest();


        //CLEMENT

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

    private static void stay () {
        String question = "Souhaitez-vous sortir de votre cellule et explorer la Zone 51 ?";
        String[] answerList = new String[] {"Oui","Non"};
        playerAnswer = choice (question, answerList);
        if (playerAnswer.equals("1")) {
            say("C'était un bon choix, vous vous extirpez de votre cellule.");
        } else {
            say("Vous restez dans votre cellule et ratez ce qui était sûrement votre unique chance de sortir de cet endroit.");
            say("Vous dépérissez et vous mourrez disséqué par les méchants monsieurs en blouse blanche.");
            playing = false;
        }
    }

    private static void firstMeet () {
        say("A peine sorti de votre misérable prison, vous vous retrouvez nez à nez avec l'un des gardes faisant sa ronde matinale");
        say("A votre vue, il dégaine immédiatement son fusil à molécules sûrement retrouvé parmi les décombres de votre navette spatiale");
        String question = "Devant cette situation vous n'avez que 2 solutions qui s'offrent à vous :";
        String[] answerList = new String[] {"Se battre","Le séduire"};
        playerAnswer = choice (question, answerList);
        if (playerAnswer.equals("2")) {
            loverTime();
        } else {
            say("Vous tentez d'engager le combat avec le garde mais celui-ci vous désintègre avant même que vous ayez pu tenter quoi que ce soit.");
            say("Qui s'y frotte s'effrite.");
            playing = false;
        }

    }

    private static void loverTime () {
        String question =("Vous avez décidé de séduire le garde, choissisez la phrase d'approche la plus appropriée :");
        String[] answerList = new String[] {"Salut, j’étais là-bas, je t’ai vu et je t’ai trouvé tout sexy.","Belle journée pour faire une garde n'est ce pas ?","Salut, vous êtes d'ici ?"};
        String answer = choice(question, answerList);
        if (answer.equals("1")) {
            say("Excellente approche, le garde semble désorienté face à tant de charisme.");
            say("Vous gagnez 10 points de charisme !");
            alien.setCharm(alien.getCharm() + 10);
        } else if (answer.equals("2")) {
            say("Enthousiaste, le garde vous répond qu'en effet la journée est adéquate pour un tour de garde avant de vous atomiser la gueule.");
            say("Sérieusement, tu pensais vraiment qu'un mec de ronde au troisième sous-sol d'une base militaire protégée pouvait passer une bonne journée ? Pauvre de toi.");
            playing = false;
        } else if (answer.equals("3")) {
            say("Sérieusement ??? Y'a pas plus niais comme technique d'approche, tu as bien mérité de te faire latter le cul à coup de matraque.");
            playing = false;
        }
    }

    //GLOBAL

    private static void say (String message) {
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            wait(20);
        }
        System.out.println("");
    }

    private static String choice (String question, String[] choices) {
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

	private static void wait(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {

		}
	}

}