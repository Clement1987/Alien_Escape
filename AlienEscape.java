import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlienEscape {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> equipement = new ArrayList<>();
    private static MyAlien alien = new MyAlien("name");

    public static void main (String[] args) {
        //Title début

        LaunchGame();

        //Title fin
    }

    public static void LaunchGame() {   


    }

    //SANDRA



    //CLEMENT

    public static String pierreRoom(){
        System.out.println("Vous rentrez par la porte rouge dans la salle et découvrez Pierre en caleçon ! Des symboles de chaussette dessus et les lunettes de travers, celui ci vous regarde et déclare : ");
        System.out.println("Pierre : oh ! un invité surprise tu veux faire des chaussettes avec moi made in Wild ?!");
        System.out.println("voulez vous rester avec Pierre afin de fabriquer vos chaussettes ou partir ?");
        System.out.println("1. rester");
        System.out.println("2. partir en courrant et en criant c'est des malades !");
        System.out.println("3. Rester et complimenter son calecon !");
        int pierreChoice = sc.nextInt();
            if (pierreChoice == 1){
                System.out.println("Pierre est très content, et fabrique avec vous vos premières chaussettes wild, Félicitation !");
                return "chausette wilder";
            }
            if(pierreChoice == 2){
                System.out.println("vous commencez à crier affolé , Pierre crie d'éffroi à son tour et de peur balance son fer à chaussette sur vous alors que vous ouvriez la porte. Vous venez de perdre 5 points de vie");
                setLife(getlife()-5);
            }
            if(pierreChoice ==3){
                System.out.println("Vous complimentez le caleçon de pierre ! celui-ci est tellement heureux de ce compliment qu'il vous donne son caleçon fétiche devant vous ! scène interdite au moins de 25 ans !");
                return "caleçon";
            }
    }

    public static String licorneRoom(){
        say("A pas feutré vous entrouvez la porte de la salle que vous avez séléctionné. A votre grande surprise, celle ci est plongée dans le noir, à votre droite se trouve un interrupteur pour éclairer la salle.");
        say("Souhaitez vous allumer la lumière ?!");
        say("1. Oui");
        say("2. Non");
        int licorneChoice = sc.nextInt();
        if (licorneChoice == 1){
            say("votre instinct à bien fait d'allumer la lumière car devant vous se trouve une licorne rose avec des taches de peintures couleurs arc en ciel sur la tête entre sa corne et ses yeux.");
            say("Celle-ci vous dévisage équipé d'une corde sur le coté droit, celle-ci se rapproche de vous et met son museau entre vos mains et rappetissie jusqu'à tenir dans votre main.");
            say("Félicitation vous obtenez une licorne équipé d'une corde !");
            return "Licorne";
        }
        if(licorneChoice == 2) {
            say("votre instinct à bien fait et vous avez évitez un grand danger et continuer votre périple sans perdre des points de vie");
            return null;
        }
        
    }

    public static String PaulRoom(){
        say("Vous arrivez devant la porte verte et l'ouvrez avec un grand fracas, se tiens devant vous Paul star du cinéma, celui ci vous regarde surpris et vous lance");
        say("pour les autographes de mes fans interspatiales il faudra négocier avec mon doubleur philippe Manoeuvre ! j'en ai marre de cet tête, je vais me faire un ravalement de facade instantanée !");
        say("oh ! non je me suis trompez de modèle, le névrosé du code je n'en peux plus ! jour et nuit il code ! et surtout il patine, patine j'en ai ras le glaçon  !!");
        say("tiens prend ma photo, au moins tu pourras dire que tu as vu la star de ses lieux !");
        say("félicitation vous obtenez une photo de Paul le codeur");
        return "Photo";
    }

    



    //QUENTIN

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
		String playerAnswer = "";
		while (!Arrays.asList(answerIndex).contains(playerAnswer)) {
            say(question);
            say("");
            for (int i = 0; i < answerList.length; i++) {
                say( "< " + answerIndex[i] + " > " + answerList[i]);
            }
            say("");
            System.out.print("Answer : ");
            playerAnswer = sc.nextLine();
            say("");
        }
        return playerAnswer;
    }

}