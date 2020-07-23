
public class State5_2 extends State3 {
	
	State5_2() {
	}
	
	@Override
	public State operation7() {
		return new Pseudostate(PseudostateType.Final);
	}
}
