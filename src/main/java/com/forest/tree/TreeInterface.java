package com.forest.tree;

import java.util.Set;

public interface TreeInterface {
    void grow(long x);

    void add(TreeComponent newTreeComponent);

    void remove(TreeComponent newTreeComponent);

    void displayColor();

    Set<TreeComponent> getTreeComponents();

    void setTreeComponents();
}