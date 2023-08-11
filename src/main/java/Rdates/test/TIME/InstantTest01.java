package Rdates.test.TIME;

import java.time.Instant;

/**
 * @author mariana
 * @Project: javacore
 */
public class InstantTest01 {
    public static void main(String[] args) {


        Instant now = Instant.now(); //Zulu time é a hora em Greenwich,classe interessante para fazer Timestamp
        System.out.println(now);

        // Criando um Instant específico
        Instant instantEspecifico = Instant.ofEpochSecond(1628694000); // Exemplo: 11 de agosto de 2021 às 12:00:00 UTC
        System.out.println("Instant específico: " + instantEspecifico);
    }


}
