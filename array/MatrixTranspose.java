import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt(), cols = sc.nextInt();
        int[][] A = new int[rows][cols];

        System.out.println("Enter matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                A[i][j] = sc.nextInt();

        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transpose[j][i] = A[i][j];

        System.out.println("Original Matrix:");
        for (int[] row : A) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }

        System.out.println("Transpose:");
        for (int[] row : transpose) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
