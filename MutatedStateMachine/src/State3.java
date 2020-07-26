
public class State3 extends ComplexState {
	
	State3() {
	}
	
	State3(Context sm) throws Exception {
		if(sm.complexState == null) {
			sm.complexState = this;			
		}
		
		this.init(sm);
	}
	
	public void init(Context sm) throws Exception {
				
		this.displayState();
		this.pushCurrentStateInQueue(sm);
		
		if (sm.complexState.getHistory() != null) {
			this.setHistory(sm.complexState.getHistory());				
		
			this.setCurrentSubState(sm.complexState.getHistory());
			
			sm.complexState.setCurrentSubState(this.getCurrentSubState());
			sm.complexState.getCurrentSubState().displayState();
			sm.complexState.getCurrentSubState().pushCurrentStateInQueue(sm);
			
			this.setRegion1ActiveState(this.getCurrentSubState());
			
		}
		else {			
			this.setCurrentSubState(new State4_1(sm));
			this.setRegion1ActiveState(this.getCurrentSubState());
		}
		
		this.initRegion2(sm);
	}
	
	public void initRegion2(Context sm) throws Exception {		
		//Variant2: Automatic completion
		this.setRegion2ActiveState(new State5_1(sm));
		State state_5_2 = this.getRegion2ActiveState().operation5(sm);
		this.setRegion2ActiveState(state_5_2.operation7(sm));
	}
	
	@Override
	public State operation1(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 1 from State 2");
	}
	
	@Override
	public State operation2(Context sm) throws Exception {
		return this.region1ActiveState.operation2(sm);
	}
	
	@Override
	public State operation3(Context sm) throws Exception {
		sm.complexState.setHistory(sm.complexState.getCurrentSubState());
		setHistory(sm.complexState.getCurrentSubState());
		sm.complexState.setRegion1ActiveState(null);
		sm.complexState.setRegion2ActiveState(null);
		return new State2(sm);
	}
	
	@Override
	public State operation4(Context sm) throws Exception {
		return this.region1ActiveState.operation4(sm);
	}
	
	@Override
	public State operation6(Context sm) throws Exception {
		return this.region1ActiveState.operation6(sm);
	}
	
	@Override
	public State operation5(Context sm) throws Exception {
		if (sm.complexState.getRegion2ActiveState() instanceof State5_1) {		
			this.setRegion2ActiveState(sm.complexState.getRegion2ActiveState());
			sm.complexState.setRegion1ActiveState(sm.complexState.getCurrentSubState());
			return this.region2ActiveState.operation5(sm);
		}
		else {
			throw new Exception("Operation 5 is not possible for: " + sm.complexState.getRegion2ActiveState().toString());
		}
	}
	
	@Override
	public State operation7(Context sm) throws Exception {
		if (sm.complexState.getRegion2ActiveState() instanceof State5_2) {
			return this.region2ActiveState.operation7(sm);
		}
		else {
			throw new Exception("Operation 7 is not possible for: " + sm.complexState.getRegion2ActiveState().toString());
		}
	}
}
