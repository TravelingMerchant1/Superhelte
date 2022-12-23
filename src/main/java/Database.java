import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    private ArrayList<Superhero> superheroes = new ArrayList<>();
    private File superHeroes = new File("data/superHeroes.csv");

    public Database(ArrayList<Superhero> superhelte) {
        this.superheroes = superhelte;
    }

    public Database() {

    }

    public Superhero createSuperHero(String navn, String rigtigeNavn, boolean menneske, int udgivelsesÅr, double styrke) {
        Superhero helt = new Superhero(navn, rigtigeNavn, menneske, udgivelsesÅr, styrke);
        superheroes.add(helt);
        return helt;
    }

//    public ArrayList<Superhero> indlæsMedlemmer()  {
//        ArrayList<Superhero> superheroes = new ArrayList<>();
//        Scanner sc;
//        try {
//            sc = new Scanner(superHeroes);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        while (sc.hasNext()) {
//
//            String linje = sc.nextLine();
//            String[] attributter = linje.split(";");
//
//            Superhero indlæstMedlem = new Superhero(
//                    attributter[0],
//                    attributter[1],
//                    Boolean.parseBoolean(attributter[2]),
//                    Integer.parseInt(attributter[3]),
//                    Integer.parseInt(attributter[4]),
//                    Double.parseDouble(attributter[5])) {
//            };
//            superheroes.add(indlæstMedlem);
//        }
//        sc.close();
//        return superheroes;
//    }

    public ArrayList<Superhero> getSuperheroes() {
        return superheroes;
    }

    public void setSuperhelte(ArrayList<Superhero> superheroes) {
        this.superheroes = superheroes;
    }





}
