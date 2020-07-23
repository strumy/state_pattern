
public class State2 extends State {
	final State history;
	
	State2(State history) {
		this.history = history;
	}
	
	@Override
	public State operation2() {
		return this.history;
	}
	
	@Override
	public State tofinal() {
		return new Pseudostate(PseudostateType.Final);
	}
}
