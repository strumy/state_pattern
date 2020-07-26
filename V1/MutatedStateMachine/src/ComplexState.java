
public abstract class ComplexState extends State {
	private State history;
	protected State region1ActiveState;
	protected State region2ActiveState;
	
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
	
	public void setRegion1ActiveState(State activeState) {
		this.region1ActiveState = activeState; 
	}
	
	public State getRegion1ActiveState() {
		return region1ActiveState;
	}
	
	public void setRegion2ActiveState(State activeState) {
		this.region2ActiveState = activeState; 
	}
	
	public State getRegion2ActiveState() {
		return region2ActiveState;
	}

}
