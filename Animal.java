package oops;

public class Animal {
	public void eat() {

		System.out.println("I am eating");// for this we hava to create object
	}

	public static void main(String[] args) {
		System.out.println("love");// it will print only love because it is in main method
		Animal tuffe = new Animal();// this object we create to print "I am eating"
		tuffe.eat();// this call to eat mathod

	}

	public void run() {
		System.out.println("I am runing ");// if we want to print "I am running" so we have to create again object or we can use
											// same object for different method
	}
}
