import java.util.ArrayList;


public class Database {
    private ArrayList<Superhero> superhelte = new ArrayList<>();
    public Database(ArrayList<Superhero> superhelte){
        this.superhelte = superhelte;
    }

    public void createSuperHero(String navn, String rigtigeNavn, boolean menneske, int udgivelsesÅr, double styrke) {
        Superhero helt = new Superhero(navn, rigtigeNavn, menneske, udgivelsesÅr, styrke);
        superhelte.add(helt);
    }

    public ArrayList<Superhero> getSuperhelte() {
        return superhelte;
    }

    public void setSuperhelte(ArrayList<Superhero> superhelte) {
        this.superhelte = superhelte;
    }

    @Override
    public String toString() {
        return "Database{" +
                "superhelte=" + superhelte +
                '}';
    }
}
