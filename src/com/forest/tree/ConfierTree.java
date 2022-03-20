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

    public ConfierTree(String name, List<Branch> branchList, long treeTrunk, long height, long root) {
        super(name, branchList, treeTrunk, height, root);
    }

    public ConfierTree(String name, List<Branch> branchList, long treeTrunk, long height, long root, List<WoodyCones> woodyConesList) {
        super(name, branchList, treeTrunk, height, root);
        this.woodyConesList = woodyConesList;
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
