package com.java.fundamentals.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>() {
            {
                add("Hello");
                add("From");
                add("The");
                add("Other");
                add("Side");
            }
        };
        Stream<String> stream = words.stream();
        stream.forEach(System.out::println);
        // stream.forEach(t -> System.out.println(t.length()));
    /* If above line is uncommented it throws:-
       Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
    at java.base/java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:279)
    at java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:658)
    at com.java.fundamentals.java8.StreamDemo.main(StreamDemo.java:20)
       */
        System.out.println("----------------------------------------------------------------------------------");
        // Collect a stream into any collection by providing the appropriate Supplier
        HashSet<String> set = words.stream().collect(Collectors.toCollection(HashSet::new));
        System.out.println(set);
        System.out.println("----------------------------------------------------------------------------------");
        // Given multiple streams where each stream consists of words stored in a particular file, merge their contents in a single stream words
        Stream<String> s1 = Stream.of("Hello", "From");
        Stream<String> s2 = Stream.of("The", "Other");
        Stream<String> s3 = Stream.of("Side", "Human");
        Stream<Stream<String>> s = Stream.of(s1, s2, s3);
        s.flatMap(Function.identity()).forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------------");
        // Given multiple streams where each stream consists of lines stored in a particular file, split each line into words and merge their contents to form a single stream of words
        s1 = Stream.of("Hello From", "The Other", "Side");
        s2 = Stream.of("You are a wizard,", "Harry");
        s3 = Stream.of("You have your", "Mother's eyes");
        s = Stream.of(s1, s2, s3);
        s.flatMap(streamOfLines -> streamOfLines.flatMap(line -> Stream.of(line.split(" ")))).forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------------");
    }
}
