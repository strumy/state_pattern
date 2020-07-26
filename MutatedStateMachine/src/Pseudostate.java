
enum PseudostateType {
	Initial, Final;
}

public class Pseudostate extends State {
	public PseudostateType kind;

	public Pseudostate(final PseudostateType k, Context sm) {
		this.kind = k;
		this.pushCurrentStateInQueue(sm);
		this.displayState();
	}

	public PseudostateType getKind() {
		return this.kind;
	}

	public void setKind(final PseudostateType kind) {
		this.kind = kind;
	}
	
	@Override
	public State operation1(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 1 from PseudoState");
	}
	
	@Override
	public State operation2(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 2 from PseudoState");
	}
	
	@Override
	public State operation3(Context sm) throws Exception{
		sm.complexState.setHistory(null);
		sm.complexState.setRegion1ActiveState(null);
		sm.complexState.setRegion2ActiveState(null);
		return new State2(sm);
	}
	
	@Override
	public State operation4(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 4 from PseudoState");
	}
	
	@Override
	public State operation5(Context sm) throws Exception{		
		return sm.complexState.operation5(sm);
	}
	
	@Override
	public State operation6(Context sm) throws Exception{		
		throw new Exception("Cannot execute operation 6 from PseudoState");
	}
	
	@Override
	public State operation7(Context sm) throws Exception{		
		return sm.complexState.operation7(sm);
	}
}
