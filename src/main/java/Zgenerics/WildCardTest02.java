package Zgenerics;

import java.util.List;

/**
 * @author mariana
 * @Project: javacore
 */


public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(),new Cachorro());
        List<Gato> gatos = List.of(new Gato(),new Gato());
        //printConsulta(gatos); erro de compilação,pois o java não save o tipo de lista voce esta passando
    }

    private static void printConsulta(List<Animal> animal){
        for (Animal animal1 : animal) {
            animal1.consulta();
        }
        //animal[1] = new Gato(); tentando colocar uma gato em uma posicao de cachorro

    }

}
