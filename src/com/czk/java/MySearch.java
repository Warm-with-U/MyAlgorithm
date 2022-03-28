package com.czk.java;

public class MySearch {
    public static int Search1(int target, int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    // 要求数组为排序数组
    public static int Search2(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int middle = (start + end) / 2;
        int index = -1;
        while (true) {
            if (target == arr[middle]) {
                index = middle;
                break;
            } else {
                if (target > arr[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
                middle = (start + end) / 2;
            }
            if (start >= end) {
                break;
            }

        }
        return index;

    }
}
