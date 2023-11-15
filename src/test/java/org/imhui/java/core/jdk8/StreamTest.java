package org.imhui.java.core.jdk8;

import org.imhui.java.core.concurrency.SumMethods;
import lombok.SneakyThrows;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * @author: imhuis
 * @date: 2022/1/11
 * @description:
 */
public class StreamTest {

    /**
     * 创建流
     */
    @Test
    public void createStream() {
        //
        String[] strArr = {"Hello", "world", "!"};
        Stream<String> strStream = Arrays.stream(strArr, 0 , 1);
        //
        Stream.of("Hello", "world");
        // 注意范型约束
        Stream<String> buildStream = Stream.<String>builder().add("Hello").add("world").build();
        // empty
        Stream<Object> emptyStream = Stream.empty();
        List<Object> emptyList = Collections.emptyList();

    }

    @Test
    public void unlimitedStream() {
//        Stream.generate(() -> )
        Stream<Integer> iterateStream = Stream.iterate(1, seed -> seed + 1).limit(10);

    }

    @Test
    public void baseStream() {
        IntStream intStream = IntStream.range(1, 10);
        LongStream longStream = LongStream.rangeClosed(1, 10);

        Random rand = new Random();
        DoubleStream doubleStream = rand.doubles(3);
        IntStream chars = "abcd".chars();
    }

    @Test
    public void fileStream() throws IOException {
        // 加 / 获取当前类所在工程路径
        // 不加 / 获取当前类的绝对路径
        File f = new File(this.getClass().getResource("/").getPath());
        Path path = Paths.get(f + "/test/abc.txt");
        Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8);
        lines.iterator().forEachRemaining(System.out::println);
    }


    @SneakyThrows
    @Test
    public void givenMultiThread_whenNonSyncMethod() {
        ExecutorService service = Executors.newFixedThreadPool(3);
        SumMethods summation = new SumMethods();

        IntStream.range(0, 1000)
                .forEach(count -> service.submit(summation::calculate));
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);

        assertEquals(1000, summation.getSum());
    }

    public void test2() {
        Random random = new Random();
        DoubleStream gaussianStream = Stream.generate(random::nextGaussian).mapToDouble(e -> e);
    }


}
