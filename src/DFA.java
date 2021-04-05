import com.sun.source.tree.Tree;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DFA {
    private Alphabet alphabet;
    private SetOfStates setOfStates;


    public DFA(Alphabet alphabet, SetOfStates setOfStates) {
        this.alphabet = alphabet;
        this.setOfStates = setOfStates;
    }

    public DFA( Alphabet alphabet, State start, Set<State> intermediateStates, Set<State> acceptStates){
        this.alphabet = alphabet;
        this.setOfStates = new SetOfStates(start, intermediateStates, acceptStates);
    }

    public DFA(Alphabet alphabet, State... states) {
        this.alphabet = alphabet;
        this.setOfStates = new SetOfStates(states);
    }

    public State move_1(State s, Character a){return null;}
    public State move_2(State s, Character a){return null;}
    public State move_3(State s, Character a){return null;}
}
