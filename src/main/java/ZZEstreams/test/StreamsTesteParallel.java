package ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author mariana
 * @Project: javacore
 */
public class StreamsTesteParallel {
    //thread = processamento paralelo

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors()); //ver quantas threads tem

        long num = 100_000_000L;
        forSum(num);
        forStreamIterate(num);
        forParallelStreamIterate(num);
        forLongStreamIterate(num);
        forLongStreamIterateWithParallel(num);
    }


    private static void forSum(long num) {
        System.out.print("sum: ");
        long result = 0;
        long init = System.currentTimeMillis();

        for (long i = 1; i <= num; i++) {
            result = +i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void forStreamIterate(long num) {
        System.out.print("sum Iterate: ");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
        //very slow cause of boxing and unboxing
    }

    private static void forParallelStreamIterate(long num) {
        System.out.print("sum Parallel: ");
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
        // a performace nao melhora pois aqui está iterando de 1 em 1
    }
    private static void forLongStreamIterate(long num) {
        System.out.print("sum LongStream(using parallel processing): ");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L,num).reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
        // a performace nao melhora pois aqui está iterando de 1 em 1
        //sem paralelismo
    }
    private static void forLongStreamIterateWithParallel(long num) {
        System.out.print("sum LongStream(using parallel processing): ");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L,num).parallel().reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
        // a performace nao melhora pois aqui está iterando de 1 em 1
    }



}
