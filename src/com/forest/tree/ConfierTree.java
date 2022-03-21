package com.forest.tree;

import com.forest.tree.component.Branch;
import com.forest.tree.component.WoodyCones;

import java.util.List;

public class ConfierTree extends Tree {
    private List<WoodyCones> woodyConesList;

    public ConfierTree() {
        super();
    }

    public ConfierTree(String name, long treeTrunk, long height, long root) {
        super(name, treeTrunk, height, root);
    }

    @Override
    public void grow() {

    }

    public List<WoodyCones> getWoodyConesList() {
        return woodyConesList;
    }

    public void setWoodyConesList(List<WoodyCones> woodyConesList) {
        this.woodyConesList = woodyConesList;
    }
}
