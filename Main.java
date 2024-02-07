// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


public class Main
{
    public static void main(String[] args)
    {
	Dog dog = new Dog("Spike");
	System.out.println(dog.getName() + " says " + dog.bark());

    Dog boo = new Yorkshire("Abby",30);
        System.out.println(boo.getName() + " says " + boo.bark());
        ((Yorkshire)boo).waddle();
        //You can't make the Lab waddle because there is no method in the Dog class or the lab class to make it waddle
    }
}
