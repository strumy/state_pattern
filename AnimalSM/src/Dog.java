public class Dog extends Animal{
		
	Dog(String _name, String _color) {
		super(_name, _color);
	}
	
	public void run(){
		System.out.println("The dog with the name " + this.name + " is running.");
	}
}
