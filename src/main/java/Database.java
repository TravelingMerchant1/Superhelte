import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    private ArrayList<Superhero> superheroes = new ArrayList<>();
    Scanner keyboard = new Scanner(System.in);
    public Database(ArrayList<Superhero> superhelte) {
        this.superheroes = superhelte;
    }

    public void createSuperHero(String navn, String rigtigeNavn, boolean menneske, int udgivelsesÅr, double styrke) {
        Superhero helt = new Superhero(navn, rigtigeNavn, menneske, udgivelsesÅr, styrke);
        superheroes.add(helt);
    }
/*
    public Superhero searchFor(String searchTerm) {
        for (Superhero superhero : superheroes) {
            if (superhero.getNavn().toLowerCase().contains(searchTerm.toLowerCase())) {
                return superhero;
            }
        }
        return null;
    }
 */


    public ArrayList<Superhero> søgeNavn(String søgeNavn) {

        ArrayList<Superhero> søgeResultat = new ArrayList<>();

        for (Superhero superhero : superheroes) {
            if (!søgeResultat.isEmpty()) {
                System.out.println("Der findes ingen personer i listen med det søgeterm");
            }else if (superhero.getNavn().contains(søgeNavn)) {
                søgeResultat.add(superhero);
            }
        }
        return søgeResultat;
    }



    public ArrayList<Superhero> getSuperheroes() {
        return superheroes;
    }

    public void setSuperhelte(ArrayList<Superhero> superheroes) {
        this.superheroes = superheroes;
    }

}
