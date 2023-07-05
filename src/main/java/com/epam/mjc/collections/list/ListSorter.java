package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int result = calculateFunctionValue(a) - calculateFunctionValue(b);

        if (result == 0) {
            return Integer.parseInt(a) - Integer.parseInt(b);
        }
        return result;
    }

    private int calculateFunctionValue(String str) {
        int x = Integer.parseInt(str);
        return (5 * x * x) + 3;
    }
}
