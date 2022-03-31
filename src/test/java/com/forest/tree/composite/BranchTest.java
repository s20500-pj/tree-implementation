package com.forest.tree.composite;

import com.forest.tree.TreeComponent;
import com.forest.tree.component.Fruit;
import com.forest.tree.component.Leaf;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


class BranchTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void shouldAddTreeComponent() {
        //given
        TreeComponent branch = new Branch();
        TreeComponent leaf = new Leaf();
        //when
        branch.add(leaf);
        //then
        assertFalse(branch.getTreeComponents().isEmpty());
        assertEquals(1, branch.getTreeComponents().size());
    }

    @Test
    public void shouldRemoveTreeComponent() {
        //given
        TreeComponent branch = new Branch();
        TreeComponent fruit = new Fruit();
        //when
        branch.add(fruit);
        branch.remove(fruit);
        //then
        assertTrue(branch.getTreeComponents().isEmpty());
        assertEquals(0, branch.getTreeComponents().size());
    }

    @Test
    public void shouldDisplayColor() {
        //given
        TreeComponent branch = new Branch();
        TreeComponent fruit = new Fruit("red");
        branch.add(fruit);
        //when
        branch.displayColor();
        //then
        assertFalse(outContent.toString().isEmpty());
    }

    @Test
    public void shouldThrowErrorWhenPassingNegativeSize() {
        //given
        TreeComponent branch = new Branch();
        //when

        //then
        assertThrows(IllegalArgumentException.class, () -> {
            branch.setSize(-1);
        });
    }

    @Test
    public void shouldGrowTreeComponent() {
        //given
        TreeComponent branch = new Branch();
        branch.setSize(1);
        //when
        branch.grow(5);
        //then
        assertEquals(6, branch.getSize());
    }


}