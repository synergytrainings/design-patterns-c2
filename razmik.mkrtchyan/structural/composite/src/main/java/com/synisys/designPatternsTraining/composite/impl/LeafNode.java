package main.java.com.synisys.designPatternsTraining.prototype.impl;

import main.java.com.synisys.designPatternsTraining.prototype.api.Node;

import java.util.Collections;
import java.util.List;

/**
 * Created by Razmik on 6/19/2015.
 */
public class LeafNode<T> extends Node<T> {

    public LeafNode(T data) {
        super(data);
    }

    @Override
    public void printPreOrder() {
        visitToNode(this);
    }

    @Override
    public void visitToNode(Node<T> currRoot) {
        System.out.println(currRoot.getData());
    }

    @Override
    public List<Node<T>> getChild() {
        return Collections.EMPTY_LIST;
    }
}
