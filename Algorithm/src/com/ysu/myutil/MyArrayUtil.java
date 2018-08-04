package com.ysu.myutil;


public class MyArrayUtil {

    public static void ergodicArray(int[] nums) {
        System.out.print("{");
        for (int i = 0; i < nums.length; i++) {
            String str = ", ";
            if (i == nums.length - 1) str = "";

            System.out.print(nums[i] + str);

        }
        System.out.print("}");
        System.out.println();
    }
}
