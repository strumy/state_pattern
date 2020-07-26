
public abstract class ComplexState extends State {
	private State history;
	State currentSubState;

	public State getCurrentSubState() {
		return currentSubState;
	}

	public void setCurrentSubState(State currentSubState) {
		this.currentSubState = currentSubState;
	}

	public State getHistory() {
		return history;
	}

	public void setHistory(State history) {
		this.history = history;
	}

}
