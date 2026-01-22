import java.util.Scanner;
public class PascalsTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            int count = 1;
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count = count * (i - j) / j;
            }
            System.out.println();
        }
    }
}
