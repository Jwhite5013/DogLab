// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
	// Dog dog = new Dog("Spike");
	// System.out.println(dog.getName() + " says " + dog.bark());

 //    Dog boo = new Yorkshire("Abby",30);
 //        System.out.println(boo.getName() + " says " + boo.bark());
 //        ((Yorkshire)boo).waddle();
 //        //You can't make the Lab waddle because there is no method in the Dog class or the lab class to make it waddle
 //        Dog[] dogs = new Dog[3];
 //        dogs[0] = new Dog("Timmy");
 //        dogs[1] = new Labrador("Daisy", "Black");
 //        dogs[2] = new Yorkshire("Smore", 20);
 //        for(int i = 0; i<dogs.length; i++){
 //            System.out.println(dogs[i].getName() + " says " + dogs[i].bark());
 //        }
 //        for(Dog who: dogs){
 //            System.out.println(who.getName() + "says" + who.bark());
 //        }
 //        ((Labrador)dogs[1]).waddle();
 //        ArrayList<Dog> dogs1 = new ArrayList<Dog>();
 //        dogs1.add(new Dog("Sadie"));
 //        dogs1.add(new Labrador("Bubba","Brown"));
 //        dogs1.add(new Yorkshire("Maggie",75));
 //        for(int i = 0; i<dogs1.size();i++){
 //            System.out.println(dogs1.get(i).getName() + " says " + dogs1.get(i).bark());
 //        }
 //        for(Dog rawr : dogs1){
 //            System.out.println(rawr.getName() + " says " + rawr.bark());
 //        }
 //        ((Labrador)dogs1.get(1)).waddle();
      ArrayList<Animal> animals = new ArrayList<Animal>();
      animals.add(new Labrador("Sydney","White"));
      animals.add(new Yorkshire("Bob", 30));
      animals.add(new Dog("Clara"));
      animals.get(0).setAge(3);
      animals.get(1).setAge(1);
      animals.get(2).setAge(5);
      for(int i = 0; i<animals.size();i++){
        System.out.println(((Dog)(animals.get(i))).getName() + " is " + animals.get(i).getAge() + " years old.");
        animals.get(i).eat();
        System.out.println(animals.get(i).bark());
      }
      //doesn't work because The animal class has no bark method so it does not compile.
    }
  
}
