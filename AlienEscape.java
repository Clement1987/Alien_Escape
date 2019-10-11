import java.util.Scanner;

public class AlienEscape {

    private static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {
        //Title début

        LaunchGame();

        //Title fin
    }

    public static void LaunchGame() {   

        stay();
        firstMeet();

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



    //QUENTIN
    

    //GLOBAL

    public static void say (String message) {
        System.out.println(message);
    }

}