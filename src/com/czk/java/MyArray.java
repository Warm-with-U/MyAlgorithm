package com.czk.java;

import java.util.Arrays;

// 封装一个数组类
public class MyArray {
    // 用于存储数据的数组
    private int[] elements;

    // 构造方法
    public MyArray() {
        elements = new int[0];
    }

    // 获取数组长度
    public int size() {
        return elements.length;
    }

    // 数组末尾添加一个元素
    public void add(int element) {
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
    }

    // 打印数组
    public void show() {
        System.out.println(Arrays.toString(elements));
    }

    // 删除数组中的元素
    public void delete(int index) {
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        int[] newArr = new int[elements.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = elements[i];
            } else {
                newArr[i] = elements[i + 1];
            }
        }
        elements = newArr;
    }

    // 获取某个下标元素
    public int get(int index) {
        return elements[index];
    }

    // 插入元素到指定位置
    public void insert(int index, int element) {
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        int[] newArr = new int[elements.length + 1];
        for (int i = elements.length; i >= 0; i--) {
            if (i > index) {
                newArr[i] = elements[i - 1];
            } else {
                newArr[i] = elements[i];
            }
            newArr[index] = element;

        }
        elements = newArr;
    }

    // 替换指定位置元素
    public void set(int index, int element) {
        elements[index] = element;
    }
}
