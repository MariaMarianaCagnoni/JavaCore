package introducao;

/**
 * @author mariana
 * @Project: javacore
 */
public class Aula05EstruturasCondicionais03 {

    public static void main(String[] args) {

       var dia = 4;
        //char, int, byte, short, enum, String
        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Opção inválida");
        }

        char sexo = 'm';

        switch (sexo) {
            case 'M', 'm' -> System.out.println("Masculino");
            case 'f', 'F' -> System.out.println("Feminino");
            default -> System.out.println("Opção inválida");
        }


    }
}
