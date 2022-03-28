package com.czk.java;

//单链表，节点类
public class MyLoopNode {
    private int element;
    private MyLoopNode next = this;

    // 节点
    public MyLoopNode(int value) {
        element = value;
    }

    // 删除下一节点
    public void removeNode() {
        // 删除下一节点的下一节点
        MyLoopNode after = next.next;
        this.next = after;
    }

    // 插入节点
    public void insertNode(MyLoopNode node) {
        // 保存现有next
        MyLoopNode saveNext = this.next;
        // 接入节点
        this.next = node;
        // 新节点后接入保存节点
        node.next = saveNext;
    }

    // 获取下一节点
    public MyLoopNode getNext() {
        return this.next;
    }

    // 获取节点元素
    public int getData() {
        return this.element;
    }

}
