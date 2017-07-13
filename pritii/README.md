# Stream methods and functions in java 8
# stream()
This code explains that we can create an Array.aslist to stream directly.
``````
Arrays.asList("a1", "a2", "a3")
    .stream()
``````
# Stream.of()
In the given code Stream is created directly without using List separately.
``````
Stream.of("a1", "a2", "a3")
``````
# map(),average()
*This code explains the map() that performs some operations and average() takes the average from that map operations.*
``````
Arrays.stream(new int[] {2,3,4})
    .map(n -> 2 * n + 1)
    .average()
    .ifPresent(System.out::println);
``````
# filter()
Given below code it fetches the price which is greater than 3000 from the list .
``````
Stream<product> obj=list.stream().filter(p->p.price>3000).forEach(System.out::println);
``````
# mapToInt()
*This code explains Stream of String is converted to Int using .mapToint() and substring(1) means it takes int from the stream and .max is used to find the maximum value from Stream. The output will be 3.*
``````
Stream.of("a1", "a2", "a3")
    .map(s -> s.substring(1))
    .mapToInt(Integer::parseInt)
    .max()
    .ifPresent(System.out::println);
``````
# IntStream methods
# IntStream.of()
 *IntStream static method of() accepts an int array as argument and returns an IntStream.*

 ```````
 int[] numbers = { 2, 4, 1, 7, 5, 10, 3 };
 IntStream intStream = IntStream.of(numbers);
```````


# IntStream using forEach
*given code is printed using forEach function*
``````
int[] numbers = { 2, 4, 1, 7, 5, 10, 3 };
IntStream.of(numbers).forEach(System.out::println);
``````

# IntStream using iterate and limit()
given code is iterated using iterate function. it get executed till it reaches the limit
``````
IntStream.iterate(0, i->i+2).limit(5).forEach(System.out::println);
``````
# IntStream map() operation
The below code uses map() operation on an IntStream to find square of each of the numbers.
``````
int[] numbers = { 2, 4, 1, 7, 5, 10, 3 };IntStream.of(numbers).map(n-> n*n).forEach(System.out::println);
``````

# IntStream reduce() operation
Reduce operation takes the whole Array and perform Addition
``````
int[] numbers = { 2, 4, 1, 7, 5, 10, 3 };
int sum = IntStream.of(numbers).reduce(0, (x,y) -> x+y);
System.out.println("Sum of numbers = " + sum);
``````
# Sorting an IntStream
Sorting method is used to sort a given input
``````
int[] numbers = { 2, 4, 1, 7, 5, 10, 3 };
IntStream.of(numbers).sorted().forEach(System.out::println);
``````
# IntStream min(), max(), sum(), average() functions
In the given code min,max,sum and average of the given input is calculated
``````
int[] numbers = { 2, 4, 1, 7, 5, 10, 3 };
System.out.println("Min = " + IntStream.of(numbers).min().getAsInt());
System.out.println("Max = " + IntStream.of(numbers).max().getAsInt());
System.out.printf("Average = %.2f%n" , IntStream.of(numbers).average().getAsDouble());
System.out.println("Sum = " + IntStream.of(numbers).sum());
``````
# IntStream using range() and rangeClosed() operations
when we give range() it take between 1 to 9, but for rangeClosed it take between 1 to 10.
``````
System.out.println("Sum of 1 to 9 = " +  IntStream.range(1, 10).sum());
System.out.println("Sum of 1 to 10 = " + IntStream.rangeClosed(1, 10).sum());
``````
# Stream Collectors
# Collector.toSet()
Stream collect() method collects elements from a stream and stores them in a collection.We can supply a Collector to the collect method to accumulate the Stream elements into new Set.collect(Collector.toSet()) collects elements from a stream to a Set.
``````
        Set<Integer> collected = Stream.of(1,2,3,4,5)
                .collect(Collectors.toSet());
        collected.forEach(System.out::println);
``````
# Collectors.joining()
Given code will join the list elements

``````
String result = MyList.stream()
  .collect(joining());
``````
# Collectors counting()
Given code will count the number of elements present in Mylist
``````
Long result = givenList.stream()
  .collect(counting());
``````
# parallel()
below code explains the parallel function that prints random output of given string
``````
String s="Ram";s.chars().parallel().forEach(n->System.out.print((char) n));
``````
# Stream distinct()
Below code we have list of strings and we will find all distinct strings, collect them into another list and then verify it.
```````
Collection<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
List<String> distinctElements = list.stream().distinct().collect(Collectors.toList());
System.out.println(distinctElements);
 ```````