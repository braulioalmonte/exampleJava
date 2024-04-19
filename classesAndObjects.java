public class classesAndObjects {
     
 public static void main(String[] args){
    
        class Dog{
            
            String name;
            String race;

            void bark(String name, String race){
            System.out.println("Woof, my name is " + name + " and I'm a " + race + " Woof!");
        }
    }

    Dog myDog = new Dog();
        myDog.name = "Firulais";
        myDog.race = "Doberman";
        myDog.bark(myDog.name, myDog.race);
    }
    
}
