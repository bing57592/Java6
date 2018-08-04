package com.ysu.leetcode.primary.string;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * created by bing57592
 * 2018-08-03 23:14
 */
public class _03 {
    public static void main(String[] args) {
        String s1 = "aadadaad";
        int i = code_1(s1);
        System.out.println(i);
    }

    public static int code_1(String s) {
        char[] chars = s.toCharArray();
        if (chars.length == 1) {
            return 0;
        }
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    break;
                } else {
                    if (j == chars.length - 1) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
