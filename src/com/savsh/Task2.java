package com.savsh;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 6, 7, 7, 7, 20, 30, 30, 4, 3, 2, 1, 30, 30, 30};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isElementHaveDuplicates = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isElementHaveDuplicates = true;
                }
            }
            if (!isElementHaveDuplicates) {
                arr[counter] = arr[i];
                counter++;
            }
        }

        int[] tempArr = new int[counter];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = arr[i];
        }
        arr = tempArr;

        System.out.println(Arrays.toString(arr));
    }
}
