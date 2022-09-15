import java.util.ArrayList;


public class Database {
    private ArrayList<Superhero> superheroes = new ArrayList<>();

    public Database(ArrayList<Superhero> superhelte) {
        this.superheroes = superhelte;
    }

    public void createSuperHero(String navn, String rigtigeNavn, boolean menneske, int udgivelsesÅr, double styrke) {
        Superhero helt = new Superhero(navn, rigtigeNavn, menneske, udgivelsesÅr, styrke);
        superheroes.add(helt);
    }

    public Superhero searchFor(String searchTerm) {
        for (Superhero superhero : superheroes) {
            if (superhero.getNavn().toLowerCase().contains(searchTerm.toLowerCase())) {
                return superhero;
            }
        }
        return null;
    }

    public Superhero søgeNavn (String søgeNavn) {
        ArrayList<Superhero> søgeResultat = new ArrayList<>();
        for (Superhero superhero : superheroes) {
            if (superhero.getNavn().contains(søgeNavn)) {
                søgeResultat.add(superhero);
            }
        }
        if(!søgeResultat.isEmpty())
            for(Superhero superhero :søgeResultat)
                System.out.println(superhero);
        else
            System.out.println("Der findes ingen personer i listen med navn: "+"\""+søgeResultat +"\"");
        return null;
    }


    public ArrayList<Superhero> getSuperheroes() {
        return superheroes;
    }

    public void setSuperhelte(ArrayList<Superhero> superheroes) {
        this.superheroes = superheroes;
    }

}
