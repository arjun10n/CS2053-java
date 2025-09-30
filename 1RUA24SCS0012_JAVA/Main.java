class Animal {
    String name;

    Animal(String name) {
        this.name = name; // 'this' refers to the current object's variable
        System.out.println("Animal constructor called. Name: " + this.name);
    }

    void displayInfo() {
        System.out.println("Animal Name: " + name);
    }
}


class Dog extends Animal {
    int age;

   
    Dog(String name, int age) {
        super(name); // Calls the parent (Animal) class constructor
        this.age = age; 
        System.out.println("Dog constructor called. Age: " + this.age);
    }

    
    void displayInfo() {
        super.displayInfo(); // Calls the parent class method
        System.out.println("Dog Age: " + this.age);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3);
        myDog.displayInfo();
    }
}
