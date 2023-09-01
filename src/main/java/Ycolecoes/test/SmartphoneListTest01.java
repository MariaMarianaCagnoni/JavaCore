package Ycolecoes.test;


import Ycolecoes.domain.Smartphone;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("1ABC43534", "iPhone");
        Smartphone s2 = new Smartphone("1ABC8753", "Xiaomi");
        Smartphone s3 = new Smartphone("1ACC8753", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        //smartphones.clear();//apaga todos os valores sem perder a variavel de referencia

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        System.out.println(smartphones.contains(s2));//verifica se o objeto esta na lista
        System.out.println(smartphones.indexOf(s2));//retorna o indice do objeto na lista
        //se não existir retorna -1

        Smartphone s4 = new Smartphone("1232423ADHS", "Google Pixel");

        smartphones.add(0, s4); //esse tipo de lista me permite add um novo elemento em um indice especifico
    }


}