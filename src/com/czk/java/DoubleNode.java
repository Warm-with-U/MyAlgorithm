package com.czk.java;

//循环双向链表
public class DoubleNode {
    private DoubleNode pre = this;
    private DoubleNode next = this;
    private int element;

    public DoubleNode(int element) {
        this.element = element;
    }

    // 插入节点
    public void insert(DoubleNode node) {
        // 保存原上下节点
        DoubleNode saveNode = this.next;

        this.next = node;
        node.pre = this;
        // 尾节点重新接上一节点
        node.next = saveNode;
        saveNode.pre = node;
    }

    // 获取节点数据
    public int getData() {
        return this.element;
    }

    // 获取下一节点
    public DoubleNode getNext() {
        return this.next;
    }

    // 获取上一节点
    public DoubleNode getPre() {
        return this.pre;
    }
}
