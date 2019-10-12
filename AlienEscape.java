import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class AlienEscape {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> equipement = new ArrayList<String>();
    private static MyAlien alien = new MyAlien("name");
    private static String playerAnswer;
    private static boolean playing;

    public static void main (String[] args) {
        System.out.println("");
        System.out.println(Colors.green("        .8.          8 8888          8 8888 8 8888888888   b.             8           8 8888888888      d888888o.       ,o888888o.             .8.          8 888888888o   8 8888888888  "));
        System.out.println(Colors.green("        .888.         8 8888          8 8888 8 8888         888o.          8           8 8888          .`8888:' `88.    8888     `88.          .888.         8 8888    `88. 8 8888        "));
        System.out.println(Colors.green("       :88888.        8 8888          8 8888 8 8888         Y88888o.       8           8 8888          8.`8888.   Y8 ,8 8888       `8.        :88888.        8 8888     `88 8 8888        "));
        System.out.println(Colors.green("      . `88888.       8 8888          8 8888 8 8888         .`Y888888o.    8           8 8888          `8.`8888.     88 8888                 . `88888.       8 8888     ,88 8 8888        "));
        System.out.println(Colors.green("     .8. `88888.      8 8888          8 8888 8 888888888888 8o. `Y888888o. 8           8 888888888888   `8.`8888.    88 8888                .8. `88888.      8 8888.   ,88' 8 888888888888"));
        System.out.println(Colors.green("    .8`8. `88888.     8 8888          8 8888 8 8888         8`Y8o. `Y88888o8           8 8888            `8.`8888.   88 8888               .8`8. `88888.     8 888888888P'  8 8888        "));
        System.out.println(Colors.green("   .8' `8. `88888.    8 8888          8 8888 8 8888         8   `Y8o. `Y8888           8 8888             `8.`8888.  88 8888              .8' `8. `88888.    8 8888         8 8888        "));
        System.out.println(Colors.green("  .8'   `8. `88888.   8 8888          8 8888 8 8888         8      `Y8o. `Y8           8 8888         8b   `8.`8888. `8 8888       .8'   .8'   `8. `88888.   8 8888         8 8888        "));
        System.out.println(Colors.green(" .888888888. `88888.  8 8888          8 8888 8 8888         8         `Y8o.`           8 8888         `8b.  ;8.`8888    8888     ,88'   .888888888. `88888.  8 8888         8 8888        "));
        System.out.println(Colors.green(".8'       `8. `88888. 8 888888888888  8 8888 8 888888888888 8            `Yo           8 888888888888  `Y8888P ,88P'     `8888888P'    .8'       `8. `88888. 8 8888         8 888888888888  "));
        System.out.println("");
        System.out.println("");

        wait(1000);
        playing = true;
        Sound ambiance = new Sound("./Sounds/Ambiance.wav");
        ambiance.loop();
        LaunchGame();
        ambiance.stop();

        //Fin
    }

    public static void LaunchGame() {

        if (playing) {
            textStart();
            wait(3000);
        }       
        if (playing) {
            stay();
            wait(1000);
        } 
        if (playing) { 
            firstMeet();
            wait(1000);
        }
        if (playing) {
            corridors();
            wait(1000);
        }
        if (playing) {
            rescueAliens();
            wait(1000);
        }
        if (playing) {
            chooseDoor();
            wait(1000);
        }
        if (playing) { 
            guardZone3();
            wait(1000);
        }
        if (playing) outdoor();
        if (playing) win();
            else end();
    }

    //SANDRA
        //Salle 2
    public static void kitchen() {
        say("\nVous poussez la porte, immmédiatement une forte odeur de curry vous pique les recepteurs olfactifs. La faible lueur d'un feu étrange éclaire la pièce. " 
            + "\nDans le récipient au dessus du feu, vous distinguez des denrées humaines sous forme liquide.");
        
        String question = "Vous nourir un peu serait une bonne idée, mais vous ne savez pas si votre métabolisme saura s'adapter...";
        String[] choices = {"Se nourir", "Sortir sans rien toucher"};
        playerAnswer = choice(question, choices);

        if(playerAnswer.equals("1")) {
            say("\nAffamé, vous saisisez à pleines mains le récipient sur le feu. Une douleur fulgurente vous traverse la peau, vous lachez prise et le liquide se renverse sur vous."
                + "\nTout en hurlant à des fréquences inaudibles, vous attrapez un bout de tissu pour vous essuyer, mais vous glissez dans le liquide et manquez de vous assomer."
                + "\nQuand vous reprenez vos esprits, le tissu s'est enflammé et le feu commence à se propager."
                + "\nAprès 30 min d'intenses efforts, vous avez réussi à éteindre le feu. Vous ressortez de la pièce, fourbu...");
            alien.setLife(alien.getLife() - 20);
            say("\nVous perdez " + Colors.red("20 points de vie") + ".");
        } else {
            say("Malgré la tentation, vous faites marche arrière... Votre estomac se souviens encore de sa dernière indigestion fulgurente...");
        }
    }

    public static void priest() {
        say("\nVous poussez la porte, un homme en toge blanche est agenouillé devant un hotel de pierre. Il se retourne lentement, il n'a pas l'air suppris de vous voir.");

        String question = "Mon enfant, approchez-vous dans la lumière, que je vous donne ma bénédiction, dit-il calmement.";
        String[] choices = {"Recevoir la bénédiction du pasteur", "Rebrousser chemin"};
        playerAnswer = choice(question, choices);

        if (playerAnswer.equals("1")) {
            say("\nVous vous approchez maladroitement du prêtre, il dessine d'étranges signes dans l'air et prononce des paroles incompréhensibles." 
                + "\nVous sentez une sensation de chaleur se répendre dans votre corps, vous vous sentez soudain léger et alerte." 
                + "\nVous ressortez, vous ne pouvez vous empêcher de repenser à ses grandes pupilles dilatées...");
            alien.setVitality(alien.getVitality() + 50);
            say("\nVous gagnez " + Colors.red("50 points de vitalité") + " et un doigt dans le cul.");
        } else {
            say("\nVotre instinct vous pousse à rebrousser chemin... A la réflexion, l'homme avait d'énormes pupilles dilatées...");
        }
    }

    public static void slippers() {
        say("\nVous poussez la porte, la pièce se trouve dans la pénombre... Vous faites quelques pas sur la moquette pour atteindre l'interupteur." 
            + "\nSoudain, un objet vous percute violemment au visage ! Hébété, vous apercevez une humaine vous visant avec une pantoufle : " 
            + "\n\"Fuyez pauvre fou, vous avez ruiné la moquette de la Wild !\", crie-t-elle." 
            + "\nVous courrez vers la sortie pendant qu'une autre patoufle vous atteind à la tête.");
        alien.setLife(alien.getLife() - 5);
        say("\nVous perdez " + Colors.red("5 points de vie") + ".");
    }

    public static void weapons() {
        String question = "\nVous avez trouvé la salle des armes ! Vous n'avez plus qu'à vous servir...";
        String[] choices = {"Bazooka", "Petit pistolet", "Fusil à molécules", "Oublieur"};
        playerAnswer = choice(question, choices);

        if (playerAnswer.equals("1")) {
            say("\nVous prenez le bazooka, plus c'est gros plus ça fait du dégat.");
            equipement.add(choices[0]);
        } else if (playerAnswer.equals("2")) {
            say("\nVous prenez le pistolet, bon choix dans les espaces clos...");
            equipement.add(choices[1]);
        } else if (playerAnswer.equals("3")) {
            say("\nVous prenez le fusil à molécules, comme à la maison.");
            equipement.add(choices[2]);
        } else {
            say("\nVous prenez l'oublieur, c'est joli, ça cligotte.");
            equipement.add(choices[3]);
        }
    }

    public static void exitZone2() {
        say("\nVous avez trouvé la sortie ! Un escalier vous mène au niveau supérieur.");
    }

        //Salle 3
    public static void guardZone3() {
        say("\nVous poussez les doubles portes. Un soldat se tient au milieu de la pièce, il braque son arme sur vous et s'apprête à tirer.");

        String question = "Vous n'avez que quelques secondes pour réagir !";

        /*equipement.add("Bazooka");
        equipement.add("Petit pistolet");
        equipement.add("Fusil à molécules");
        equipement.add("Oublieur");
        equipement.add("alien costaud");*/
       
        String[] inventory = new String[equipement.size()];
        inventory = equipement.toArray(inventory);
        String[] choices = new String[inventory.length + 1];

        String[] choicesText = new String[choices.length];
        choices[0] = "Vous tentez une attaque alien secrète.";
        choicesText[0] = "Vous avez toujours été nul en arts martiaux aliens, vous mourrez au premier mouvement...";
        boolean[] isDying = new boolean[choices.length];
        boolean[] isHurting = new boolean[choices.length];
       
        for (int i = 1; i < choices.length; i++) {
            if (inventory[i-1].equals("Bazooka")) {
                choicesText[i] = "Vous sortez votre bazooka, le soldat tire et saute dernière un bureau. Vous tirez, pas de munitions !"
                +"\nVous bondissez et assommez le militaire avec votre arme. C'est sale mais ça fait plaisir.";
                choices[i] = "Saisir le bazooka";
                isDying[i] = false;
                isHurting[i] = true;
            }
        }
        for (int i = 1; i < choices.length; i++) {
            if (inventory[i-1].equals("Petit pistolet")) {
                choicesText[i] = "Vous tirez et le touchez à la poitrine. Il réplique, la balle vous rafle la peau."
                +"\nLe soldat s'éfondre, vous êtes sauf !";
                choices[i] = "Saisir le pistolet";
                isDying[i] = false;
                isHurting[i] = true;
            }
        }
        for (int i = 1; i < choices.length; i++) {
            if (inventory[i-1].equals("Fusil à molécules")) {
                choicesText[i] = "Vous dégainez voter fusil à molécules et tirez ! Le soldat est désintégré instantanément." 
                + "\nC'est bien fait et ça fait plaisir.";
                choices[i] = "Saisir le fusil à molécules";
                isDying[i] = false;
                isHurting[i] = false;
            }
        }
        for (int i = 1; i < choices.length; i++) {
            if (inventory[i-1].equals("Oublieur")) {
                choicesText[i] = "Vous sortez l'Oublieur, mettez vos lunettes noires et déclenchez le flash." 
                + "Le soldat vous regarde hébété... Men In Black est seul film humain que vous connaissiez, la chance.";
                choices[i] = "Saisir l'Oublieur";
                isDying[i] = false;
                isHurting[i] = false;
            }
        }
        for (int i = 1; i < choices.length; i++) {
            if (inventory[i-1].equals("alien costaud")) {
                choicesText[i] = "L'alien costaud saute devant vous et intercepte la balle qui allait vous tuer."
                +"\nIl s'effondre, mais il vous donne le temps nécéssaire pour attaquer sauvagement le soldat. Le soldat tombe." 
                + "\nVous n'oublierai jamais le sacrifice de votre ami...";
                choices[i] = "Faire appel à l'alien costaud !";
                isDying[i] = false;
                isHurting[i] = true;
            }
        }
        for (int i = 1; i < choices.length; i++) {
            if (inventory[i-1].equals("alien diforme")) {
                choicesText[i] = "L'alien diforme crie d'effroi et le soldat vous tue tous les deux.";
                choices[i] = "Faire appel à l'alien diforme !";
                isDying[i] = true;
                isHurting[i] = false;
            }
        }
        for (int i = 1; i < choices.length; i++) {
            if (inventory[i-1].equals("Licorne")) {
                choicesText[i] = "Non ! Pas la licorne ! Vous mourrez en tentant de la protéger...";
                choices[i] = "Pousser la licorne devant soi";
                isDying[i] = true;
                isHurting[i] = false;
            }
        }

        playerAnswer = choice(question, choices);

        if(playerAnswer.equals("1")) {
            say(choicesText[0]);
            playing = false;
        } else if (playerAnswer.equals("2")) {
            say(choicesText[1]);
            equipement.remove(0);
            if (isDying[1]) playing = false;
            if (isHurting[1]) {
                alien.setLife(alien.getLife() - 10);
                say("Vous perdez 10 point de vie.");
            }
        } else if (playerAnswer.equals("3")) {
            say(choicesText[2]);
            equipement.remove(1);
            if (isDying[2]) playing = false;
            if (isHurting[2]) {
                alien.setLife(alien.getLife() - 10);
                say("Vous perdez 10 point de vie.");
            }
        } else if (playerAnswer.equals("4")) {
            say(choicesText[3]);
            equipement.remove(2);
            if (isDying[3]) playing = false;
            if (isHurting[3]) {
                alien.setLife(alien.getLife() - 10);
                say("Vous perdez 10 point de vie.");
            }
        } else if (playerAnswer.equals("5")) {
            say(choicesText[4]);
            equipement.remove(3);
            if (isHurting[4]) {
                alien.setLife(alien.getLife() - 10);
                say("Vous perdez 10 point de vie.");
            }
            if (isDying[4]) playing = false;
        } else if (playerAnswer.equals("6")) {
            say(choicesText[5]);
            if (isDying[5]) playing = false;
            if (isHurting[5]) {
                alien.setLife(alien.getLife() - 10);
                say("Vous perdez 10 point de vie.");
                equipement.remove(4);
            }
        } else if (playerAnswer.equals("7")) {
            say(choicesText[6]);
            equipement.remove(5);
            if (isDying[6]) playing = false;
            if (isHurting[6]) {
                alien.setLife(alien.getLife() - 10);
                say("Vous perdez 10 point de vie.");
            }
        } else {
            say(choicesText[7]);
            equipement.remove(6);
            if (isDying[7]) playing = false;
            if (isHurting[7]) {
                alien.setLife(alien.getLife() - 10);
                say("Vous perdez 10 point de vie.");
            }
        }
    }
    public static void outdoor() {
        say("\nVous réalisez que vous vous trouvez dans la tour de contrôle. C'est la débandade dehors." 
            + "\nDes millions d'humains déguisés en aliens (de très mauvais goût) déferlent vers les soldats bien rangés." 
            + "\nC'est votre chance, vous allez pouvoir profiter du chaos pour vous échapper." 
            + "\nMais la porte est vérouillée. Vous apercevez le terminal qui contrôle l'ouverture.");
        /*equipement.add("alien diforme");*/
        if (equipement.contains("alien diforme")) {
            String question = "Vous devez implémenter un algorithme... Oh non, pas l'algo...";
            String[] choices = {"Demander de l'aide à votre alien diforme", "Vous y coller, parce qu'il ne faut jamais éviter de pratiquer..."};
            playerAnswer = choice(question, choices);
                if (playerAnswer.equals("1")) {
                    say("Votre alien tape frénétiquement sur le clavier pendant quelques secondes. La porte vers la liberté s'ouvre.");
                } else {
                    String answer = "";
                    while (!answer.equals("true")){
                        say("Le code affiche : isJavaDeLaBalle == false; quel est le mot à implémenter ?");
                        answer = sc.nextLine();
                    }
                    say("Bravo, la porte s'ouvre !!!");
                }
        } else {
            String answer = "";
            while (!answer.equals("true")){
                say("Le code affiche : isJavaDeLaBalle == false; quel est le mot à implémenter ?");
                answer = sc.nextLine();
            }
            say("Bravo, la porte s'ouvre !!!");
        }
    }

        //Zone 4




    //CLEMENT

    public static void pierreRoom(){
        say("\nVous poussez la porte rouge et découvrez Pierre, les lunettes de travers, avec un caleçon aux motifs de chaussettes. Celui-ci vous regarde et déclare : ");
        String question = "Oh ! un invité surprise tu veux faire des chaussettes avec moi made in Wild ?!";
        String[] playerChoice = {"Rester","Partir en courant et en criant \"C'est des malades !!!\"","Rester et complimenter son caleçon !"};
        playerAnswer = choice(question,playerChoice);
            if (playerAnswer.equals("1")){
                say("Pierre est très content et fabrique avec vous votre première chaussette Wild, Félicitations !");
                /*equipement.add("Chausettes Wilder");*/
            }
            if(playerAnswer.equals("2")){
                System.out.println("Vous commencez à crier, affolé. Pierre crie d'effroi à son tour et de peur balance son fer à chaussettes sur vous. Vous venez de perdre " + Colors.red("5 points de vie"));
                alien.setLife(alien.getLife()-5);
            }
            if(playerAnswer.equals("3")){
                System.out.println("Vous complimentez le caleçon de pierre ! Celui-ci est tellement heureux de ce compliment qu'il vous donne son caleçon fétiche en direct ! Scène interdite au moins de 25 ans !");
                /*equipement.add("Caleçon");*/
            }
    }

    public static void licorneRoom(){
        say("A pas feutré vous entrouvrez la porte de la salle que vous avez séléctionnée." 
            + " A votre grande surprise, celle-ci est plongée dans le noir, à votre droite se trouve un interrupteur pour éclairer la salle.");
        String question ="Souhaitez-vous allumer la lumière ?!";
        String[] playerChoice = {"Oui","Non"};
        playerAnswer = choice(question,playerChoice);
        if (playerAnswer.equals("1")){
            say("Votre instinct à bien fait d'allumer la lumière, car devant vous se trouve une licorne rose avec des tâches de peintures couleurs arc-en-ciel sur la tête entre sa corne et ses yeux.");
            say("Celle-ci vous dévisage et se rapproche de vous.Elle met son museau entre vos mains et rapetisse jusqu'à tenir dans votre paume.");
            say("Félicitation vous obtenez une licorne !");
            equipement.add("Licorne");
        }
        if(playerAnswer.equals("2")) {
            say("Votre instinct vous a bien guidé, vous avez évité un grand danger et continuez votre périple sans perdre des points de vie");
        } 
    }

    public static void paulRoom(){
        say("Vous arrivez devant la porte verte et l'ouvrez avec un grand fracas. Se tient devant vous Paul, star du cinéma, celui-ci vous regarde surpris et vous lance");
        say("\"Pour les autographes de mes fans extraterrestres, il faudra négocier avec mon doubleur Philippe Manoeuvre !\" dit-il.");
        say("Sous vos yeux hébahit, il se transforme en un autre humain.");
        say("\"Oh non ! Je me suis trompé de modèle... Le névrosé du code je n'en peux plus ! Jour et nuit, il code ! Et surtout il patine, patine, j'en ai ras le glaçon !!\"");
        say("Tiens prends ma photo, au moins tu pourras dire que tu as vu la star de ces lieux !");
        say("Félicitations vous obtenez une photo de Paul le codeur.");
        /*equipement.add("Photo");*/
    }
    public static void sylvainLab(){
        say("Vous arrivez devant une porte noire, vous hésitez à l'ouvrir ! Vous prenez votre courage à deux tentacules et poussez celle-ci !");
        say("Vous découvrez Sylvain en pleine expérience sur Jean, élève de java. Sylvain crie \"PHP c'est le mailleur langage !\" sur son cobaye en lui triturant le cerveau, sur la musique de Lord of the Ring.");
        say("Cette scène vous fait sortir de vos gonds, votre peau commence à devenir rouge.");
        String question ="Vous obtenez un pouvoir de persuasion, souhaitez vous l'utiliser maintenant ?";
        String[] playerChoice = {"Oui","Non"};
        playerAnswer = choice(question,playerChoice);
        if (playerAnswer.equals("1")){
            say("Vous utilisez votre pouvoir psychique pour faire entendre la vérité à Sylvain, le Java est l'avenir !!");
        }
        if (playerAnswer.equals("2")){
            say("Vous gardez précieusement votre pouvoir, vous entendez cependant Sylvain qui mentionne que PHP est supérieur à Java ! Vous ne pouvez pas retenir votre pouvoir devant tant d'ineptie !");
            say("Vous le persuadez du contraire ! Semi-hypnotisé, celui-ci vous aperçoit et accourt vers vous en marmonnant des instructions incompréhensibles ! Une histoire d'anneau, de précieux. Il vous tends un objet !");
            say("Obtention d'un stickers Java > PHP !");
           /* equipement.add("Sticker Java");*/
        }

    }
    public static void textStart(){
        say("Vous ouvrez les yeux et entendez la radio du garde à l'exterieur de votre cellule qui grésille de plus en plus.");
        say("Vous vous souvenez de la rencontre entre les Etats-Unis et votre peuple à Rosenzweig. Les Américains n'ont pas tenus leur engagments et vous ont enfermé dans leur prison située dans la zone 51.");
        say("La porte de votre cellule semble avoir été ouverte par une brève coupure de courant, vous jetez un oeil au calendrier près de la porte. Il affiche la date du jour : 20 septembre 2019.");
        say("C'est ici que commence votre aventure !");
        say("");
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
        say("A peine sorti de votre misérable prison, vous vous retrouvez nez à nez avec l'un des gardes faisant sa ronde matinale.");
        say("A votre vue, il dégaine immédiatement son fusil à molécules, sûrement retrouvé parmi les décombres de votre navette spatiale.");
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
        String question = "Vous avez décidé de séduire le garde, choissisez la phrase d'approche la plus appropriée :";
        String[] answerList = new String[] {"Salut, j’étais là-bas, je t’ai vu et je t’ai trouvé trop sexy.","Belle journée pour faire une garde n'est ce pas ?","Salut, vous êtes d'ici ?"};
        String answer = choice(question, answerList);
        if (answer.equals("1")) {
            say("Excellente approche, le garde semble désorienté face à tant de charisme.");
            say("Vous gagnez " + Colors.cyan("10 points de charisme") + " !");
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

    private static void corridors () {
        say("Après cette leçon de seduction de Maître, vous continuez votre chemin dans un long couloir vide.");
        String question = "Vous arrivez alors à une intersection, où voulez-vous aller ?";
        String[] answerList = new String[] {"Aller à gauche", "Aller à droite"};
        String playerAnswer = choice(question, answerList);
        if (playerAnswer.equals("1")) {
            say("Vous suivez le couloir de gauche, qui tourne à droite, et encore à droite, et qui menait en réalité au même endroit que le couloir de droite...");
        } else {
            say("Vous suivez le couloir de droite, qui tourne à gauche, et encore à gauche, et qui menait en réalité au même endroit que le couloir de gauche...");
        }

    }

    private static void rescueAliens () {
        say("Vous arrivez désormais dans une grande salle dans laquelle sont disposées quatres cages où d'autres aliens sont enfermés.");
        String question = "Au loin, vous entendez la sécurité arriver, vous n'avez le temps de secourir qu'un seul alien :";
        String[] answerList = new String[] {"Secourir un alien petit et trappu","Secourir un alien grand et costaud","Secourir un alien diforme et visqueux",};
        playerAnswer = choice(question, answerList);
        if (playerAnswer.equals("1")) {
            say("Vous secourez l'alien petit et trappu, malheureusement tout ce qui est petit n'est pas forcément mignon.");
            say("Il attends que vous soyez retourné pour vous assommer et s'enfuir. Vous vous réveillez dans votre cellule et passez le restant de vos jours dans une salle isolée de tout.");
            playing = false;
        } else if (playerAnswer.equals("2")) {
            say("Vous secourez l'alien grand et costaud.");
            say("Il vous suit sans hésiter et vous comprenez vite que sa carrure est bien plus imposante que sa force réelle.");
            equipement.add("alien costaud");
        } else if (playerAnswer.equals("3")) {
            say("Vous secourez l'alien diforme et visqueux.");
            say("Vous vous enfuyez avec un nouveau compagnon.");
            equipement.add("alien diforme");
        }
    }

    private static void chooseDoor () {
        say("Vous arrivez dans un couloir disposant de neuf portes.");
        String question = "Quelle porte voulez-vous emprunter ?";
        String[] answerList = new String[] {"Porte","Porte","Porte","Porte","Porte","Porte","Porte","Porte","Porte"};

        while (playing) {
            playerAnswer = choiceDoor(question, answerList);
            wait(1000);
                if (playerAnswer.equals("1")) {
                    if (playing) paulRoom(); 
                    wait(2000);
                }

                if (playerAnswer.equals("2")) {
                    if (playing) sylvainLab();
                }

                if (playerAnswer.equals("3")) {
                    if (playing) exitZone2();
                    break;
                }

                if (playerAnswer.equals("4")) {
                    if (playing) licorneRoom();
                }

                if (playerAnswer.equals("5")) {
                    if (playing) pierreRoom();
                }

                if (playerAnswer.equals("6")) {
                    if (playing) weapons();
                }

                if (playerAnswer.equals("7")) {
                    if (playing) slippers();
                }

                if (playerAnswer.equals("8")) {
                    if (playing) priest();
                }

                if (playerAnswer.equals("9")) {
                    if (playing) kitchen();
                }
        }
    
    }

    //GLOBAL

    private static void say (String message) {
        Sound letter = new Sound("./Sounds/2777.wav");
        letter.play();
        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            wait(20);
        }
        System.out.println("");
        letter.stop();
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

    private static String choiceDoor (String question, String[] choices) {
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
                System.out.println( "< " + answerIndex[i] + " > " + answerList[i]);
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
    
    private static void end() {
        say("");
        System.out.println("===============================================================================================================");
        say("");
        say("Vous avez malheureusement échoué. Vous n'avez pas pu vous échapper de la Zone 51.");
        say("");
    }

     private static void win() {
        say("");
        System.out.println("===============================================================================================================");
        say("");
        say("Félicitations ! Le chaos général et les déguisements douteux des envahisseurs vous permmenttent de vous échapper de la Zone 51.");
        say("");
    }

}