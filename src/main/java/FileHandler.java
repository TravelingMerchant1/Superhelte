import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class FileHandler {

    PrintStream output = new PrintStream(new File("data/superHeroes.cvs"));

    public FileHandler(PrintStream output) throws FileNotFoundException {
        this.output = output;
    }


    public void saveHeroes(ArrayList<Superhero> dataSaver) {

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

    public FileHandler() throws FileNotFoundException {
    }
}
