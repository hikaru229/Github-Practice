package day4;

public class DogBark1{
	public static void main(String[] args) {
		// Dog reference but puppy object
		Dog b = new Puppy();
		OverloadingDog d = new OverloadingDog();
		// runs the method in puppy class
		b.bark();
		d.bark(4);
	}
}
class Dog {
	public void bark(){
        System.out.println("woof");
    }
}
 
class Puppy extends Dog{
	public void bark() {
		// invokes the super class method
		//bark();
		System.out.println("yack");
	}
}

class OverloadingDog {
	public void bark(int a) {
		for (int i=0; i < a; i++) {
			System.out.println("yoi yoi");
		}
	}
}
