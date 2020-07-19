# Java 8
1. Streams can be considered as a chain of pipelines through which elements are passed for processing.
2. Each Stream is a pipeline which can be used exactly once. Streams support intermediary operations like filter/map etc which work on an input stream, process it in some way and then give a new output stream.
<br>For example: 
<br>Consider that we have a List\<String\> words
<br>a) Stream<String> stream = words.stream();
<br>b) stream.forEach(System.out::println);
<br>c) stream.forEach(t -> System.out.println(t.length()));
<br> Here line (c) will throw an IllegalStateException during runtime because the input stream has already been operated upon by (b).
3. Terminal operations like forEach, findAny etc take an input stream, process it and return an output of type **other than stream**. 
4. For more details refer :
<br>i. [Java 8 In Depth](http://ocpj8.javastudyguide.com/)
<br>ii. [Java 8 Streams Part 1](https://www.pluralsight.com/guides/java-8-stream-api-part-1)
<br>iii. [Java 8 Streams Part 2](https://www.pluralsight.com/guides/java-8-stream-api-part-2)
<br> Recommended courses:
<br>i. [From Collections to Streams in Java 8 Using Lambda Expressions](https://app.pluralsight.com/library/courses/java-8-lambda-expressions-collections-streams)
<br>ii. [Streams, Collectors, and Optionals for Data Processing in Java 8](https://app.pluralsight.com/library/courses/java-8-data-processing-streams-collectors-optionals) 
5. Understanding the reason behind using an **identity** in stream reduce operation:
<br>[Why do we need an Identity?](https://stackoverflow.com/questions/32866581/in-stream-reduce-method-must-the-identity-always-be-0-for-sum-and-1-for-multipl)
<br>[Identity value vs Default value](https://stackoverflow.com/questions/59636780/why-does-javas-stream-reduce-method-take-an-identity-element-instead-of-a-defau)