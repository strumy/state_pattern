public class Animal {
	
	protected String name;
	protected String color;
	
	Animal(String _name, String _color){
		this.name = _name;
		this.color = _color;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display(){
		System.out.println("My name is " + this.name 
				+ " and my color is " + this.color);
	}
}
