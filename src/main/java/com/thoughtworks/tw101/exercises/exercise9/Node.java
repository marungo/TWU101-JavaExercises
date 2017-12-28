package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
        left = null;
        right = null;
    }

    public void add(String nameOfNewNode) {
        if      (left == null && nameOfNewNode.compareTo(name) <= 0) left = new Node(nameOfNewNode);
        else if (right == null && nameOfNewNode.compareTo(name) >= 0) right = new Node(nameOfNewNode);

        else {

            if (nameOfNewNode.compareTo(name) <= 0)
                left.add(nameOfNewNode);
            else
                right.add(nameOfNewNode);
        }
    }

    public List<String> names() {
        List<String> lst = new ArrayList<>();
        if (left != null) lst.addAll(left.names());
        lst.add(name);
        if (right != null) lst.addAll(right.names());
        return lst;
    }
}
