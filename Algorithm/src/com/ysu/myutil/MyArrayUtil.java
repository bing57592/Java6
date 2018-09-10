package com.ysu.myutil;


import org.junit.Test;

import java.util.Arrays;

public class MyArrayUtil {
    /**
     * 遍历数组
     *
     * @param nums
     */
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

    /**
     * 将矩阵打印出来
     *
     * @param nums
     */
    public static void ergodicMatrix(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {//行数
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
    }

    @Test
    public void test2() {
        int nums[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        // int[3][4]  int[4][3]
        ergodicMatrix(nums);
    }

    public static int[] sortArray(int nums[]) {
        Arrays.sort(nums);
        return nums;
    }

}
