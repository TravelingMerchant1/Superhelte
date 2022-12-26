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
        System.out.println("3) Rediger Superhelt");
        System.out.println("4) Slet Superhelt");
        System.out.println("5) Se alle dine helte i alfabetisk rækkefølge");
        System.out.println("6) Sorteringsmenu");
        System.out.println("7) Gem dine Superhelte");
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
                deleteHero();
                break;
            case 5:
                printHero();
                break;
            case 6:
                sorteringsMenu();
                break;
            case 7:
                saveHero();
                break;
            case 9:
                exitProgram();
                break;
        }
    }

    public void sorteringsMenu() throws IOException {
        System.out.println("1) Sorter efter en attribut");
        System.out.println("2) Sorter efter flere attributter");
        System.out.println("9) Tilbage til menu");
        sorteringsMenuInput();
    }

    public void sorteringsMenuInput() throws IOException {
        menuValgInput();
        switch (menuvalg) {
            case 1:
                enkelSorteringsMenu();
                break;
            case 2:
                flereSorteringsMenu();
                break;
            case 3:
                menu();
                break;
        }
    }

    public void enkelSorteringsMenu() throws IOException {
        System.out.println("1) sorter efter rigtige navn");
        System.out.println("2) sorter efter om de er menneske");
        System.out.println("3) sorter efter superheltens udgivelsesår");
        System.out.println("4) sorter efter superheltens styrke");
        System.out.println("9) Tilbage til menu");
        enkelSorteringsMenuInput();
    }


    public void enkelSorteringsMenuInput() throws IOException {
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
            case 9:
                menu();
                break;
        }
    }

    public void flereSorteringsMenu() {
        System.out.println("Hvad skal den primære sorterings attribut være?");
        System.out.println("1) Navn");
        System.out.println("2) Rigtige navn");
        System.out.println("3) Menneske");
        System.out.println("4) Udgivelsesår");
        System.out.println("5) Styrke");
        flereSorteringsMenuInput();
    }

    public void flereSorteringsMenuInput() {
        menuValgInput();
        switch (menuvalg) {
            case 1:
                primærAttributNavn();
                break;
            case 2:
                primærAttributRigtigeNavn();
                break;
            case 3:
                primærAttributMenneske();
                break;
            case 4:
                primærAttributUdgivelsesår();
                break;
            case 5:
                primærAttributStyrke();
                break;
        }
    }

    //Menu til sortering af primære Navn
    public void primærAttributNavn() {
        System.out.println("Hvad skal den sekundære attribut være?");
        System.out.println("1) Rigtige navn");
        System.out.println("2) Menneske");
        System.out.println("3) Udgivelsesår");
        System.out.println("4) Styrke");
        primærAttributNavnInput();
    }

    public void primærAttributNavnInput() {
        menuValgInput();
        switch (menuvalg) {
            case 1:
                sorteretNavnOgRigtigeNavn();
                break;
            case 2:
                sorteretNavnOgMenneske();
                break;
            case 3:
                sorteretEfterUdgivelsesÅr();
                break;
            case 4:
                sorteretNavnOgUdgivelsesår();
                break;
        }
    }

    //Menu til sortering af primære attribut Rigtige Navn
    public void primærAttributRigtigeNavn() {
        System.out.println("Hvad skal den sekundære attribut være?");
        System.out.println("1) Navn");
        System.out.println("2) Menneske");
        System.out.println("3) Udgivelsesår");
        System.out.println("4) Styrke");
        primærAttributRigtigeNavnInput();
    }

    public void primærAttributRigtigeNavnInput() {
        menuValgInput();
        switch (menuvalg) {
            case 1:
                sorteretRigtigeNavnOgNavn();
                break;
            case 2:
                sorteretRigtigeNavnOgMenneske();
                break;
            case 3:
                sorteretRigtigeNavnOgUdgivelsesår();
                break;
            case 4:
                sorteretRigtigeNavnOgStyrke();
                break;
        }
    }

    //Menu til sortering af primære attribut Menneske
    public void primærAttributMenneske() {
        System.out.println("Hvad skal den sekundære attribut være?");
        System.out.println("1) Navn");
        System.out.println("2) Rigtige navn");
        System.out.println("3) Udgivelsesår");
        System.out.println("4) Styrke");
        primærAttributMenneskeInput();
    }

    public void primærAttributMenneskeInput() {
        menuValgInput();
        switch (menuvalg) {
            case 1:
                sorteretMenneskeOgNavn();
                break;
            case 2:
                sorteretMenneskeOgRigtigeNavn();
                break;
            case 3:
                sorteretMenneskeOgUdgivelsesår();
                break;
            case 4:
                sorteretMennekseOgStyrke();
                break;
        }
    }

    //Menu til sortering af primære attribut Udgivelsesår
    public void primærAttributUdgivelsesår() {
        System.out.println("Hvad skal den sekundære attribut være?");
        System.out.println("1) Navn");
        System.out.println("2) Rigtige navn");
        System.out.println("3) Menneske");
        System.out.println("4) Styrke");
        primærAttributUdgivelsesårInput();
    }

    public void primærAttributUdgivelsesårInput() {
        menuValgInput();
        switch (menuvalg) {
            case 1:
                sorteretUdgivelsesårOgNavn();
                break;
            case 2:
                sorteretUdgivelsesårOgRigtigeNavn();
                break;
            case 3:
                sorteretUdgivelsesårOgMenneske();
                break;
            case 4:
                sorteretUdgivelsesårOgStyrke();
                break;
        }
    }

    //Menu til sortering af primære attribut Styrke
    public void primærAttributStyrke() {
        System.out.println("Hvad skal den sekundære attribut være?");
        System.out.println("1) Navn");
        System.out.println("2) Rigtige navn");
        System.out.println("3) Udgivelsesår");
        System.out.println("4) Styrke");
        primærAttributStyrkeInput();
    }

    public void primærAttributStyrkeInput() {
        menuValgInput();
        switch (menuvalg) {
            case 1:
                sorteretStyrkeOgNavn();
                break;
            case 2:
                sorteretStyrkeOgRigtigeNavn();
                break;
            case 3:
                sorteretStyrkeOgMenneske();
                break;
            case 4:
                sorteretStyrkeOgUdgivelsesår();
                break;
        }
    }

    //CRUD
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

    public void deleteHero() {
        for (int i = 0; i < controller.getSuperheroes().size(); i++) {
            System.out.println(i + 1 + ":" + controller.getSuperheroes().get(i));
        }

        System.out.println("indtast nummer på medlem der skal slettes:");
        int nr = keyboard.nextInt();
        keyboard.nextLine();

        Superhero sletSuperhero = controller.getSuperheroes().remove(nr - 1); // index starter fra 0
        System.out.println("Medlem " + sletSuperhero + " er slettet fra systemet");
    }

    public void printHero() {
        controller.sorteretEfterNavn();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    //Sorteringen efter enkel attribut
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

    //Sorter efter flere attributter
    //Primære sortering Navn
    public void sorteretNavnOgRigtigeNavn() {
        controller.sorterNavnOgRigtigeNavn();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretNavnOgMenneske() {
        controller.sorterNavnOgMenneske();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretNavnOgUdgivelsesår() {
        controller.sorterNavnOgUdgivelsesår();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretNavnOgStyrke() {
        controller.sorterNavnOgStyrke();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    //Primære sortering efter Rigtige navn
    public void sorteretRigtigeNavnOgNavn() {
        controller.sorterRigtigeNavnOgNavn();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretRigtigeNavnOgMenneske() {
        controller.sorterRigtigeNavnOgMenneske();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretRigtigeNavnOgUdgivelsesår() {
        controller.sorterRigtigeNavnOgUdgivelsesår();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretRigtigeNavnOgStyrke() {
        controller.sorterRigtigeNavnOgStyrke();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    //Primære sortering Menneske
    public void sorteretMenneskeOgNavn() {
        controller.sorterMenneskeOgNavn();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretMenneskeOgRigtigeNavn() {
        controller.sorterMenneskeOgRigtigeNavn();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretMenneskeOgUdgivelsesår() {
        controller.sorterMenneskeOgUdgivelsesår();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretMennekseOgStyrke() {
        controller.sorterMenneskeOgStyrke();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    //Primære sortering Udgivelsesår
    public void sorteretUdgivelsesårOgNavn() {
        controller.sorterUdgivelsesårOgNavn();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretUdgivelsesårOgRigtigeNavn() {
        controller.sorterUdgivelsesårOgRigtigeNavn();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretUdgivelsesårOgMenneske() {
        controller.sorterUdgivelsesårOgMenneske();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretUdgivelsesårOgStyrke() {
        controller.sorterUdgivelsesårOgStyrke();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    //Primære sortering Styrke
    public void sorteretStyrkeOgNavn() {
        controller.sorterStyrkeOgNavn();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretStyrkeOgRigtigeNavn() {
        controller.sorterStyrkeOgRigtigeNavn();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretStyrkeOgMenneske() {
        controller.sorterStyrkeOgMenneske();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    public void sorteretStyrkeOgUdgivelsesår() {
        controller.sorterStyrkeOgUdgivelsesår();
        for (Superhero superhero : controller.getSuperheroes()) {
            seeHero(superhero);
        }
    }

    //Funktionalitet
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

    public void menuValgInput() {
        menuvalg = keyboard.nextInt();
        keyboard.nextLine();
    }

    public void exitProgram() {
        System.out.println("Du aflsutter nu programmet");
        System.exit(0);
    }
}