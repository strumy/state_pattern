public class Duck extends Animal{

	Duck(String _name, String _color) {
		super(_name, _color);
	}
	
	public void quack(){
		System.out.println("The duck with the name " + this.name + " is quacking.");
	}
	
	public void display(){
		System.out.println("My name is " + this.name 
				+ " and color " + this.color + ". I feed on grasses, plants, fish, and small insects.");
	}
}
