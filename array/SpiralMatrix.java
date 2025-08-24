import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt(), cols = sc.nextInt();
        int[][] A = new int[rows][cols];

        System.out.println("Enter matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                A[i][j] = sc.nextInt();

        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        System.out.println("Spiral Order:");
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++)
                System.out.print(A[top][j] + " ");
            top++;

            for (int i = top; i <= bottom; i++)
                System.out.print(A[i][right] + " ");
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--)
                    System.out.print(A[bottom][j] + " ");
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(A[i][left] + " ");
                left++;
            }
        }
    }
}
