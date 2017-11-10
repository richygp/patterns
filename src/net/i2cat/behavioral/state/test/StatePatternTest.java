package net.i2cat.behavioral.state.test;

import net.i2cat.behavioral.state.State;
import net.i2cat.behavioral.state.TVContext;
import net.i2cat.behavioral.state.TVStartState;
import net.i2cat.behavioral.state.TVStopState;

public class StatePatternTest {
    public static void main(String[] args) {
        State onTVState = new TVStartState();
        State offTVState = new TVStopState();
        TVContext context = new TVContext(onTVState);

        context.setState(onTVState);
        context.doAction();

        context.setState(offTVState);
        context.doAction();
    }
}
