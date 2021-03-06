package com.DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixNxN = 4;
        int[][] dynamicMatrix = new int[matrixNxN][matrixNxN];
        for (int row = 0; row < matrixNxN; row++) {
            System.out.printf("Enter four numbers delimeted by interval for row %d: ", row+1);

            int[] tempArray = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e)).toArray();
            dynamicMatrix[row][0] = tempArray[0];
            dynamicMatrix[row][1] = tempArray[1];
            dynamicMatrix[row][2] = tempArray[2];
            dynamicMatrix[row][3] = tempArray[2];
        }

        for (int row = 0; row < matrixNxN; row++) {
            for (int column = 0; column < matrixNxN; column++) {
                System.out.print(dynamicMatrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int summedDiagonal = 0;
        for (int row = 0; row < matrixNxN; row++) {
            for (int column = 0; column < matrixNxN; column++) {
                if (column == row) {
                    summedDiagonal += dynamicMatrix[row][column];
                }
            }
        }

        System.out.printf("The sum of the diagonal of this matrix is: %d", summedDiagonal);

    }
}
