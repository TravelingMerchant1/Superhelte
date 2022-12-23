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

    public void saveData() throws FileNotFoundException {
        // Få data (superheroes) fra Database
        database.getSuperheroes();
        // Bed FileHandler om at save de data
        fileHandler.saveHeroes(getSuperheroes());
    }
}