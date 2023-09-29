package Zgenerics.test;

/**
 * @author mariana
 * @Project: javacore
 */

abstract class Animal {

    public abstract void consulta();
}
class Cachorro extends Animal{
    @Override
    public void consulta() {
        System.out.println("consultando doguinho");
    }
}
 class Gato extends Animal{
    @Override
    public void consulta() {
        System.out.println("consultando gatineo");
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
    Cachorro[] cachorro = {new Cachorro(),new Cachorro()};
    Gato[] gato = {new Gato(),new Gato()};
    printConsulta(gato);
    printConsulta(cachorro);

    }

    private static void printConsulta(Animal[] animal){
        for (Animal animal1 : animal) {
            animal1.consulta();
        }
        //animal[1] = new Gato(); tentando colocar uma gato em uma posicao de cachorro
    }
}
