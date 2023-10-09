package ZZAclassesintermas.test;

/**
 * @author mariana
 * @Project: javacore
 */
public class OuterClassesTest03 {
private String name = "Mariana";
    static class Nested {
        //só vai acessar atributos estáticos da classe de fora

        private String lastName = "cagnoni";
        void print(){
            //System.out.println(name); erro pois name não é static
            System.out.println(new OuterClassesTest03().name+ "\s" + lastName);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();

    }
}
