import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    private ArrayList<Superhero> superheroes = new ArrayList<>();
    Scanner keyboard = new Scanner(System.in);
    public Database(ArrayList<Superhero> superhelte) {
        this.superheroes = superhelte;
    }

    public Database() {

    }

    public void createSuperHero(String navn, String rigtigeNavn, boolean menneske, int udgivelsesÅr, double styrke) {
        Superhero helt = new Superhero(navn, rigtigeNavn, menneske, udgivelsesÅr, styrke);
        superheroes.add(helt);
    }

    public ArrayList<Superhero> getSuperheroes() {
        return superheroes;
    }

    public void setSuperhelte(ArrayList<Superhero> superheroes) {
        this.superheroes = superheroes;
    }





}
