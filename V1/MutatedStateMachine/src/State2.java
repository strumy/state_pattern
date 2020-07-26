
public class State2 extends State {
	
	State2() {
	}
	
	State2(Context sm) {
		this.displayState();
		this.pushCurrentStateInQueue(sm);
	}
	
	@Override
	public State operation1(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 1 from State 2");
	}
	
	@Override
	public State operation2(Context sm) throws Exception {
		return new State3(sm);
	}
	
	@Override
	public State operation3(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 3 from State 2");	
	}
	
	@Override
	public State operation4(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 4 from State 2");	
	}
	
	@Override
	public State operation5(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 5 from State 2");	
	}
	
	@Override
	public State operation6(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 6 from State 2");	
	}
	
	@Override
	public State operation7(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 7 from State 2");	
	}
	
	@Override
	public State tofinal(Context sm) {
		return new Pseudostate(PseudostateType.Final, sm);
	}
}
