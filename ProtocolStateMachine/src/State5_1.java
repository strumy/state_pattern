
public class State5_1 extends State3 {
	
	State5_1() {
		this.setRegion2ActiveState(this);
	}
	
	State5_1(Context sm){
		this.setRegion2ActiveState(this);
		sm.complexState.setRegion2ActiveState(this);
		this.setRegion1ActiveState(sm.complexState.getRegion1ActiveState());
		
		this.displayState();
		this.pushCurrentStateInQueue(sm);
	}
	
	@Override
	public State operation1(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 1 from State 5_1");
	}
	
	@Override
	public State operation2(Context sm) throws Exception {
		return new State3(sm);
	}
	
	@Override
	public State operation3(Context sm) throws Exception{
		sm.complexState.setRegion1ActiveState(null);
		sm.complexState.setRegion2ActiveState(null);
		return new State2(sm);
	}
	
	@Override
	public State operation4(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 4 from State 5_1");	
	}
	
	@Override
	public State operation5(Context sm) {
		sm.complexState.getRegion1ActiveState().displayState();
		sm.complexState.getRegion1ActiveState().pushCurrentStateInQueue(sm);
		
		return new State5_2(sm);
	}
	
	@Override
	public State operation6(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 6 from State 5_1");	
	}
	
	@Override
	public State operation7(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 7 from State 5_1");	
	}

}
