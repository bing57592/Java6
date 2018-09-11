/**
 * Copyright (c) 2015, www.jd.com. All rights reserved.
 * <p/>
 * 警告：本计算机程序受著作权法和国际公约的保护，未经授权擅自复制或散布本程序的部分或全部、以及其他
 * 任何侵害著作权人权益的行为，将承受严厉的民事和刑事处罚，对已知的违反者将给予法律范围内的全面制裁。
 */
package com.ysu.leetcode._02_middle._01_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个字符串数组，将字母异位词组合在一起。
 * 字母异位词指字母相同，但排列不同的字符串。
 * <p>
 * 能实现功能, 但是超时了
 * Created by 陈宪东 on 2018/9/10 14:40
 */
public class _03 {
    public static void main(String[] args) {
        String strs[] = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = code_1(strs);
        for (List<String> list : lists) {
            System.out.println(list.size());
        }

    }

    public static List<List<String>> code_1(String[] strs) {
        Integer indexArray[] = new Integer[strs.length];
        List<List<String>> resultList = new ArrayList<List<String>>();
        for (int i = 0; i < strs.length; i++) {
            indexArray[i] = i;
        }
        for (int i = 0; i < indexArray.length; i++) {
            if (indexArray[i] != null) {//如果为null, 说明之前的元素判断时满足条件后, 将当前元素抹掉了.
                List<String> list = new ArrayList<String>();
                list.add(strs[i]);
                for (int j = i + 1; j < indexArray.length; j++) {//选中元素之后, 撸后续元素, 判断是否满足条件


                    if (judge(strs[i], strs[j])) {// == 是一种比较简单的判断, 后续改成另一种方法.
                        list.add(strs[j]);//将第J个元素放进集合中
                        indexArray[j] = null;// 将第J个元素索引置空
                    }
                }
                resultList.add(list);
            }
        }
        return resultList;
    }

    public static boolean judge(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for (int i = 0; i < chars2.length; i++) {
            if (chars1[i] != chars2[i]) return false;
        }

        return true;
    }
}
