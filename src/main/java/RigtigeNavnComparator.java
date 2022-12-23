import java.util.Comparator;

public class RigtigeNavnComparator implements Comparator<Superhero> {

    public int compare(Superhero ob1, Superhero ob2) {
        return ob1.getRigtigeNavn().compareTo(ob2.getRigtigeNavn());
    }
}
