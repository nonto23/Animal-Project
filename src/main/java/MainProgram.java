public class MainProgram {

    public static void main(String[] args)
    {
        Cat cat = new Cat();

        cat.setName("Stomy");
        cat.sound();
        cat.eat();


        Dog dog = new Dog();
        dog.setName("Rax");
        dog.sound();
        dog.eat();

        System.out.println(" ");
        Home home = new Home();
        Animal animal = new Animal();
       home.adoptPet(dog);
        home.makeAllSound();
        home.adoptPet(cat);

        home.makeAllSound();

    }
}
