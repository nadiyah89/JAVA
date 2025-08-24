import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First matrix
        System.out.print("Enter rows and cols of first matrix: ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        int[][] A = new int[r1][c1];
        System.out.println("Enter first matrix:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();

        // Second matrix
        System.out.print("Enter rows and cols of second matrix: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();
        int[][] B = new int[r2][c2];
        System.out.println("Enter second matrix:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();

        // Check valid dimensions
        if (c1 != r2) {
            System.out.println("Multiplication not possible!");
            return;
        }

        int[][] product = new int[r1][c2];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    product[i][j] += A[i][k] * B[k][j];

        System.out.println("Product Matrix:");
        for (int[] row : product) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
