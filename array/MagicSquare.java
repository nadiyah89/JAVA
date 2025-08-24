import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] A = new int[n][n];

        System.out.println("Enter matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = sc.nextInt();

        int sumDiag1 = 0, sumDiag2 = 0;
        for (int i = 0; i < n; i++) {
            sumDiag1 += A[i][i];
            sumDiag2 += A[i][n - i - 1];
        }
        if (sumDiag1 != sumDiag2) {
            System.out.println("Not a Magic Square.");
            return;
        }

        int target = sumDiag1;
        for (int i = 0; i < n; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += A[i][j];
                colSum += A[j][i];
            }
            if (rowSum != target || colSum != target) {
                System.out.println("Not a Magic Square.");
                return;
            }
        }

        System.out.println("Matrix is a Magic Square!");
    }
}
