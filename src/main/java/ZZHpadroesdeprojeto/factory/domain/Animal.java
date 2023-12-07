package ZZHpadroesdeprojeto.factory.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public abstract class Animal {

    public abstract String getSound();
}

class Dog extends Animal {
    @Override
    public String getSound() {
        return "woof";
    }
}

class Cat extends Animal{
    @Override
    public String getSound() {
        return "meaw";
    }
}
