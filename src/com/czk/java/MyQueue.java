package com.czk.java;

public class MyQueue {
    int[] elements;

    public MyQueue() {
        elements = new int[0];
    }

    // 入队
    public void add(int element) {
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
    }

    // 出队
    public int poll() {
        int element = elements[0];
        int[] newArr = new int[elements.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i + 1];
        }
        elements = newArr;
        return element;
    }

    // 判断队空
    public boolean isEmpty() {
        return elements.length == 0;
    }
}
