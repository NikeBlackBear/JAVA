package l01.functionalinterface.ex02;

import java.util.function.*;

public class Ex02Main {
    public static void main(String[] args) {
        System.out.println("------------Function------------");
        Function<Integer,Integer> plus10_2  = i-> i+10;
        System.out.println(plus10_2.apply(1));
        Function<Integer,Integer> multiply2 = i-> i*2;
        System.out.println(multiply2.apply(10));

        Function<Integer, Integer> multiply2AndPlus10 = plus10_2.compose(multiply2);
        System.out.println(multiply2AndPlus10.apply(10));

        Function<Integer, Integer> plus10AndMutiply = plus10_2.andThen(multiply2);
        System.out.println(plus10AndMutiply.apply(10));


        System.out.println("------------BiFunction------------");
        BiFunction<Integer,Integer,Integer> sum = (i,j) -> i+j;
        System.out.println(sum.apply(10,20));

        System.out.println("------------Consumer------------");
        Consumer<Integer> print = (i)-> System.out.println(i);
        print.accept(10);

        System.out.println("------------Supplier------------");
        Supplier<Integer> get10 = ()-> 10;
        System.out.println(get10.get());

        System.out.println("------------Predicate------------");
        Predicate<Integer> isOdd = (i)-> i%2 == 1;
        System.out.println(isOdd.test(10));
        System.out.println(isOdd.test(9));

        System.out.println("------------UnaryOperator------------");
        Function<Integer,Integer> plus10_f  = i-> i+10;
        System.out.println(plus10_f.apply(10));
        UnaryOperator<Integer> plus10_u  = i-> i+10;
        System.out.println(plus10_u.apply(10));

        System.out.println("------------BinaryOperator------------");
        BiFunction<Integer,Integer,Integer> sum_bf = (i,j) -> i+j;
        System.out.println(sum_bf.apply(10,20));
        BinaryOperator<Integer> sum_bn =  (i,j) -> i+j;
        System.out.println(sum_bn.apply(10,20));
    }
}
