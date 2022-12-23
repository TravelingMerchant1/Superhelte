import java.util.Comparator;

public class MenneskeComparator implements Comparator<Superhero> {

    public int compare(Superhero ob1, Superhero ob2) {
        return Boolean.compare(ob1.isMenneske(),ob2.isMenneske());
    }
}
