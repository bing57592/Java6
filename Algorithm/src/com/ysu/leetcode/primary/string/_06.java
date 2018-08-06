/**
 * Copyright (c) 2015, www.jd.com. All rights reserved.
 * <p/>
 * 警告：本计算机程序受著作权法和国际公约的保护，未经授权擅自复制或散布本程序的部分或全部、以及其他
 * 任何侵害著作权人权益的行为，将承受严厉的民事和刑事处罚，对已知的违反者将给予法律范围内的全面制裁。
 */
package com.ysu.leetcode.primary.string;

import sun.misc.HexDumpEncoder;

/**
 * 实现 atoi，将字符串转为整数。
 * <p>
 * 在找到第一个非空字符之前，需要移除掉字符串中的空格字符。如果第一个非空字符是正号或负号，选取该符号，并将其与后面尽可能多的连续的数字组合起来，这部分字符即为整数的值。如果第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * <p>
 * 字符串可以在形成整数的字符后面包括多余的字符，这些字符可以被忽略，它们对于函数没有影响。
 * <p>
 * 当字符串中的第一个非空字符序列不是个有效的整数；或字符串为空；或字符串仅包含空白字符时，则不进行转换。
 * <p>
 * 若函数不能执行有效的转换，返回 0。
 * Created by 陈宪东 on 2018/8/6 19:21
 */
public class _06 {
    public static void main(String[] args) {

    }

    public static int code_1(String str) {
        char[] chars = str.toCharArray();
        int headIndex = 0;
        boolean negative = false;// 负数的标识
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                headIndex++;
            } else {
                if (chars[headIndex] == '-') {
                    negative = true;
                } else {
                    negative = false;
                }
            }
        }

        return 0;
    }
}
