// Base class
class Animal {
    void Sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Bird extends Animal {
    @Override
    void Sound() {
        System.out.println("Bird says: Tweet Tweet");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void Sound() {
        System.out.println("Cat says: Meow Meow");
    }
}

// Main class
public class AnimalFamily {
    public static void main(String[] args) {
        // Create objects of subclasses
        Bird bird = new Bird();
        Cat cat = new Cat();

        // Call the Sound() method for each
        bird.Sound();
        cat.Sound();
    }
}
