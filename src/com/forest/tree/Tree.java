package com.forest.tree;

import com.forest.tree.component.Branch;

import java.util.List;

public abstract class Tree {
    protected String name;
    protected List<Branch> branchList;
    protected long treeTrunk;
    protected long height;
    protected long root;

    public abstract void grow();

    public Tree() {
    }

    public Tree(String name, List<Branch> branchList, long treeTrunk, long height, long root) {
        this.name = name;
        this.branchList = branchList;
        this.treeTrunk = treeTrunk;
        this.height = height;
        this.root = root;
    }

    public Tree(String name, long treeTrunk, long height, long root) {
        this.name = name;
        this.treeTrunk = treeTrunk;
        this.height = height;
        this.root = root;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Branch> getBranchList() {
        return branchList;
    }

    public void setBranchList(List<Branch> branchList) {
        this.branchList = branchList;
    }

    public long getTreeTrunk() {
        return treeTrunk;
    }

    public void setTreeTrunk(long treeTrunk) {
        this.treeTrunk = treeTrunk;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getRoot() {
        return root;
    }

    public void setRoot(long root) {
        this.root = root;
    }
}
