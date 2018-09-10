/**
 * Copyright (c) 2015, www.jd.com. All rights reserved.
 * <p/>
 * 警告：本计算机程序受著作权法和国际公约的保护，未经授权擅自复制或散布本程序的部分或全部、以及其他
 * 任何侵害著作权人权益的行为，将承受严厉的民事和刑事处罚，对已知的违反者将给予法律范围内的全面制裁。
 */
package com.ysu.leetcode._02_middle._01_array;

import com.ysu.myutil.MyArrayUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法。
 * Created by 陈宪东 on 2018/9/10 10:54
 */
public class _02 {
    public static void main(String[] args) {
        int row = 4;
        int col = 3;
        int[][] matrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        MyArrayUtil.ergodicMatrix(matrix);
        code_1(matrix);
        MyArrayUtil.ergodicMatrix(matrix);
    }

    public static void code_1(int[][] matrix) {
        List<int[]> coordinates = new ArrayList<int[]>();
        for (int i = 0; i < matrix.length; i++) {//行数
            for (int j = 0; j < matrix[i].length; j++) {//列数
                if (matrix[i][j] == 0) {
                    int[] coordinate = {i, j};// 元素为0的坐标
                    coordinates.add(coordinate);
                }
            }
        }
        for (int[] coordinate : coordinates) {//对每个坐标为0的元素进行操作.
            //对于(1,0)这个元素
            for (int i = 0; i < matrix.length; i++) {//按行遍历列数相同的元素, 置为0
                matrix[i][coordinate[1]] = 0;// matrix[i][coordinate[1]]
            }
            for (int i = 0; i < matrix[0].length; i++) {//按列遍历行元素相同, 置为0
                matrix[coordinate[0]][i] = 0;// matrix[coordinate[0]][i]
            }

        }
    }
}
