import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    Database database = new Database();
    File f = new File("data/superHeroes.csv");
    Scanner keyboard = new Scanner(f);

    public FileHandler() throws FileNotFoundException {
    }


    public void saveHeroes(ArrayList<Superhero> dataSaver) throws FileNotFoundException {
        PrintStream output = new PrintStream(new File("data/superHeroes.csv"));
        for (Superhero hero : dataSaver) {
            output.print(hero.getNavn());
            output.print(";");
            output.print(hero.getRigtigeNavn());
            output.print(";");
            output.print(hero.isMenneske());
            output.print(";");
            output.print(hero.getUdgivelsesÅr());
            output.print(";");
            output.print(hero.getStyrke());
            output.println();
        }
        output.close();
    }
}
