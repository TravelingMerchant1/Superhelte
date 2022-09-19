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

    public Superhero searchFor(String searchTerm) {
        for (Superhero superhero : superheroes) {
            if (superhero.getNavn().toLowerCase().contains(searchTerm.toLowerCase())) {
                return superhero;
            }
        }
        return null;
    }

    public Superhero søgeNavn(String søgeNavn) {
        ArrayList<Superhero> søgeResultat = new ArrayList<>();
        for (Superhero superhero : superheroes) {
            if (superhero.getNavn().contains(søgeNavn)) {
                søgeResultat.add(superhero);
            }
        }
        if (!søgeResultat.isEmpty()) {
            for (int i = 0; i < søgeResultat.size(); i++)
                System.out.println(i + 1 + ":" + søgeResultat.get(i));
        } else
            System.out.println("Der findes ingen personer i listen med navn: " + "\"" + søgeResultat + "\"");
        return null;
    }

    public Superhero redigerHelt () {
        for (int i=0; i<superheroes.size(); i++) {
            System.out.println(i+1 +":"  + superheroes.get(i));
        }

        System.out.println("indtast nr på den person der skal redigeres:");
        int nr = keyboard.nextInt();
        keyboard.nextLine();

        Superhero editPerson = superheroes.get(nr-1); // index starter fra 0
        System.out.println("Editperson: " + editPerson);

        System.out.println("Rediger data og tryk ENTER. Hvis data ikke skal redigeres tryk ENTER");

        System.out.println("Navn: " + editPerson.getNavn());
        String nyNavn = keyboard.nextLine();
        if (!nyNavn.isEmpty())
            editPerson.setNavn(nyNavn);

        System.out.println("RigtigeNavn: " + editPerson.getRigtigeNavn());
        String nyRigtigeNavn = keyboard.nextLine();
        if (!nyRigtigeNavn.isEmpty()) {
            editPerson.setRigtigeNavn(nyRigtigeNavn);
        }

        System.out.println("Menneske: " + editPerson.isMenneske());
        String nyMenneske = keyboard.nextLine();
        if (!nyMenneske.isEmpty()) {
            editPerson.setMenneske(Boolean.parseBoolean(nyMenneske));
        }

        System.out.println("Udgivelses år: " + editPerson.getUdgivelsesÅr());
        String nyUdgivelsesÅr = keyboard.nextLine();
        if (!nyUdgivelsesÅr.isEmpty()) {
            editPerson.setUdgivelsesÅr(Integer.parseInt(nyUdgivelsesÅr));
        }

        System.out.println("Styrke: " + editPerson.getStyrke());
        String nyStyrke = keyboard.nextLine();
        if (!nyStyrke.isEmpty()) {
            editPerson.setStyrke(Double.parseDouble(nyStyrke));
        }
        return null;
    }

    public ArrayList<Superhero> getSuperheroes() {
        return superheroes;
    }

    public void setSuperhelte(ArrayList<Superhero> superheroes) {
        this.superheroes = superheroes;
    }

}
