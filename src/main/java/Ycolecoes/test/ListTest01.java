package Ycolecoes.test;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListTest01 {
    public static void main(String[] args) {

        //usando o Estatico of que cria uma lista imutavel
        List<String> a = List.of("a", "teste");//método estático que cria uma lista imutavel
        //a.add("b");//não pode ser  add
        //não pode conter elementos nulos

        System.out.println(a.size());
        System.out.println(a.contains("a"));
        System.out.println(a.get(1));
        System.out.println(a.isEmpty()); //verifica se a lista está vazia
        System.out.println(a.indexOf("mariana"));//retorna o indice do elemento;
        //retorna -1 se não existir


        List<String> arrayList = new ArrayList<>();
        //ArrayList é mutável e permite elementos nulos

        System.out.println(arrayList.add("mariana"));
        System.out.println(arrayList.add("lucas"));

        System.out.println(arrayList.remove("mariana"));

        for (String s : arrayList) {
            System.out.println(s.replace("lucas", "Mariana"));
            System.out.println(s);
        }
        System.out.println("\n---------------------------");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("\n---------------------------");
    }
}
