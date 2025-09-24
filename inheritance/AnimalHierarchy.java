package Inheritance;

public class AnimalHierarchy {
     String name;
     int age;
     AnimalHierarchy(String name, int age){
        this.name = name;
        this.age = age;
     }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    void makeSound() {
        System.out.println("Animal sound");
    }
}
class Dog extends AnimalHierarchy {
    Dog(String name, int age){
        super(name, age);
    }
    @Override
    void display() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
    
    @Override
    void makeSound() {
        System.out.println("Dog barking");
    }
}

class Cat extends AnimalHierarchy {
    Cat(String name, int age){
        super(name, age);
    }
    void display() {
        System.out.println("name: "+ name );
        System.out.println("age: "+age);
    }
    
    @Override
    void makeSound() {
        System.out.println("Cat meowing");
    }
}

class Bird extends AnimalHierarchy {
    Bird(String name, int age){
        super(name, age);
    }
    void display() {
        System.out.println("name:"+name );
        System.out.println("age:"+age);
    }
    
    @Override
    void makeSound() {
        System.out.println("Bird chirping");
    }
}
class Main {
    public static void main(String[] args) {
        AnimalHierarchy animal = new AnimalHierarchy("Generic Animal", 0);
        animal.makeSound();
             
        
        Dog dog = new Dog("jekki",2);
        dog.makeSound();
        dog.display();
    
        Cat cat = new Cat("mimi",3);
        cat.makeSound();
        cat.display();

        Bird bird = new Bird("tweety",1);
        bird.makeSound();
        bird.display();
    }
}
