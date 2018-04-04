package com.savsh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 100, 200, 1, 4, 5, 6, 6, 20, 20, 20, 20));
        System.out.println(list);
        changeE1ToE2InFirstHalfOfList(list, 1, 1000);
        System.out.println(list);
    }

    private static void changeE1ToE2InFirstHalfOfList(List list, Integer e1, Integer e2) {
        for (int i = 0; i < list.size() / 2; i++) {
            if (list.get(i).equals(e1)) {
                list.set(i, e2);
            }
        }
    }
}
