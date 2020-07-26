
public class State1 extends State {
	
	State1() {
	}
	
	State1(Context sm) {
		this.displayState();
		this.pushCurrentStateInQueue(sm);
	}
	
	@Override
	public State operation1(Context sm) throws Exception{		
		return new State3(sm);
	}
	
	@Override
	public State operation2(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 2 from State 1");
	}
	
	@Override
	public State operation3(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 3 from State 1");	
	}
	
	@Override
	public State operation4(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 4 from State 1");	
	}
	
	@Override
	public State operation5(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 5 from State 1");	
	}
	
	@Override
	public State operation6(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 6 from State 1");	
	}
	
	@Override
	public State operation7(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 7 from State 1");	
	}
}
