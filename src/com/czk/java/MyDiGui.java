package com.czk.java;

public class MyDiGui {
    // 普通递归小案例
    public static void show(int i) {
        if (i > 0) {
            System.out.println(i);
            show(i - 1);
        }
    }

    // 斐波那契数列
    // 1，1，2，3，5，8，13....除1，2项外，其他项为前面两项之和
    public static int febonaci(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return febonaci(i - 1) + febonaci(i - 2);
        }
    }

    // 汉诺塔问题
    // n盘子数量，A:A柱子，B：B柱子，C：C柱子
    public static void hanota(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println("第" + n + "个盘子from " + A + " to " + C);
        } else {
            hanota(n - 1, A, C, B);// 借助C柱子，把n-1移到B柱子
            System.out.println("第" + n + "个盘子从" + A + "移到" + C);// 最后的盘子由A到C
            hanota(n - 1, B, A, C);// 借助A柱子，把n-1盘子移到C柱子
        }
    }
}
