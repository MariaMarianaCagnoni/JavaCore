package Ycolecoes.test;

import Ycolecoes.domain.Consumidor;
import Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mariana
 * @Project: javacore
 */
public class ConsumidorTeste01 {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Goku");
        Consumidor consumidor2 = new Consumidor("Vegeta");


        Manga manga1 = new Manga(1L, "Dragonball", 50.78);
        Manga manga2 = new Manga(2L, "Dragonball Super", 30.78);
        Manga manga3 = new Manga(3L, "Dragonball Z", 50.78);
        Manga manga4 = new Manga(4L, "Dragonball Kai", 26.84);
        Manga manga5 = new Manga(5L, "Dragonball GT", 90.00);

        Map<Consumidor,Manga> otaku = new HashMap<>();

        otaku.put(consumidor1,manga1);
        otaku.put(consumidor2,manga3);
        otaku.put(consumidor1,manga4);
        otaku.put(consumidor2,manga5);

        for (Map.Entry<Consumidor,Manga> entry: otaku.entrySet()){
            System.out.println(entry.getKey().getNome() +" : "+ entry.getValue().getNome());
        }



    }
}

