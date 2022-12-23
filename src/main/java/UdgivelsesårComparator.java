import java.util.Comparator;
import java.util.SortedMap;

public class UdgivelsesårComparator implements Comparator<Superhero> {

    public int compare(Superhero ob1, Superhero ob2) {
        return Integer.compare(ob1.getUdgivelsesÅr(), ob2.getUdgivelsesÅr());
    }
}
