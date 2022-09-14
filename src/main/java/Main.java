import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int menuvalg;
        ArrayList<Superhero> superhelte = new ArrayList<>();
        Database database = new Database(superhelte);

        System.out.println("Velkommen til din SuperHelt database");
        System.out.println("-----------------------------------------");

        do {
            System.out.println("1) For at oprette en ny helt");
            System.out.println("9) for at afslutte");
            menuvalg = keyboard.nextInt();
            keyboard.nextLine(); //Fix for Scanner Bug

            if (menuvalg == 1) {
                System.out.println("Lad os starte med at få et navn på din superhelt? (Enten superhelte navn eller normal navn)");
                String navn = keyboard.nextLine();

                System.out.println("Hvad er superheltens rigtige navn?");
                String rigtigeNavn = keyboard.nextLine();

                System.out.println("Er din superhelt et menneske eller ej? (Svar: true/false)");
                boolean menneske = keyboard.nextBoolean();
                keyboard.nextLine();

                System.out.println("Hvornår blev din superhelt udgivet? (f.eks. hvilket år blev superman udgivet?)");
                int udgivelsesÅr = keyboard.nextInt();
                keyboard.nextLine();

                System.out.println("Hvor stærk er din superhelt? (Skal være tal) ");
                double styrke = keyboard.nextDouble();
                keyboard.nextLine();

                database.createSuperHero(navn, rigtigeNavn, menneske, udgivelsesÅr, styrke);

                System.out.println("Din helt er blevet gemt i databasen");

                database.createSuperHero(navn, rigtigeNavn, menneske, udgivelsesÅr, styrke);
                for (Superhero superhero : database.getSuperhelte()){
                    System.out.println("Superhelte navn: " + navn);
                    System.out.println("Rigtige navn: " + rigtigeNavn);
                    System.out.println("Menneske: " + menneske);
                    System.out.println("Udgivelsesår: " + udgivelsesÅr);
                    System.out.println("Styrke: " + styrke);

                }
            } else if (menuvalg == 9) {
                System.out.println("Programmet afsluttes");
            }
        } while (menuvalg != 9);
        System.out.println(superhelte.get(0));

    }
}