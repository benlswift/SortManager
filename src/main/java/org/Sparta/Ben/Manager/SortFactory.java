package org.Sparta.Ben.Manager;

import org.Sparta.Ben.SortPrograms.*;

public class SortFactory {

    public Sorter getSort(String sortType){
		
        Sorter sort = null;
        switch(sortType){
            case "Bubble":
                sort = new BubbleSort();
                break;
            case "Merge":
                sort = new MergeSort();
                break;
            case "Binary Tree":
                sort=new BinaryTreeImpl();
                break;
        }
        return sort;
    }

}
