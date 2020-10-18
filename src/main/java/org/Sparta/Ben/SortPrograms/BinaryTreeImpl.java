/**
 *
 * @author Ben Swift
 *
 */
package org.Sparta.Ben.SortPrograms;
import org.Sparta.Ben.Exceptions.ChildNotFoundException;


public class BinaryTreeImpl implements BinaryTree, Sorter {

    public static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
            left = null;
            right = null;
        }
    }
    private int arrayOfNodes[];
    private int counter;

    Node root;


    @Override
    public int[] sortArray(int[] arrayToSort) {
        addElements(arrayToSort);
        return getSortedTreeAsc();
    }

    public BinaryTreeImpl(int value) {//set the root
        root = new Node(value);
    }
    public BinaryTreeImpl() {
    }
    @Override
    public int getRootElement() {//DONE
        return root.value;
    }

    @Override
    public int getNumberOfElements() {//DONE
        if (root == null){
            return 0;
        }
        return countElements(root);
    }

    @Override
    public void addElement(int element) {//DONE
        if (root == null){
            root = new Node(element);
        }
        else{
            insert(root, element);
        }
    }

    @Override
    public void addElements(int[] elements) {//DONE
        for (int i=0;i<elements.length;i++){
            addElement(elements[i]);
        }
    }

    @Override
    public boolean findElement(int value) {//DONE
        Node n = findNode(value);
        if (n != null){
            return true;
        }
        return false;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException{//DONE
        //find node with element
        //return root.left

        Node node = findNode(element);//find the node with element value
        if (node != null) {
            return node.left.value;
        }
        throw new ChildNotFoundException();
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {//DONE
        Node node = findNode(element);//find the node with element value
        if (node != null) {
            return node.right.value;
        }
        throw new ChildNotFoundException();

    }

    @Override
    public int[] getSortedTreeAsc() {//half done --> need to put into array
        arrayOfNodes = new int[getNumberOfElements()];
        counter = 0;
        sortAsc(root);
        return arrayOfNodes;
    }

    @Override
    public int[] getSortedTreeDesc() {//half done --> need to put into array
        arrayOfNodes = new int[getNumberOfElements()];
        counter = 0;
        sortDesc(root);
        return arrayOfNodes;
    }

    public void sortAsc(Node root) {
        if (root != null) {
            sortAsc(root.left);
            arrayOfNodes[counter] = root.value;
            counter++;
            sortAsc(root.right);
        }

    }

    public void sortDesc(Node root) {
        if (root != null) {
            sortDesc(root.right);
            arrayOfNodes[counter] = root.value;
            counter++;
            sortDesc(root.left);
        }
    }

    Node insert(Node root, int value){
        if (root==null){
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insert(root.left, value);
        }
        else{
            root.right = insert(root.right, value);
        }

        return root;
    }

    Node findNode(int value){
        Node node = root;
        while (node!=null){
            if(value == node.value){
                return node;
            }
            if (value < node.value){
                node = node.left;
            }
            else{
                node = node.right;
            }
        }
        return node;
    }
    int countElements(Node root){
        int count =1;//count root element
        if (root.left !=null){//count all left elements until empty
            count+=countElements(root.left);
        }
        if (root.right != null){
            count+=countElements(root.right);
        }
        return count;
    }
}
