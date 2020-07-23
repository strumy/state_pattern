
public class State4_2 extends State3 {
	
	State4_2() {
		super();
		setHistory(this);
	}
	
	@Override
	public State operation3() {
		return new State2(this.getHistory());
	}
	
	@Override
	public State operation6() {
		return new Pseudostate(PseudostateType.Final);
	}
	
}
