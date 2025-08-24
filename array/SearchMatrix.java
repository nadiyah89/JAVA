import java.util.Scanner;

public class SearchMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt(), cols = sc.nextInt();
        int[][] A = new int[rows][cols];

        System.out.println("Enter matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                A[i][j] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (A[i][j] == key) {
                    System.out.println("Element found at (" + i + "," + j + ")");
                    found = true;
                }

        if (!found) System.out.println("Element not found!");
    }
}
