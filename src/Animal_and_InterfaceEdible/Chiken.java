package Animal_and_InterfaceEdible;

public class Chiken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Cuc Tac Cuc Tac";
    }

    @Override
    public String howToEat() {
        return "Kentucky Fried Chiken";
    }
}
