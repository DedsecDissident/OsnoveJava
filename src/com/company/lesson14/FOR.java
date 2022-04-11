package com.company.lesson14;

import java.util.Arrays;

public class FOR { //BubbleSort
    public static void BubbleSort(int [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int index = array[i];
                    array[i] = array[j];
                    array[j] = index;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
