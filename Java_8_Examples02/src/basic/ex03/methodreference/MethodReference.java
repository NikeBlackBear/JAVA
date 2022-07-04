package basic.ex03.methodreference;

import java.util.function.Function;

public class MethodReference {
    public static void main(String[] args) {
        //1
        //        Function<String,Integer> f = (String s) -> Integer.parseInt(s);
        Function<String,Integer> f = Integer :: parseInt;
        System.err.println(f.apply("100")+100);

        //2
        Function<Integer, TestClass> supply = TestClass::new;
        System.out.println(supply.apply(2).i);

    }
}

class TestClass{
    int i;

    TestClass(int i){
        this.i = i;
    }
}
