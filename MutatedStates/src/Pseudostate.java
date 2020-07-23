
enum PseudostateType {
	Initial, Final;
}

public class Pseudostate extends State {
	public PseudostateType kind;

	public Pseudostate(final PseudostateType k) {
		this.kind = k;
		displayState();
	}

	public PseudostateType getKind() {
		return this.kind;
	}

	public void setKind(final PseudostateType kind) {
		this.kind = kind;
	}
}
