import java.util.Scanner;
public class ReverseNumberTrianglePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n;i>=1;i--){  
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            } 
            int count = n-i+1;
            for(int j=1;j<=i;j++){  
                System.out.print(count+" ");
                count++;   
            }
            System.out.println();   
        }
    }
}
