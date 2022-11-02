import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.logging.FileHandler;

public class Controller {
    File file = new File("superHeroes.csv");
    Database database = new Database();
    FileHandler fileHandler;

    {
        try {
            fileHandler = new FileHandler();
        } catch (IOException e) {
            System.out.println("Virkede ikke");
        }
    }

    public void createSuperHero(String navn, String rigtigeNavn, boolean menneske, int udgivelsesÅr, double styrke) {
        database.createSuperHero(navn, rigtigeNavn, menneske, udgivelsesÅr, styrke);
    }

    public ArrayList<Superhero> getSuperheroes() {
        return getSuperheroes();
    }

    public void saveData(){
        // Få data (superheroes) fra Database
        database.getSuperheroes();
        // Bed FileHandler om at save de data


    }

}
