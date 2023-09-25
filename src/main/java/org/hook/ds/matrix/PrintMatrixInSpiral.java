package org.hook.ds.matrix;

public class PrintMatrixInSpiral {
  public static void main(String[] args) {
    int[][] matrix = {
        {10, 20, 30, 40},
        {15, 25, 35, 45},
        {27, 29, 37, 48},
        {32, 33, 39, 51},
    };
    spiralPrint(matrix, matrix.length, matrix[0].length);
  }

  public static void spiralPrint(int[][] matrix, int row, int col) {
    int i, tempRow = 0, tempCol = 0;
    while (tempRow < row && tempCol < col) {
      for (i = tempCol; i < col; i++) {
        System.out.print(matrix[tempRow][i] + " ");
      }
      tempRow++;
      for (i = tempRow; i < row; i++) {
        System.out.print(matrix[i][col - 1] + " ");
      }
      col--;
      if (tempRow < row) {
        for (i = col - 1; i >= tempCol; i--) {
          System.out.print(matrix[row - 1][i] + " ");
        }
        row--;
      }
      if (tempCol < col) {
        for (i = row - 1; i >= tempRow; i--) {
          System.out.print(matrix[i][tempCol] + " ");
        }
        tempCol++;
      }
    }
  }
}
