import java.util.*;

public class SetOfStates {
    private State start;
    private Set<State> intermediateStates;
    private Set<State> acceptStates;

    public SetOfStates(State start, Set<State> intermediateStates, Set<State> acceptStates) {
        this.start = start;
        this.intermediateStates = new HashSet<>(intermediateStates);
        this.acceptStates = new HashSet<>(acceptStates);
    }

    public SetOfStates (State... states) {
        this.intermediateStates = new HashSet<>();
        this.acceptStates = new HashSet<>();
        for (State s : states) {
            if(!s.isStartState() && !s.isAcceptState()) this.intermediateStates.add(s);
            else {
                if (s.isStartState()) this.start = start;
                if (s.isAcceptState()) this.acceptStates.add(s);
            }
        }
    }
}
