
public class MutatedMachine {
	State currentState;
	
	MutatedMachine() {
		this.currentState = new State1();
	}

	public String getCurrentState() {
		return this.currentState.toString();
	}
	
	public void executeTransition(int i) {
		switch(i) {
			case 1:
				this.currentState = this.currentState.operation1();
				break;
			case 2:
				this.currentState = this.currentState.operation2();
				break;
			case 3:
				this.currentState = this.currentState.operation3();
				break;
			case 4:
				this.currentState = this.currentState.operation4();
				break;
			case 5:
				this.currentState = this.currentState.operation5();
				break;
			case 6:
				this.currentState = this.currentState.operation6();
				break;
			case 7:
				this.currentState = this.currentState.operation7();
				break;
		}
	}
	
	public static void main(String[] args) {
		MutatedMachine mm = new MutatedMachine();
		System.out.println(mm.getCurrentState());
		
		mm.executeTransition(1);
		System.out.println(mm.getCurrentState());
		
		mm.executeTransition(4);
		System.out.println(mm.getCurrentState());
		
		mm.executeTransition(3);
		System.out.println(mm.getCurrentState());
		
		mm.executeTransition(2);
		System.out.println(mm.getCurrentState());
		
		mm.executeTransition(6);
		System.out.println(mm.getCurrentState());
	}

}
