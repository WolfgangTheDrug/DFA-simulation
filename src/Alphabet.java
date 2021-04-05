import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Alphabet {
    private Set set;

    public Alphabet(TreeSet set) {
        this.set = set;
    }

    public Alphabet (Character... chars){
        this.set = new TreeSet(Arrays.asList(chars));
    }

}
