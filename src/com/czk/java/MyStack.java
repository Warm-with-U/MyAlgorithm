package com.czk.java;

//栈
public class MyStack {
    int[] elements;

    public MyStack() {
        elements = new int[0];
    }

    // 压栈
    public void push(int element) {
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
    }

    // 出栈
    public int pop() {
        // 判断栈空
        if (elements.length == 0) {
            throw new RuntimeException("Stack is empty");
        }
        // 最后一个元素
        int element = elements[elements.length - 1];
        int[] newArr = new int[elements.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i];
        }
        elements = newArr;
        return element;
    }

    // 取出栈顶元素
    public int peek() {
        return elements[elements.length - 1];
    }

    // 判断栈空
    public boolean isEmpty() {
        return elements.length == 0;
    }
}
