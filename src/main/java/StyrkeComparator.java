import java.util.Comparator;

public class StyrkeComparator implements Comparator<Superhero> {
    public int compare(Superhero ob1, Superhero ob2) {
        return Double.compare(ob1.getStyrke(), ob2.getStyrke());
    }
}
