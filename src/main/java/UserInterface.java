import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public void startProgram() {
        Scanner keyboard = new Scanner(System.in);
        int menuvalg;
        ArrayList<Superhero> superhelte = new ArrayList<>();
        Database database = new Database(superhelte);
        boolean menneske = true;

        System.out.println("Velkommen til din SuperHelt database");
        System.out.println("-----------------------------------------");

        do {
            System.out.println("1) For at oprette en ny Superhelt");
            System.out.println("2) For at søge efter en specifik Superhelt");
            System.out.println("3) For at søge efter en Superhelt");
            System.out.println("4) For at redigere i Superhelte i databasen");

            System.out.println("9) for at afslutte");
            menuvalg = keyboard.nextInt();
            keyboard.nextLine(); //Fix for Scanner Bug

            if (menuvalg == 1) {
                System.out.println("Lad os starte med at få et navn på din superhelt? (Enten superhelte navn eller normal navn)");
                String navn = keyboard.nextLine();

                System.out.println("Hvad er superheltens rigtige navn?");
                String rigtigeNavn = keyboard.nextLine();

                System.out.println("Er din superhelt et menneske eller ej? (Svar: true/false)");
                String human = keyboard.nextLine().charAt(0) + "";
                if (human.equalsIgnoreCase("j")) {
                    menneske = true;
                } else if (human.equalsIgnoreCase("n")) {
                    menneske = false;
                }

                System.out.println("Hvornår blev din superhelt udgivet? (f.eks. hvilket år blev superman udgivet?)");
                int udgivelsesÅr = keyboard.nextInt();
                keyboard.nextLine();

                System.out.println("Hvor stærk er din superhelt? (Skal være tal) ");
                double styrke = keyboard.nextDouble();
                keyboard.nextLine();

                System.out.println("Din helt er blevet gemt i databasen");
                database.createSuperHero(navn, rigtigeNavn, menneske, udgivelsesÅr, styrke);
                for (Superhero superhero : database.getSuperheroes()) {
                    System.out.println("---------------------------------");
                    System.out.println("Superhelte navn: " + navn);
                    System.out.println("Rigtige navn: " + rigtigeNavn);
                    System.out.println("Menneske: " + menneske);
                    System.out.println("Udgivelsesår: " + udgivelsesÅr);
                    System.out.println("Styrke: " + styrke);
                    System.out.println("---------------------------------");
                }


            } else if (menuvalg == 2) {
                System.out.println(database.searchFor(keyboard.nextLine()));

            } else if (menuvalg == 3) {
                System.out.println(database.søgeNavn(keyboard.nextLine()));

            } else if (menuvalg == 4) {
                System.out.println(database.redigerHelt());

            } else if (menuvalg == 9) {
                System.out.println("Programmet afsluttes");

            }

        } while (menuvalg != 9);
    }
}
