
public abstract class State {
	
	public State operation1(Context sm) throws Exception {
		return this;
	}
	
	public State operation2(Context sm) throws Exception {
		return this;
	}
	
	public State operation3(Context sm) throws Exception {
		return this;
	}
	
	public State operation4(Context sm) throws Exception {
		return this;
	}
	
	public State operation5(Context sm) throws Exception {
		return this;
	}
	
	public State tofinal(Context sm) {
		return this;
	}
	
	public State operation6(Context sm) throws Exception {
		return this;
	}
	
	public State operation7(Context sm) throws Exception {
		return this;
	}
	
	public String toString() {
		return this.getClass().getSimpleName().toString();
	}
	
	public void displayState() {
		//System.out.println(toString());
	}
	
	public void pushCurrentStateInQueue(Context sm) {
		sm.activatedStateList.add(this.toString());
	}

}
