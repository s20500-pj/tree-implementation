package com.forest.tree.component;

import java.util.List;

public class Branch {
    private List<Leaf> leafList;

    public Branch(List<Leaf> leafList) {
        this.leafList = leafList;
    }

    public List<Leaf> getLeafList() {
        return leafList;
    }

    public void setLeafList(List<Leaf> leafList) {
        this.leafList = leafList;
    }

    public void increaseLeafAmount(String color) {
        leafList.add(new Leaf(color));

    }
    public void dropLeafs(){
        this.leafList.clear();
    }
    public void changeColor(String color){
        for (Leaf leaf : leafList){
            leaf.setColor(color);
        }
    }
}
