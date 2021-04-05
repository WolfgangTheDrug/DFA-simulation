import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DFA_EvenNumberOf_0s {
    public static Integer move(Integer state, Character letter) {
        return state == Character.getNumericValue(letter) ? 1 : 0;
    }

    public static void imSorry(String... song) throws URISyntaxException, IOException {
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            Desktop.getDesktop().browse(new URI(song.length == 0? "https://www.youtube.com/watch?v=dQw4w9WgXcQ" : song[0]));
        }
    }

    public static void main(String[] args) throws Exception {
        DFA dfa = new DFA(
                new ArrayList<Integer>(Arrays.asList(0, 1)),
                new ArrayList<Character>(Arrays.asList('0', '1')),
                0,
                new ArrayList<Integer>(Arrays.asList(0))
        );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo do sprawdzenia: ");
        String word = scanner.nextLine().replaceAll("", " ");
        Integer state = 0;
        Character letter;

        StringTokenizer stringTokenizer = new StringTokenizer(word);
        while (stringTokenizer.hasMoreTokens()) {
            letter = stringTokenizer.nextToken().charAt(0);
            if(!dfa.getAlphabet().contains(letter)) {
                imSorry();
                throw new IllegalStateException();
            }
            state = move(state, letter);
        }

        System.out.println(dfa.getAcceptStates().contains(state) ? "Tak!" : "Nie!");
    }
}
