import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Controller {
    Database database = new Database();
    FileHandler fileHandler = new FileHandler();

    public Controller() throws IOException {
    }

    public Superhero createSuperHero(String navn, String rigtigeNavn, boolean menneske, int udgivelsesÅr, double styrke) {
        return database.createSuperHero(navn, rigtigeNavn, menneske, udgivelsesÅr, styrke);
    }

    public ArrayList<Superhero> getSuperheroes() {
        return database.getSuperheroes();
    }

    //Sorter efter flere attributter
    //Primære attribut navn
    public void sorterNavnOgRigtigeNavn() {
        Collections.sort(database.getSuperheroes(), new NavnComparator().thenComparing(new RigtigeNavnComparator()));
    }

    public void sorterNavnOgMenneske() {
        Collections.sort(database.getSuperheroes(), new NavnComparator().thenComparing(new MenneskeComparator()));
    }

    public void sorterNavnOgUdgivelsesår() {
        Collections.sort(database.getSuperheroes(), new NavnComparator().thenComparing(new UdgivelsesårComparator()));
    }

    public void sorterNavnOgStyrke() {
        Collections.sort(database.getSuperheroes(), new NavnComparator().thenComparing(new StyrkeComparator()));
    }

    //Primære attribut Rigtige Navn
    public void sorterRigtigeNavnOgNavn() {
        Collections.sort(database.getSuperheroes(), new RigtigeNavnComparator().thenComparing(new NavnComparator()));
    }

    public void sorterRigtigeNavnOgMenneske() {
        Collections.sort(database.getSuperheroes(), new RigtigeNavnComparator().thenComparing(new MenneskeComparator()));
    }

    public void sorterRigtigeNavnOgUdgivelsesår() {
        Collections.sort(database.getSuperheroes(), new RigtigeNavnComparator().thenComparing(new UdgivelsesårComparator()));
    }

    public void sorterRigtigeNavnOgStyrke() {
        Collections.sort(database.getSuperheroes(), new RigtigeNavnComparator().thenComparing(new StyrkeComparator()));
    }

    //Primære attribut Menneske
    public void sorterMenneskeOgNavn() {
        Collections.sort(database.getSuperheroes(), new MenneskeComparator().thenComparing(new NavnComparator()));
    }

    public void sorterMenneskeOgRigtigeNavn() {
        Collections.sort(database.getSuperheroes(), new MenneskeComparator().thenComparing(new RigtigeNavnComparator()));
    }

    public void sorterMenneskeOgUdgivelsesår() {
        Collections.sort(database.getSuperheroes(), new MenneskeComparator().thenComparing(new UdgivelsesårComparator()));
    }

    public void sorterMenneskeOgStyrke() {
        Collections.sort(database.getSuperheroes(), new MenneskeComparator().thenComparing(new StyrkeComparator()));
    }

    //Primære attribut Udgivelsesår
    public void sorterUdgivelsesårOgNavn() {
        Collections.sort(database.getSuperheroes(), new UdgivelsesårComparator().thenComparing(new NavnComparator()));
    }

    public void sorterUdgivelsesårOgRigtigeNavn() {
        Collections.sort(database.getSuperheroes(), new UdgivelsesårComparator().thenComparing(new RigtigeNavnComparator()));
    }

    public void sorterUdgivelsesårOgMenneske() {
        Collections.sort(database.getSuperheroes(), new UdgivelsesårComparator().thenComparing(new MenneskeComparator()));
    }

    public void sorterUdgivelsesårOgStyrke() {
        Collections.sort(database.getSuperheroes(), new UdgivelsesårComparator().thenComparing(new StyrkeComparator()));
    }

    //Primære attribut Rigtige Navn
    public void sorterStyrkeOgNavn() {
        Collections.sort(database.getSuperheroes(), new StyrkeComparator().thenComparing(new NavnComparator()));
    }

    public void sorterStyrkeOgRigtigeNavn() {
        Collections.sort(database.getSuperheroes(), new StyrkeComparator().thenComparing(new RigtigeNavnComparator()));
    }

    public void sorterStyrkeOgMenneske() {
        Collections.sort(database.getSuperheroes(), new StyrkeComparator().thenComparing(new MenneskeComparator()));
    }

    public void sorterStyrkeOgUdgivelsesår() {
        Collections.sort(database.getSuperheroes(), new StyrkeComparator().thenComparing(new UdgivelsesårComparator()));
    }

    //Sorter efter en enkel attribut
    public void sorteretEfterNavn() {
        Collections.sort(database.getSuperheroes(), new NavnComparator());
    }

    public void sorteretEfterRigtigeNavn() {
        Collections.sort(database.getSuperheroes(), new RigtigeNavnComparator());
    }

    public void sorteretEfterMenneske() {
        Collections.sort(database.getSuperheroes(), new MenneskeComparator());
    }

    public void sorteretEfterUdgivelsesÅr() {
        Collections.sort(database.getSuperheroes(), new UdgivelsesårComparator());
    }

    public void sorteretEfterStyrke() {
        Collections.sort(database.getSuperheroes(), new StyrkeComparator());
    }

    //Gem data i csv-filen
    public void saveData() throws FileNotFoundException {
        // Få data (superheroes) fra Database
        database.getSuperheroes();
        // Bed FileHandler om at save de data
        fileHandler.saveHeroes(getSuperheroes());
    }
}