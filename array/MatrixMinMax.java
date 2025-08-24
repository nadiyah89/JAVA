import java.util.Scanner;

public class MatrixMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt(), cols = sc.nextInt();
        int[][] A = new int[rows][cols];

        System.out.println("Enter matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                A[i][j] = sc.nextInt();

        int max = A[0][0], min = A[0][0];
        int maxRow = 0, maxCol = 0, minRow = 0, minCol = 0;

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                if (A[i][j] > max) { max = A[i][j]; maxRow = i; maxCol = j; }
                if (A[i][j] < min) { min = A[i][j]; minRow = i; minCol = j; }
            }

        System.out.println("Largest: " + max + " at (" + maxRow + "," + maxCol + ")");
        System.out.println("Smallest: " + min + " at (" + minRow + "," + minCol + ")");
    }
}
