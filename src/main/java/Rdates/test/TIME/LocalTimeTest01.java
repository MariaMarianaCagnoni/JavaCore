package Rdates.test.TIME;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author mariana
 * @Project: javacore
 */
public class LocalTimeTest01 {
    public static void main(String[] args) {

        LocalTime localtime = LocalTime.of(23, 59, 59);
        System.out.println(localtime);

        System.out.println(LocalTime.now()); //imprime tambem os nanosegundos
        System.out.println(LocalTime.MAX); //horário máximo
        System.out.println(LocalTime.now().getHour());
        System.out.println(LocalTime.now().getMinute());
        System.out.println(LocalTime.now().getSecond());
        System.out.println(LocalTime.now().getNano());

        System.out.println("--------------------------");
        // Criando uma instância de LocalTime
        LocalTime horaAtual = LocalTime.now();

        // Definindo o formato desejado
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Formatando e exibindo a hora atual
        String horaFormatada = horaAtual.format(formato);
        System.out.println("Hora formatada: " + horaFormatada);


    }
}
