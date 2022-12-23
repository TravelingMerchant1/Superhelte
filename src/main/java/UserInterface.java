import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private int menuvalg;
    private boolean menneske = true;
    private Scanner keyboard = new Scanner(System.in);
    Controller controller = new Controller();

    public UserInterface() throws IOException {
    }


    public void menu() throws IOException {
        System.out.println("Velkommen til din SuperHelt database");
        System.out.println("-----------------------------------------");
        System.out.println("1) Opret en ny Superhelt");
        System.out.println("2) Søg efter en Superhelt");
        System.out.println("3) Rediger i Superhelte");
        System.out.println("4) Se alle dine helte i alfabetisk rækkefølge");
        System.out.println("5) Sorteringsmenu");
        System.out.println("6) Gem dine Superhelte");
        System.out.println("9) for at afslutte");
        startMenuInput();
    }

    public void startMenuInput() throws IOException {
        menuValgInput();
        switch (menuvalg) {
            case 1:
                makeHero();
                break;
            case 2:
                searchForHero();
                break;
            case 3:
                editHero();
                break;
            case 4:
                printHero();
                break;
            case 5:
                sorteringsMenu();
                break;
            case 6:
                saveHero();
                break;
            case 9:
                closeProgram();
                break;
        }
    }

    public void sorteringsMenu() {
        System.out.println("1) sorter efter rigtige navn");
        System.out.println("2) sorter efter om de er menneske");
        System.out.println("3) sorter efter superheltens udgivelsesår");
        System.out.println("4) sorter efter superheltens styrke");
        sorteringsMenuInput();
    }

    public void sorteringsMenuInput() {
        menuValgInput();
        switch (menuvalg) {
            case 1:
                sorteretEfterRigtigeNavn();
                break;
            case 2:
                sorteretEfterMenneske();
                break;
            case 3:
                sorteretEfterUdgivelsesÅr();
                break;
            case 4:
                sorteretEfterStyrke();
                break;
        }
    }


    public void makeHero() {
        System.out.println("Lad os starte med at få et navn på din superhelt?");
        String navn = keyboard.nextLine();


        System.out.println("Hvad er superheltens rigtige navn?");
        String rigtigeNavn = keyboard.nextLine();

        System.out.println("Er din superhelt et menneske eller ej? (Svar: ja/nej)");
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

        System.out.println("Din helt er blevet gemt");
        controller.createSuperHero(navn, rigtigeNavn, menneske, udgivelsesÅr, styrke);
        for (Superhero udskrivSuperhelte : controller.getSuperheroes()) {
            seeHero(udskrivSuperhelte);
        }
    }

    public void searchForHero() {
        ArrayList<Superhero> fundet = new ArrayList<>();
        ArrayList<Superhero> heroes = controller.getSuperheroes();
        String search = keyboard.nextLine();
        int count = 0;
        for (int i = 0; i < heroes.size(); i++) {
            if (heroes.get(i).getNavn().contains(search)) {
                count++;
                fundet.add(heroes.get(i));
            }
        }
        System.out.println("Antal helte fundet: " + count);
        System.out.println(fundet);

    }

    public void editHero() {
        for (int i = 0; i < controller.getSuperheroes().size(); i++) {
            System.out.println(i + 1 + ":" + controller.getSuperheroes().get(i));
        }

        System.out.println("indtast nr på den person der skal redigeres:");
        int nr = keyboard.nextInt();
        keyboard.nextLine();

        Superhero editPerson = controller.getSuperheroes().get(nr - 1); // index starter fra 0
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

    public void printHero() {
        controller.sorteretEfterNavn();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretEfterRigtigeNavn() {
        controller.sorteretEfterRigtigeNavn();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretEfterMenneske() {
        controller.sorteretEfterMenneske();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretEfterUdgivelsesÅr() {
        controller.sorteretEfterUdgivelsesÅr();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretEfterStyrke() {
        controller.sorteretEfterStyrke();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void saveHero() throws FileNotFoundException {
        System.out.println("Din helt er blevet gemt i vores database");
        System.out.println(" ");
        controller.saveData();
    }

    public void seeHero(Superhero superhero) {
        System.out.println("---------------------------------");
        System.out.println("Superhelte navn: " + superhero.getNavn());
        System.out.println("Rigtige navn: " + superhero.getNavn());
        System.out.println("Menneske: " + superhero.isMenneske());
        System.out.println("Udgivelsesår: " + superhero.getUdgivelsesÅr());
        System.out.println("Styrke: " + superhero.getStyrke());
    }

    public void closeProgram() {
        System.out.println("Du aflsutter nu programmet");
        System.exit(0);
    }

    public void menuValgInput() {
        menuvalg = keyboard.nextInt();
        keyboard.nextLine();
    }

}