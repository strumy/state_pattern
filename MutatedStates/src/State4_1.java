
public class State4_1 extends State3 {
	
	State4_1() {
		super();
		setHistory(this);
	}
	
	@Override
	public State operation4() {
		return new State4_2();
	}
}
