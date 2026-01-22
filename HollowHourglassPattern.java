import java.util.Scanner;
public class HollowHourglassPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==i || i==n){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int s=1;s<=n-i+1;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==n ||j==1 || j==i || i==n){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
            
    }
}
