import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DFA_WordsEndingWith_abb {
    private final ArrayList<Integer> states = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3));
    private final ArrayList<Character> letters = new ArrayList<Character>(Arrays.asList('a', 'b'));
    private Integer newState (Integer state, Character letter) {
        if (letter.equals('a')) return 1;
        else if (letter.equals('b') && state % 3 == 0) return 0;
        else return state + 1;
    }
    private final Integer startState = 0;
    private final ArrayList<Integer> acceptStates = new ArrayList<Integer>(Arrays.asList(3));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo do sprawdzenia: ");
        String word = scanner.nextLine();

        char[] letters = word.toCharArray();

        for (char c : letters) {
            System.out.println(c);
        }
    }
}
