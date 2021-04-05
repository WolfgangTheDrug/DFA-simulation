import jdk.jfr.Unsigned;

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

    public Alphabet (Integer... ints) {
        for (Integer i : ints) {
            i.toString().charAt(0);
        }
        this.set = new TreeSet(Arrays.asList(ints));
    }
}
