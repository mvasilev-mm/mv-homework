package com.IntroToJava2;

public class ReverseArray {
    public static void main(String[] args) {
        int[] list1 = {10, 20, 30, 40, 50};

        for (int i = list1.length-1; i >= 0; i--) {
            System.out.print(list1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

    }
}
