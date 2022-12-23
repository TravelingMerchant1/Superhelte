import java.util.Comparator;

public class NavnComparator implements Comparator<Superhero> {

    public int compare(Superhero ob1, Superhero ob2) {
        return ob1.getNavn().compareTo(ob2.getNavn());
    }
}
