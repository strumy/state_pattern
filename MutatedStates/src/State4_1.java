
public class State4_1 extends State3 {
	
	State4_1() {
		super();
		setHistory(this);
		
		// State diagram from different routine, assumed to be resolving independently.
		System.out.println("--------------Region 2 Starts");
		this.setCurrentSubState(new State5_1());
		//System.out.println(this.getCurrentSubState().toString());
		
		this.setCurrentSubState(getCurrentSubState().operation5());
		//System.out.println(this.getCurrentSubState().toString());
		
		this.setCurrentSubState(getCurrentSubState().operation7());
		//System.out.println(this.getCurrentSubState().toString());
		System.out.println("--------------End Region 2");
	}
	
	@Override
	public State operation4() {
		return new State4_2();
	}
}
