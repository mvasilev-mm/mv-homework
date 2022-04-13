package com.DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class Dynamic2dMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixRows = 4;
        int matrixColumns = 3;
        int[][] dynamicMatrix = new int[matrixRows][matrixColumns];
        for (int row = 0; row < matrixRows; row++) {
                System.out.printf("Enter three numbers delimeted by interval for row %d: ", row+1);

                int[] tempArray = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e)).toArray();
                dynamicMatrix[row][0] = tempArray[0];
                dynamicMatrix[row][1] = tempArray[1];
                dynamicMatrix[row][2] = tempArray[2];
        }

        for (int row = 0; row < matrixRows; row++) {
            for (int column = 0; column < matrixColumns; column++) {
                System.out.print(dynamicMatrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
