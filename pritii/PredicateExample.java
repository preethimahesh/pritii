package com.kg.lambdaapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.function.*;

class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numberList.forEach(System.out::println);
        //List<Integer> evenNumberList=PredicateExample.testPredicate(numberList,x->PredicateExample.IsEvenNumber(x));
        //ContainingClass::staticMethodName
        List<Integer> evenNumberList = PredicateExample.testPredicate(numberList, PredicateExample::IsEvenNumber);
        System.out.println(evenNumberList);
    }

    public static boolean IsEvenNumber(Integer x) {
        return (x & 1) == 0;
    }

    public static List<Integer> testPredicate(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> returnList = new ArrayList<>();
        for (Integer x : list) {
            if (predicate.test(x))
                returnList.add(x);
        }
        return returnList;
    }
}
