import java.util.Scanner;
class CenteredNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int s = n - i; s > 0; s--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + "   ");
            }

            System.out.println();
        }
    }
}
