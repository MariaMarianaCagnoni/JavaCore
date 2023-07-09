package introducao;

/**
 * @author mariana
 * @Project: javacore
 */
public class Aula05EstruturasCondicionais02 {

    public static void main(String[] args) {
        var salario = 6000;

        System.out.println(salario != 6000 ? "Salario é igual" : "Salario é diferente");

        String teste;

        //

        teste = salario != 6000 ? "Salario é igual" : "Salario é diferente";
        System.out.println(teste);

        //exemple of ternary operator

        var resultado = salario == 6000 ? "Salario é igual" : "Salario é diferente";
        //

        double valorTotal = salario > 5000 ? salario * 0.9 : salario * 0.95;
        System.out.println(valorTotal);

        //


    }
}
