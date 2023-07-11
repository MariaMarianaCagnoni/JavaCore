package Minterfaces.domain;

/**
 * @author mariana
 * @Project: javacore
 */
public class DatabaseLoader implements DataLoader,DataRemover{

    @Override
    public void load() {
        System.out.println("carregando dados do bancod e dados");
    }



    @Override
    public  void checkPermission(char permission) {

        System.out.println(permission == 's' ? "Autorizado" : "Negado");


    }

    @Override
    public void printName() {
        DataRemover.super.printName();
    }

    @Override
    public String toString() {
        return "DatabaseLoader{}";
    }

    @Override
    public void remove() {
        System.out.println("implementando uma segunda interface");
        System.out.println("deletando dados do banco de dados");
    }
}
