package com.czk.java;

public class MySort {
    // 冒泡排序
    public static void MyBubble(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int temp;
        boolean flag;
        for (int i = 0; i < nums.length; i++) {
            flag = false;// 是否发生了交换
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    // 快速排序
    public static void MyQuickSort(int[] nums, int start, int end) {

        // 无if将出现栈溢出，递归停不下来
        if (start < end) {
            int standard = nums[start];
            int low = start;
            int height = nums.length - 1;
            while (low < height) {
                while (nums[height] > standard && low < height) {
                    height--;
                }
                nums[low] = nums[height];
                while (nums[low] < standard && low < height) {
                    low++;
                }
                nums[height] = nums[low];
            }
            nums[low] = standard;
            MyQuickSort(nums, start, low);
            MyQuickSort(nums, height + 1, end);

        }
    }

    // 直接插入排序
    public static void insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int value = nums[0];
            for (int j = i; j < nums.length; j++) {

            }

        }
    }

}
