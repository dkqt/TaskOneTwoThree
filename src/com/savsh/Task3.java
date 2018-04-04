package com.savsh;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 1000, 1};
        changeMinValueToIntAverage(arr);
    }

    private static void changeMinValueToIntAverage(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }

        int min = minOfArray(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == min) {
                arr[i] = sum / arr.length;
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static int minOfArray(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return  min;
    }
}
