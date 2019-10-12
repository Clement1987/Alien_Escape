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

    public static String pierreRoom(){
        say("Vous rentrez par la porte rouge dans la salle et découvrez Pierre en caleçon ! Des symboles de chaussette dessus et les lunettes de travers, celui-ci vous regarde et déclare : ");
        say("Pierre : oh ! un invité surprise tu veux faire des chaussettes avec moi made in Wild ?!");
        String question ="voulez-vous rester avec Pierre afin de fabriquer vos chaussettes ou partir ?";
        String[] playerChoice = {"Rester","partir en courant et en criant c'est des malades !","Rester et complimenter son caleçon !"};
        playerAnswer = choice(question,playerChoice);
            if (playerAnswer.equals("1")){
                System.out.println("Pierre est très content et fabrique avec vous votre première chaussette wild, Félicitation !");
                return "chaussette wilder";
            }
            if(playerAnswer.equals("2")){
                System.out.println("vous commencez à crier affolé , Pierre crie d'effroi à son tour et de peur balance son fer à chaussette sur vous alors que vous ouvriez la porte. Vous venez de perdre 5 points de vie");
                alien.setLife(alien.getLife()-5);
            }
            if(playerAnswer.equals("3")){
                System.out.println("Vous complimentez le caleçon de pierre ! celui-ci est tellement heureux de ce compliment qu'il vous donne son caleçon fétiche devant vous ! scène interdite au moins de 25 ans !");
                return "caleçon";
            }
        return null;
    }

    public static String licorneRoom(){
        say("A pas feutré vous entrouvrez la porte de la salle que vous avez séléctionnée. A votre grande surprise, celle-ci est plongée dans le noir, à votre droite se trouve un interrupteur pour éclairer la salle.");
        say("Souhaitez vous allumer la lumière ?!");
        say("1. Oui");
        say("2. Non");
        String question ="Souhaitez vous allumer la lumière ?!";
        String[] playerChoice = {"Oui,Non"};
        playerAnswer = choice(question,playerChoice);
        if (playerAnswer.equals("1")){
            say("votre instinct à bien fait d'allumer la lumière, car devant vous se trouve une licorne rose avec des tâches de peintures couleurs arc en ciel sur la tête entre sa corne et ses yeux.");
            say("Celle-ci vous dévisage équipé d'une corde sur le côté droit, celle-ci se rapproche de vous et met son museau entre vos mains et rapetisse jusqu'à tenir dans votre main.");
            say("Félicitation vous obtenez une licorne équipé d'une corde !");
            return "Licorne";
        }
        if(playerAnswer.equals("2")) {
            say("votre instinct à bien fait et vous avez évité un grand danger et continuer votre périple sans perdre des points de vie");
            return null;
        }
        return null; 
    }

    public static String PaulRoom(){
        say("Vous arrivez devant la porte verte et l'ouvrez avec un grand fracas, se tien devant vous Paul, star du cinéma, celui-ci vous regarde surpris et vous lance");
        say("Pour les autographes de mes fans interspatial il faudra négocier avec mon doubleur Philippe Manoeuvre ! j'en ai marre de cette tête, je vais me faire un ravalement de façade instantané !");
        say("Oh ! non je me suis trompé de modèle, le névrosé du code je n'en peux plus ! jour et nuit il code ! et surtout il patine, patine j'en ai ras le glaçon  !!");
        say("Tiens prends ma photo, au moins tu pourras dire que tu as vu la star de ces lieux !");
        say("Félicitations vous obtenez une photo de Paul le codeur");
        return "Photo";
    }
    public static String sylvainLab(){
        say("Vous arrivez devant une porte noire, vous hésitez à l'ouvrir ! vous prenez votre courage à deux tentacules et poussez celle-ci !");
        say("Vous découvrez Sylvain en pleine expérience sur Jean, élève de java, celui-ci crie sur son cobaye en lui triturant le cerveau, sur la musique de Lord of Ring");
        say("Votre peau commence à devenir rouge, ");
        String question ="vous obtenez un pouvoir de persuasion, souhaitez vous l'utiliser maintenant ?";
        String[] playerChoice = {"Oui,Non"};
        playerAnswer = choice(question,playerChoice);
        if (playerAnswer.equals("1")){
            say("vous utilisez votre pouvoir psychique pour faire entendre la vérité à Sylvain, le java est l'avenir !!");
        }
        if (playerAnswer.equals("2")){
            say("Vous gardez précieusement votre pouvoir, vous entendez, cependant Sylvain qui mentionne PHP est supérieur à Java ! Vous ne pouvez pas retenir votre pouvoir devant tant d'ineptie !");
            say("Vous lui faite entendre raison sur la supériorité du java ! Celui-ci vous aperçoit et accours vers vous en marmonnant des instructions incompréhensibles ! une histoire d'anneau, de précieux et celui-ci vous tends un objet !");
            say("Obtention d'un stickers java > PHP !");
            return "sticker java";
        }

        return null;
    }

    



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