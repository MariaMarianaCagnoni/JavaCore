package Rdates.test.TIME;

import Gassociacao.domain.Local;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author mariana
 * @Project: javacore
 */
public class DurationTest01 {

    public static void main(String[] args) {
        /*
         * é usada para representar um período de tempo(horas/minutos) entre dois pontos no tempo, com uma precisão de nanossegundos.
         * Ela é imutável, o que significa que uma vez criada, suas propriedades não podem ser alteradas.*/

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime noow = LocalTime.now();
        LocalTime after2Minutes = LocalTime.now().plusMinutes(2);


        Duration duration = Duration.between(noow, after2Minutes);
        System.out.println(duration);

        Duration duration2 = Duration.between(now,nowAfterTwoYears);
        System.out.println(duration2);
        Duration duration3 = Duration.between(Instant.now(),Instant.now().plusSeconds(10000));
        System.out.println(duration3);

        Duration duration4 = Duration.ofHours(3).plusMinutes(15).plusSeconds(30);

        System.out.println("Duração: " + duration4);
    }
}
