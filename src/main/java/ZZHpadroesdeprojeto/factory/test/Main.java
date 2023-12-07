package ZZHpadroesdeprojeto.factory.test;

import ZZHpadroesdeprojeto.factory.domain.Animal;
import ZZHpadroesdeprojeto.factory.domain.AnimalFactory;
import ZZHpadroesdeprojeto.factory.domain.CatFactory;
import ZZHpadroesdeprojeto.factory.domain.DogFactory;

/**
 * @author mariana
 * @Project: javacore
 */
public class Main {
    public static void main(String[] args) {
        // Exemplo de uso do Factory Method


        // Criando instâncias de animais usando o Factory Method
        AnimalFactory catFactory = new CatFactory();
        Animal cat  = catFactory.createAnimal();
        System.out.println(cat.getSound());

        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        System.out.println(dog.getSound());
    }
}
