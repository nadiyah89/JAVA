import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] A = new int[n][n];

        System.out.println("Enter matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = sc.nextInt();

        boolean symmetric = true;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (A[i][j] != A[j][i])
                    symmetric = false;

        if (symmetric) System.out.println("Matrix is Symmetric.");
        else System.out.println("Matrix is NOT Symmetric.");
    }
}
