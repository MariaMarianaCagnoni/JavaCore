package com.example.benchmarks;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author mariana
 * @Project: javacore
 */
@State(Scope.Benchmark)
@BenchmarkMode(Mode.SingleShotTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(value = 3)
public class StreamsTesteParallel1 {


    @Param({"1000000", "10000000", "100000000"}) // Valores diferentes para testar o desempenho
    private long num;

    @Benchmark
    public void forSum() {
        long result = 0;
        long init = System.currentTimeMillis();

        for (long i = 1; i <= num; i++) {
            result += i;
        }

        long end = System.currentTimeMillis();
        System.out.println("sum: " + result + " " + (end - init) + " ms");
    }

    @Benchmark
    public void forStreamIterate() {
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println("sum Iterate: " + result + " " + (end - init) + " ms");
    }

    @Benchmark
    public void forParallelStreamIterate() {
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println("sum Parallel: " + result + " " + (end - init) + " ms");
    }

    @Benchmark
    public void forLongStreamIterate() {
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println("sum LongStream(using parallel processing): " + result + " " + (end - init) + " ms");
    }

    @Benchmark
    public void forLongStreamIterateWithParallel() {
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println("sum LongStream(using parallel processing): " + result + " " + (end - init) + " ms");
    }

}
