package com.forest.tree;

import com.forest.tree.component.Branch;
import com.forest.tree.component.Fruit;

import java.util.List;

public class LeafyTree extends Tree {

    private List<Fruit> fruitList;

    public LeafyTree() {
        super();
    }

    public LeafyTree(String name, long treeTrunk, long height, long root) {
        super(name, treeTrunk, height, root);
    }

    public LeafyTree(String name, List<Branch> branchList, long treeTrunk, long height, long root) {
        super(name, branchList, treeTrunk, height, root);
    }

    public LeafyTree(String name, List<Branch> branchList, long treeTrunk, long height, long root, List<Fruit> fruitList) {
        super(name, branchList, treeTrunk, height, root);
        this.fruitList = fruitList;
    }


    @Override
    public void grow() {

    }

    public void dropLeafs() {
        for (Branch branch : branchList){
            branch.dropLeafs();
        }
    }

    public void changeColorOfLeafs(String color) {
        for (Branch branch : branchList){
            branch.changeColor(color);
        }
    }


    public List<Fruit> getFruitList() {
        return fruitList;
    }

    public void setFruitList(List<Fruit> fruitList) {
        this.fruitList = fruitList;
    }


}
