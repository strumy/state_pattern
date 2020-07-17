public class Kangaroo extends Animal{
	private double height;
	
	Kangaroo(String _name, String _color, double _height) {
		super(_name, _color);
		this.height = _height;
	}
	
	public void jump(){
		System.out.println("The kangaroo with the name " + this.name + " is jumping.");
	}
	
	public void display(){
		System.out.println("My name is " + this.name 
				+ ", color " + this.color + " and height " + this.height 
				+". I can jump up to 30 feet high");
	}
}
