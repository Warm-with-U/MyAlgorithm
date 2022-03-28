package com.czk.java;
//单链表，节点类
public class MyNode {
    private int element;
    private MyNode next;

    // 节点
    public MyNode(int value) {
        element = value;
    }

    // 末尾追加节点
    public MyNode append(MyNode node) {
        MyNode currentNext = this;
        while (currentNext.next != null) {
            currentNext = currentNext.next;
        }
        currentNext.next = node;
        return this;
    }

    // 删除下一节点
    public void removeNode() {
        // 删除下一节点的下一节点
        MyNode after = next.next;
        this.next = after;

    }

    // 插入节点
    public void insertNode(MyNode node) {
        // 保存现有next
        MyNode saveNext = this.next;
        // 接入节点
        this.next = node;
        // 新节点后接入保存节点
        node.next = saveNext;
    }

    // 获取下一节点
    public MyNode getNext() {
        return this.next;
    }

    // 获取节点元素
    public int getData() {
        return this.element;
    }

    // 获取所有节点信息
    public void show() {
        MyNode currentNode = this;
        while (currentNode.next != null) {
            System.out.print(currentNode.getData() + "-");
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.getData());
    }

}
