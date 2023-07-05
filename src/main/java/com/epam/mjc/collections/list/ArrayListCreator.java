package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < sourceList.size(); i++) {
            if ((i + 1) % 3 == 0) {
                String str = sourceList.get(i);
                list.add(str);
                list.add(str);

            }
        }
        return list;
    }
}
