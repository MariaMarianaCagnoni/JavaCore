package ZZAclassesintermas.test;

/**
 * @author mariana
 * @Project: javacore
 */

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {

        Animal animal = new Animal() {
            //classe anônima
            @Override
            public void walk() {
                System.out.println("dog walking");
                jump(); //dentro do método pode
            }
            public void jump(){
                System.out.println("pulandoooo");
            }
        };
        //animal.jump :não vai funccionar pq nao existe na super classe
        animal.walk();
    }
}
