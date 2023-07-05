package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> list = new LinkedList<>();
        for (Integer numberList : sourceList) {
            if (numberList % 2 != 0) {
                list.addFirst(numberList);
            } else {
                list.addLast(numberList);
            }
        }
        return list;
    }
}
