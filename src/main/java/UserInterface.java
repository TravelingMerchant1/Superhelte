import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class UserInterface {
    Scanner keyboard = new Scanner(System.in);
    int menuvalg;
    ArrayList<Superhero> superhelte = new ArrayList<>();
    Database database = new Database(superhelte);
    boolean menneske = true;

    public void startProgram() {

        System.out.println("Velkommen til din SuperHelt database");
        System.out.println("-----------------------------------------");

        do {
            System.out.println("1) For at oprette en ny Superhelt");
            System.out.println("2) For at søge efter en Superhelt");
            System.out.println("3) For at redigere i Superhelte i databasen");

            System.out.println("9) for at afslutte");
            menuvalg = keyboard.nextInt();
            keyboard.nextLine(); //Fix for Scanner Bug


            if (menuvalg == 1) {
                registrerHelt();

            } else if (menuvalg == 2) {
                searchFor();

            } else if (menuvalg == 3) {
                redigerHelt();

            } else if (menuvalg == 9) {
                System.out.println("Programmet afsluttes");

            }

        } while (menuvalg != 9);
    }

    public void registrerHelt () {
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
    }
    
    public void searchFor () {
        ArrayList<Superhero> fundet = new ArrayList<>();
        ArrayList<Superhero> heroes = database.getSuperheroes();
        String search = keyboard.nextLine();
        int count = 0;
        for (int i = 0; i < heroes.size(); i++) {
            if (heroes.get(i).getNavn().contains(search)) { count++;
                fundet.add(heroes.get(i));
            }
        }
        System.out.println("Antal helte fundet: " + count);
        System.out.println(fundet);










            /*
            if (heroes.isEmpty()) {
                System.out.println("Det du har indtastet findes ikke i databasen");
            } else if (heroes.size() == 1) {
                System.out.println("Der er blevet fundet en helt med samme søgeterm: ");
            } else if (heroes.size() > 1) {
                System.out.println("Der er blevet fundet flere helte med dit søgeterm: ");
            }
             */

    }
    
    public void redigerHelt () {
        for (int i=0; i<database.getSuperheroes().size(); i++) {
            System.out.println(i+1 +":"  + database.getSuperheroes().get(i));
        }

        System.out.println("indtast nr på den person der skal redigeres:");
        int nr = keyboard.nextInt();
        keyboard.nextLine();

        Superhero editPerson = database.getSuperheroes().get(nr-1); // index starter fra 0
        System.out.println("Editperson: " + editPerson);

        System.out.println("Rediger data og tryk ENTER. Hvis data ikke skal redigeres tryk ENTER");

        System.out.println("Navn: " + editPerson.getNavn());
        String nyNavn = keyboard.nextLine();
        if (!nyNavn.isEmpty())
            editPerson.setNavn(nyNavn);

        System.out.println("RigtigeNavn: " + editPerson.getRigtigeNavn());
        String nyRigtigeNavn = keyboard.nextLine();
        if (!nyRigtigeNavn.isEmpty()) {
            editPerson.setRigtigeNavn(nyRigtigeNavn);
        }

        System.out.println("Menneske: " + editPerson.isMenneske());
        String nyMenneske = keyboard.nextLine();
        if (!nyMenneske.isEmpty()) {
            editPerson.setMenneske(Boolean.parseBoolean(nyMenneske));
        }

        System.out.println("Udgivelses år: " + editPerson.getUdgivelsesÅr());
        String nyUdgivelsesÅr = keyboard.nextLine();
        if (!nyUdgivelsesÅr.isEmpty()) {
            editPerson.setUdgivelsesÅr(Integer.parseInt(nyUdgivelsesÅr));
        }

        System.out.println("Styrke: " + editPerson.getStyrke());
        String nyStyrke = keyboard.nextLine();
        if (!nyStyrke.isEmpty()) {
            editPerson.setStyrke(Double.parseDouble(nyStyrke));
        }
        
    }
}