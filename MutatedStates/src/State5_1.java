
public class State5_1 extends State3 {
	
	State5_1() {
	}
	
	@Override
	public State operation5() {
		return new State5_2();
	}
}
