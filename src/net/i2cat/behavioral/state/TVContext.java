package net.i2cat.behavioral.state;

public class TVContext implements State {
    private State tvState;

    public TVContext(State tvState) {
        this.tvState = tvState;
    }

    public State getState() {
        return tvState;
    }

    @Override
    public void doAction() {
        this.tvState.doAction();
    }

    public void setState(State state) {
        this.tvState = state;
    }
}
