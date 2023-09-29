package Zgenerics;

import java.util.Collections;
import java.util.List;

/**
 * @author mariana
 * @Project: javacore
 */


public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        //printConsulta(gatos); erro de compilação,pois o java não save o tipo de lista voce esta passando
    }

    //Type erasure ?
    private static void printConsulta(List<? extends Animal> animal) {
        //aceita qualquer tipo de lista que extends(filho) Animal
        for (Animal animal1 : animal) {
            animal1.consulta();
        }
        //animal[1] = new Gato(); tentando colocar um gato em uma posição de cachorro

    }

    private static void printConsulta2(List<? super Animal> animals) {
        //aceita qualquer tipo de lista que extends(pai) Animal
        //só irá aceita SUPER classes excluindo as subclasses(cachorro e gato)
       Animal animal01 = new Cachorro();
       Animal animal02 = new Gato();
       animals.add(animal02);
       animals.add(animal01);

    }

    //quando usar o wildcard: não pode add novos elementos na lista
    //independente de ser uma classe ou interface a palavra sempre é extends: List<? extends Animal>
}
