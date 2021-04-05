public class State {
    private Integer id;
    private Boolean isStartState;
    private Boolean isAcceptState;

    public State(Integer id, Boolean isStartState, Boolean isAcceptState) {
        this.id = id;
        this.isStartState = isStartState;
        this.isAcceptState = isAcceptState;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getStartState() {
        return isStartState;
    }

    public void setStartState(Boolean startState) {
        isStartState = startState;
    }

    public Boolean getAcceptState() {
        return isAcceptState;
    }

    public void setAcceptState(Boolean acceptState) {
        isAcceptState = acceptState;
    }
}
