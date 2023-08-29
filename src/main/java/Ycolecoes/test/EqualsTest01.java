package Ycolecoes.test;

import Ycolecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        String name = "mariana";
        String name2 = "mariana";
        System.out.println(name2 == name);
        System.out.println(name.equals(name2));

        Smartphone s1 = new Smartphone("1ABC5342", "Iphone");
        Smartphone s2 = new Smartphone("1ABC5342", "Iphone");

        System.out.println(s1.equals(s2)); //false. pois faz referencia para dois objetos distintos
        s2 = s1;
        System.out.println(s2.equals(s1)); //true porque está apontando para a mesma variiavel de referencia
    }
}
