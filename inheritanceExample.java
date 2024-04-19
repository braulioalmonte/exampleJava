
public class inheritanceExample {
    public static void main(String[] args){
        class Animal {
            void eat() {
                System.out.println("Animal is eating");
            }
        }
        
        class Cat extends Animal {
            void meow() {
                System.out.println("Cat says Meow!");
            }
        }
        
        Cat myCat = new Cat();
        myCat.eat();
        myCat.meow();
    }
}
