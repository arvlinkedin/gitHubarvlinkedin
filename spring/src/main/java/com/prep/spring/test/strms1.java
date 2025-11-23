package com.prep.spring.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class strms1 {
    /*
    This exercise is to create the minimum number of complete combinations from the input
    arrays of strings to guarantee that all tuples of size 'order' are covered.
For example, given the input:
[["a", "b", "c"], ["1", "2", "3"]] and an order of 2, the output would be:
[["a", "1"], ["a", "2"], ["a", "3"],
["b", "1"], ["b", "2"], ["b", "3"],
["c", "1"], ["c", "2"], ["c", "3"]]
     */

    public static void main(String[] args) {
        String[] input1 = new String[] {"a", "b", "c"};
        String[] input2 = new String[] {"1", "2", "3", "4", "5"};
        int order = 4;
//        List<List<String>> output =  new ArrayList();
        List<String> output =  new ArrayList();
        Arrays.stream(input1).toList().forEach(t -> {
            for(int i = 0; i<= input2.length -1; i++) {
                if( i + order - 1 <= input2.length) {
                    List<String> tmp =  new ArrayList();
                    String tmpStr= "";
                    tmp.add(t);
                    tmpStr += "[" + t + ",";
                    for (int j = i; j < i + order - 1; j++) {
                        tmp.add(input2[j]);
                        tmpStr += input2[j] + ",";
                    }
                    tmpStr = tmpStr.substring(0, tmpStr.length()-1);
                    tmpStr += "]";

                    output.add(tmpStr);
                } else break;
            }


        });

        System.out.println(Arrays.toString(output.toArray()));

        List<String> list1 = Arrays.asList("A", "B", "C");
        List<Integer> list2 = Arrays.asList(1, 2, 3);
//        IntStream.range(0,3).mapToObj(list2.)
//        list2.stream().limit(i)
//        IntStream.range(0, list1.size()).mapToObj(i-> list1.get(i) + "," + lis)

        List<String> zipped = IntStream.range(0, Math.min(list1.size(), list2.size()))
                .mapToObj(i -> list1.get(i) + "-" + list2.get(i))
                .collect(Collectors.toList());

        zipped.forEach(System.out::println);

    }
}
