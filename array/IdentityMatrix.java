import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] A = new int[n][n];

        System.out.println("Enter matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = sc.nextInt();

        boolean identity = true;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (i == j && A[i][j] != 1) identity = false;
                if (i != j && A[i][j] != 0) identity = false;
            }

        if (identity) System.out.println("Matrix is Identity Matrix.");
        else System.out.println("Matrix is NOT Identity Matrix.");
    }
}
