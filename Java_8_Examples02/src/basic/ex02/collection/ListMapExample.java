package basic.ex02.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMapExample {
    public static void main(String[] args) {
        Map<String, Integer> testMap = new HashMap<>();
        List<Integer> testList = new ArrayList<>();
        init(testMap, testList);

        printMap(testMap);

        printList(testList);
    }

    private static void printMap(Map<String, Integer> testMap){
        System.err.println("--------------Map--------------");
        testMap.forEach( (k,v) -> System.err.printf("%-2s : %2d\n",k,v));
        System.err.println("--------------Map--------------");
    }
    private static void printList(List<Integer> testList){
        System.err.println("--------------List--------------");
        testList.forEach( i -> System.err.println(i));
        System.err.println("--------------List--------------");
    }



    private static void init(Map<String, Integer> testMap ,List<Integer> testList){
        for (int i = 1; i <= 20; i++){
            testMap.put(String.valueOf(i), i);
            testList.add(i);
        }
    }
}
