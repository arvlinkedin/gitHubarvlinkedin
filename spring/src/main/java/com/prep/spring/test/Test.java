package com.prep.spring.test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {


    public static int countLessThan(int[] nums, int lessThan) {
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < lessThan) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left; // number of elements less than 'lessThan'
    }

    public static void main(String[] args) {
        String str1 = """
                234324234
                234234234
                23423423
                234234""";
        int[] nums = {1, 3, 5, 7, 9, 11};
        Set set = new HashSet();

        int value = 8;
        System.out.println("Count: " + countLessThan(nums, value)); // Output: 4
    }


}
