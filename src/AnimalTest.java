public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal("GenericAnimal");
        System.out.println(animal);

        Mammal mammal = new Mammal("GenericMammal");
        System.out.println(mammal);

        Cat cat = new Cat("Kitty");
        System.out.println(cat);
        cat.greets();

        Dog dog1 = new Dog("Doggy");
        System.out.println(dog1);
        dog1.greets();

        Dog dog2 = new Dog("Puppy");
        dog1.greets(dog2);
    }
}
