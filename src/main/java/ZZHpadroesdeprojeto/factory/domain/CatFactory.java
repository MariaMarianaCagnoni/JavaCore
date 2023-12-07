package ZZHpadroesdeprojeto.factory.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class CatFactory implements AnimalFactory
{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
