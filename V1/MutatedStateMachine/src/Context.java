import java.util.ArrayList;

public class Context {
	State currentState;
	public ComplexState complexState;
	public ArrayList<String> activatedStateList = new ArrayList<String>();
	
	
	Context() {
		this.currentState = new State1(this);
	}

	public String getCurrentState() {
		return this.currentState.toString();
	}
	
	public void executeTransition(int i) throws Exception {
		if(i == 1) {
			this.currentState = this.currentState.operation1(this);
		}
		else if(i == 2) {
			this.currentState = this.currentState.operation2(this);
		}
		else if(i == 3) {
			this.currentState = this.currentState.operation3(this);
		}
		else if(i == 4) {
			this.currentState = this.currentState.operation4(this);
		}
		else if(i == 5) {
			this.currentState = this.currentState.operation5(this);
		}
		else if(i == 6) {
			this.currentState = this.currentState.operation6(this);
		}
		else if(i == 7) {
			this.currentState = this.currentState.operation7(this);
		}
		else {
			throw new Exception("Invalid Parameter for operation");
		}
	}
}
