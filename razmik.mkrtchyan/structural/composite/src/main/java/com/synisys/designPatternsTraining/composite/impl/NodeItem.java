package main.java.com.synisys.designPatternsTraining.prototype.impl;

import main.java.com.synisys.designPatternsTraining.prototype.api.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Razmik on 6/19/2015.
 */
public class NodeItem<T> extends Node<T> {

    private List<Node<T>> children;

    public NodeItem(T data) {
        super(data);
        this.children = new ArrayList<>();
    }

    @Override
    public void add(Node<T> node) {
        this.children.add(node);
    }

    @Override
    public void remove(Node<T> node) {
        this.children.remove(node);
    }

    @Override
    public Node<T> getChild(Integer ithChild) {
      return    children.get(ithChild);
    }

    @Override
    public void printPreOrder() {
        printPreOrderRec(this);
    }

    private void printPreOrderRec(Node<T> currRoot) {
        if (currRoot == null) {
            return;
        }
        visitToNode(currRoot);
        for (Node<T> aChildren : currRoot.getChild()) {
            printPreOrderRec(aChildren);
        }
    }

    @Override
    public List<Node<T>> getChild() {
        return this.children;
    }

    @Override
    public void visitToNode(Node<T> currRoot) {
        System.out.print(currRoot.getData() + ", ");
    }
}
