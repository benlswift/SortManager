package org.Sparta.Ben;
import org.Sparta.Ben.Exceptions.ChildNotFoundException;
import org.Sparta.Ben.SortPrograms.BinaryTreeImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BinaryTreeTest {
    int root = 10;
    int[] arrayOfElement = {4,6,2,7,3,9};
    BinaryTreeImpl binaryTree = new BinaryTreeImpl(root);

    void addElements(){
        binaryTree.addElements(arrayOfElement);
    }

    @Test
    void getNumberOfElementsTest(){
        addElements();
        Assertions.assertEquals(7, binaryTree.getNumberOfElements());
    }
    @Test
    void getRootElementTest(){
        Assertions.assertEquals(10, binaryTree.getRootElement());
    }
    @Test
    void findElementTest(){
        binaryTree.addElements(arrayOfElement);
        Assertions.assertEquals(true, binaryTree.findElement(2));
    }

    @Test
    void getLeftChildTest() throws ChildNotFoundException {
        addElements();
        Assertions.assertEquals(2, binaryTree.getLeftChild(4));
    }
    @Test
    void getRightChildTest() throws ChildNotFoundException {
        addElements();
        Assertions.assertEquals(6, binaryTree.getRightChild(4));

    }
    @Test
    void getSortedTreeAscTest(){
        addElements();
        Assertions.assertEquals(Arrays.toString(new int[]{2, 3, 4, 6, 7, 9, 10}), Arrays.toString(binaryTree.getSortedTreeAsc()));

    }
    @Test
    void getSortedTreeDescTest(){
        addElements();
        Assertions.assertEquals(Arrays.toString(new int[]{10, 9, 7, 6, 4, 3, 2}), Arrays.toString(binaryTree.getSortedTreeDesc()));

    }

}
