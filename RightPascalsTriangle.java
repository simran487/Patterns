public class RightPascalsTriangle{
    public static void main(String[] args) {

        int n = 4;   

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                System.out.print("*");

                for (int s = 0; s < i * 2; s++) {
                    System.out.print(" ");
                }

                if (i != 0)
                    System.out.print("*");

            } else {
                
                for (int s = 0; s < 2; s++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int s = 0; s < (i - 1) * 2; s++) {
                    System.out.print(" ");
                }

                if (i > 1)
                    System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {

            if (i % 2 == 0) {
                System.out.print("*");

                for (int s = 0; s < i * 2; s++) {
                    System.out.print(" ");
                }

                if (i != 0)
                    System.out.print("*");

            } else {
                for (int s = 0; s < 2; s++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int s = 0; s < (i - 1) * 2; s++) {
                    System.out.print(" ");
                }

                if (i > 1)
                    System.out.print("*");
            }

            System.out.println();
        }
    }
}
