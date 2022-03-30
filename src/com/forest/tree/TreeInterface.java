package com.forest.tree;

public interface TreeInterface {
    void grow(long x);

    void add(TreeComponent newTreeComponent);

    void remove(TreeComponent newTreeComponent);

    void displayColor();
}