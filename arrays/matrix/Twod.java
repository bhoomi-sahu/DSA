import java.util.Scanner;

public class Twod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter number of rows and columns:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int num[][] = new int[row][col];

        // Input elements
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        // Output elements
        System.out.println("Array elements are:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println(); // moves to the next row
        }

        sc.close(); // good practice to close scanner
    }
}

