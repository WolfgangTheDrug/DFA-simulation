import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SetOfStates {
    private State start;
    private List<State> intermediateStates;
    private List<State> acceptStates;

    public SetOfStates(State start, List<State> intermediateStates, List<State> acceptStates) {
        this.start = start;
        this.intermediateStates = new ArrayList<>(intermediateStates);
        this.acceptStates = new ArrayList<>(acceptStates);
    }

    public SetOfStates (State... states) {
        this.intermediateStates = new ArrayList<State>();
        this.acceptStates = new ArrayList<State>();
        for (State s : states) {
            if(!s.isStartState() && !s.isAcceptState()) this.intermediateStates.add(s);
            else {
                if (s.isStartState()) this.start = start;
                if (s.isAcceptState()) this.acceptStates.add(s);
            }
        }
    }
}
