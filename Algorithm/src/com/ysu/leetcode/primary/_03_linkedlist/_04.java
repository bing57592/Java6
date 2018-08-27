/**
 * Copyright (c) 2015, www.jd.com. All rights reserved.
 * <p/>
 * 警告：本计算机程序受著作权法和国际公约的保护，未经授权擅自复制或散布本程序的部分或全部、以及其他
 * 任何侵害著作权人权益的行为，将承受严厉的民事和刑事处罚，对已知的违反者将给予法律范围内的全面制裁。
 */
package com.ysu.leetcode.primary._03_linkedlist;

import com.ysu.leetcode.primary._00_domain.ListNode;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。
 * Created by 陈宪东 on 2018/8/24 17:51
 */
public class _04 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(4);

        node1.setNext(node2.setNext(node3));

        node4.setNext(node5.setNext(node6));
        ListNode listNode = code_1(node1, node4);

        System.out.println(listNode);

    }

    public static ListNode code_1(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode now = new ListNode();
        while (l1 != null || l2 != null) {// 只要有一个链表没有撸完, 就需要做如下操作.
            if (l1.val <= l2.val) {
                now = l1;
                now.next = now;
            } else {
                now = l2;
                now.next = now;
            }
        }

        return listNode;
    }
}
