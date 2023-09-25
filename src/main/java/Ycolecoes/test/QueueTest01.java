package Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author mariana
 * @Project: javacore
 */
public class QueueTest01 {
    public static void main(String[] args) {
        //FIFO

        Queue<String> fila = new PriorityQueue<>();
        fila.add("D");
        fila.add("B");
        fila.add("A");

        for (String s : fila) {
            System.out.println(s);
        }

        while(!fila.isEmpty()){

            System.out.println(fila.poll());
        }

    }
}
