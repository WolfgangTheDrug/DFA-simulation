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


    public Boolean isStartState() {
        return isStartState;
    }


    public Boolean isAcceptState() {
        return isAcceptState;
    }

}
