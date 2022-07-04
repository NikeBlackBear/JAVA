package basic.ex04.stream;

import java.util.Arrays;
import java.util.stream.Stream;

/*
Stream<T> Collection.stream();

Stream<Integer> list= Arrays.asList(1,2,3,4,5);
Stream<Integer> intStream = list.stream();
Stream<String> strStream = Steam.of(new Stirng[]{"a","b","c"});
Stream<Integer> evenStream = Stream.iterate(0, n->n+2);

 */
public class StreamExample {
    public static void main(String[] args) {
        strStreamTest();
        intStreamTest();
        infinityStreamTest();
    }

    private static void strStreamTest(){
        String[] strArr = {"a","b","c"};
        Stream<String> stream1 = Stream.of(strArr);
        Stream<String> stream2 = Arrays.stream(strArr);

        stream1.forEach(System.out :: println);
    }

    //기본형 Stream
    private static void intStreamTest(){
        System.out.println("-----------------------------------");
        int[] intArr = {1,2,3,4,5};
        System.out.printf("Max=%s\n",Arrays.stream(intArr).max());
        System.out.printf("Count=%s\n",Arrays.stream(intArr).count());
        System.out.printf("Average=%s\n",Arrays.stream(intArr).average());
        System.out.printf("Sum=%s\n",Arrays.stream(intArr).sum());
    }

    //limit()
    //skip()
    //distinct()
    //filter()
    //sorted()
    private static void infinityStreamTest(){
        System.out.println("------------------------");

        //iterate는 초기값 필요.
        Stream<Integer> oddStream = Stream.iterate(0, n->n+2);
        oddStream.limit(20).forEach(System.out :: println);

        System.out.println("------------------------");
        //generate는 초기값 필요X
        Stream<Integer> oneStream = Stream.generate(() -> 1);
        oneStream.limit(10).forEach(System.out :: println);
    }
}
