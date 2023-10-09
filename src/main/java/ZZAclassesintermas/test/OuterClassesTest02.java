package ZZAclassesintermas.test;

/**
 * @author mariana
 * @Project: javacore
 */
public class OuterClassesTest02 {
    private String name = "Gohan";

    void print() {
        //toda variável dentro do metodo precisa ser final
        class LocalClass {
            void printLocalClass() {
                System.out.println(name);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocalClass();
        //unica forma de utilizar as classes locais,precisa intanciar essa classe ainda dentro do método
    }

    public static void main(String[] args) {
        //classes locais são classes dentro de métodos.

        OuterClassesTest02 outerClassesTest02 = new OuterClassesTest02();
        outerClassesTest02.print();
    }
}
