package main.java.com.synisys.designPatternsTraining.prototype.api;

import java.util.List;

/**
 * Created by Razmik on 6/19/2015.
 */
public abstract class Node<T> {

    private T data;

    public Node(T data) {
        this.data = data;
    }

    public void add(Node<T> node) {
        throw new UnsupportedOperationException();
    }

    public void remove(Node<T> node) {
        throw new UnsupportedOperationException();
    }

    public Node<T> getChild(Integer ithChild) {
        throw new UnsupportedOperationException();
    }
    public List<Node<T>> getChild() {
        throw new UnsupportedOperationException();
    }
    public T getData() {
        return data;
    }

    public abstract void printPreOrder();
    public abstract void visitToNode(Node<T> currRoot);


}
