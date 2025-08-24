import java.util.Scanner;

public class RowColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt(), cols = sc.nextInt();
        int[][] A = new int[rows][cols];

        System.out.println("Enter matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                A[i][j] = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++)
                rowSum += A[i][j];
            System.out.println("Sum of row " + i + ": " + rowSum);
        }

        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++)
                colSum += A[i][j];
            System.out.println("Sum of column " + j + ": " + colSum);
        }
    }
}
