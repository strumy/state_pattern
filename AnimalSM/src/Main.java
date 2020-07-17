
public class Main {

	public static void main(String[] args) {
		Dog shepherd 	= new Dog("Jack", "gold");
		Duck mallard 	= new Duck("Daffy", "green");
		Kangaroo rock 	= new Kangaroo("Steve", "red", 1.5);
		
		rock.setName("Rufus");
		
		Animal animals [] = { shepherd, mallard, rock };

		for(Animal animal: animals){
			animal.display();
		}
	}
}
