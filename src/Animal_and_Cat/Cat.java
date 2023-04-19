package Animal_and_Cat;

public class Cat extends AnimalCat implements Edible {
    @Override
    public String makeSound() {
        return "Cat: gâu gâu";
    }

    @Override
    public String howToEat() {
        return "Mèo ăn Giả cầy";
    }
}
