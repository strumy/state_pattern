
public abstract class State3 extends ComplexState {
	
	State3() {
		
	}
	
	@Override
	public State operation3() {
		return new State2(getHistory());
	}

}
