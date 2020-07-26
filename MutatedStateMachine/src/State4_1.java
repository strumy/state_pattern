
public class State4_1 extends State3 {
	
	State4_1() {
		this.setRegion2ActiveState(this);
	}

	State4_1(Context sm) {
		sm.complexState.setHistory(this);
		this.setRegion2ActiveState(sm.complexState.getRegion2ActiveState());
		
		this.displayState();
		this.pushCurrentStateInQueue(sm);
	}
	
	@Override
	public State operation1(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 1 from State 4_1");
	}
	
	@Override
	public State operation2(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 2 from State 4_1");
	}
	
	@Override
	public State operation3(Context sm) {		
		setHistory(this);
		sm.complexState.setRegion1ActiveState(null);
		sm.complexState.setRegion2ActiveState(null);
		return new State2(sm);
	}
	
	@Override
	public State operation4(Context sm) {
		setHistory(this);
		sm.complexState.getRegion2ActiveState().displayState();
		sm.complexState.getRegion2ActiveState().pushCurrentStateInQueue(sm);
		return new State4_2(sm);
	}
	
	@Override
	public State operation5(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 5 from State 4_1");
	}
	
	@Override
	public State operation6(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 6 from State 4_1");
	}
	
	@Override
	public State operation7(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 7 from State 4_1");
	}
	
}
