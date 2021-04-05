import java.util.ArrayList;

public class DFA {
    private ArrayList<Integer> states;
    private ArrayList<Character> alphabet;
    private Integer startState;
    private ArrayList<Integer> acceptStates;

    public DFA(ArrayList<Integer> states, ArrayList<Character> alphabet, Integer startState, ArrayList<Integer> acceptStates) {
        this.states = states;
        this.alphabet = alphabet;
        this.startState = startState;
        this.acceptStates = acceptStates;
    }

    public ArrayList<Character> getAlphabet() {
        return alphabet;
    }

    public ArrayList<Integer> getAcceptStates() {
        return acceptStates;
    }
}
