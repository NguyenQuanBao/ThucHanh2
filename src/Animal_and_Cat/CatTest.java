package Animal_and_Cat;

public class CatTest {
    public static void main(String[] args) {
        AnimalCat[] animals = new AnimalCat[1];
        animals[0] = new Cat();
        for (AnimalCat animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Cat) {
                Edible edibler = (Cat) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}


