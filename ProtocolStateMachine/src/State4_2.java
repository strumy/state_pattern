
public class State4_2 extends State3 {
	
	State4_2() {
		this.setRegion1ActiveState(this);
	}
	
	State4_2(Context sm) {
		sm.complexState.setHistory(this);
		sm.complexState.setCurrentSubState(this);
		sm.complexState.setRegion1ActiveState(this);
		this.setRegion2ActiveState(sm.complexState.getRegion2ActiveState());
		
		this.displayState();
		this.pushCurrentStateInQueue(sm);
	}
	
	@Override
	public State operation1(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 1 from State 4_2");
	}
	
	@Override
	public State operation2(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 2 from State 4_2");
	}
	
	@Override
	public State operation3(Context sm) throws Exception{
		sm.complexState.setHistory(this);
		sm.complexState.setRegion1ActiveState(null);
		sm.complexState.setRegion2ActiveState(null);
		return new State2(sm);
	}

	@Override
	public State operation4(Context sm) throws Exception {
		throw new Exception("Cannot execute operation 4 from State 4_2");
	}
	
	@Override
	public State operation5(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 5 from State 4_2");
	}
	
	@Override
	public State operation6(Context sm) throws Exception{
		setHistory(null);
		sm.complexState.setHistory(null);
		
		sm.complexState.getRegion2ActiveState().displayState();
		sm.complexState.getRegion2ActiveState().pushCurrentStateInQueue(sm);
		
		State s = new Pseudostate(PseudostateType.Final, sm);
		this.setCurrentSubState(s);
		sm.complexState.setCurrentSubState(s);
		sm.complexState.setRegion1ActiveState(s);
		return s;
	}
	
	@Override
	public State operation7(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 5 from State 4_2");
	}
	
	
}
