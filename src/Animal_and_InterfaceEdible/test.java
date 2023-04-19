package Animal_and_InterfaceEdible;

public class test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chiken();
        animals[1] = new Tiger();

        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chiken) {
                Edible edible = (Chiken) animal;
                System.out.println(edible);
            }
        }
    }
}
