package com.prep.spring.test;

//import org.springframework.data.relational.core.sql.In;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class java_stream {

    static PriorityQueue<Integer> priorityQueue = new PriorityQueue<>() {
        @Override
        public Comparator<? super Integer> comparator() {
            return (Comparator<Integer>) (o1, o2) -> 0;
        }
    };

    public static void main(String[] args) {
//        findPalindrome();

        List<Integer> list = List.of(10, 20, 30, 40);
        //list.remove(20);
        Map<Integer, Integer> cache1 = new ConcurrentHashMap();
        cache1.put(1, 1);
        cache1.put(2, 2);
        cache1.put(3, 3);
        cache1.put(4, 4);
        cache1.put(5, 5);
        System.out.println("Before " + cache1);
        cache1.remove(3);
        System.out.println("Before " + cache1);
        Map<Integer, Integer> cache = new ConcurrentHashMap(cache1);


        //count_1();
    }

    static int capacity;
    public static LinkedHashMap<Integer, Integer> lruCache = new LinkedHashMap
            (capacity, 0.75f, true) {
        protected boolean removeEldestEntry() {
            return size() > capacity;
        }
    };

    public static void javaGen1() {
        Deque<Integer> arr = new ArrayDeque<>();
    }

    public static void findPalindrome() {
        String input = "tttt tt tttt";
        char[] charArray = input.toLowerCase().toCharArray();
        int len = charArray.length;
        boolean b = IntStream.range(0, input.length() / 2).allMatch(i -> charArray[i] == charArray[len - 1 - i]);
        System.out.println(b);
    }

    public static void count_1() {
        int[] arr = new int[]{1, 2, 3};
        Map<String, String> statusMap = Map.of(
                "200", "OK",
                "404", "Not Found",
                "500", "Internal Server Error"
        );

        String str = "Internal Server Error";
        str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Function<Object, Object>, Long> collect =
                statusMap.values().stream()
                        .flatMap(t -> t.chars().mapToObj(k -> (char) k)).
                        collect(Collectors.toSet()).stream()
                        .collect(Collectors.groupingBy(
                                t -> Function.identity(), Collectors.counting()));

        System.out.println("grouping");
    }

    public static void count() {
        int[] arr = new int[]{1, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Map<String, String> statusMap = Map.of(
                "200", "OK",
                "404", "Not Found",
                "500", "Internal Server Error"
        );

        Map<Character, Long> collect = statusMap.values().stream().flatMap(t -> t.chars().mapToObj(i -> (char) i))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<String> allStrs = new ArrayList<>();
        allStrs.add("zabc");
        allStrs.add("xyz");
        allStrs.add("pabc");
        allStrs.sort(Comparator.naturalOrder());
        allStrs.sort(Comparator.reverseOrder());
        Arrays.sort(allStrs.toArray());
        allStrs.stream().sorted();

        System.out.println("test");
    }


}
