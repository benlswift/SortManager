package org.Sparta.Ben.Manager;

import org.Sparta.Ben.SortPrograms.*;

public class SortFactory {

    public org.Sparta.Ben.SortPrograms.Sorter getSort(String sortType){
		
        org.Sparta.Ben.SortPrograms.Sorter sort = null;
        switch(sortType){
            case "Bubble":
                sort = new BubbleSort();
                break;
            case "Merge":
                sort = new MergeSortImpl();
                break;
            case "Binary Tree":
                sort=new BinaryTreeImpl();
                break;
        }
        return sort;
    }

}
