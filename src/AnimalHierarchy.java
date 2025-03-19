class Animal{
    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    void makeSound(){
        System.out.println("animal is making sound");
    }
}

class Dog extends Animal{
    Dog(String name, int age){
        super(name,age);
    }

    @Override
    void makeSound(){
        System.out.println(name + " barks");
    }
}

class Cat extends Animal{
    Cat(String name, int age){
        super(name,age);
    }

    @Override
    void makeSound(){
        System.out.println(name + " meow");
    }
}

class Bird extends Animal{
    Bird(String name, int age){
        super(name,age);
    }

    @Override
    void makeSound(){
        System.out.println(name + " chirps chirps");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Dog myDog = new Dog("Tommy",5);
        Cat myCat = new Cat("Billy",3);
        Bird myBird = new Bird("Cucoo",2);

        myDog.makeSound();
        myCat.makeSound();
        myBird.makeSound();
    }
}
