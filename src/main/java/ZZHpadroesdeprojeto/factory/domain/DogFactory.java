package ZZHpadroesdeprojeto.factory.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class DogFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }

}

