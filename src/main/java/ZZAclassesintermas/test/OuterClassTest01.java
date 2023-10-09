package ZZAclassesintermas.test;

/**
 * @author mariana
 * @Project: javacore
 */
public class OuterClassTest01 {
//nested classes."Aninhadas"
    private String name = "goku";

    class InnerInside {
        //pode declarar métodos e atributos
        //tem acesso a todos os objetos da classe externa
        public void printOuterClassesAtributte() {
            System.out.println(name);
            System.out.println(this); //sempre faz referencia a class que ele se encontra
            System.out.println(OuterClassTest01.this); //this da classe externa
        }
    }

    public static void main(String[] args) {
        //Inner class = classe dentro de outra classe
        //para criar um objeto da classe interna é necessário um objeto da classe externa
        OuterClassTest01 outerClassTest01 = new OuterClassTest01();
        InnerInside innerInside = outerClassTest01.new InnerInside();
        //a partir da variavel de referência da classe esterna,cria para mim a da classe interna.
        innerInside.printOuterClassesAtributte();
    }
}
