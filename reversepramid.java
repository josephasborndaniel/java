import java.util.Scanner;
public class reversepramid {
    public static void main(String[] args) {
        {   
            Scanner sc =new Scanner(System.in);
            System.out.print("enter a number");
            int n = sc.nextInt();
            for(int i=1;i<n;i++)
            {
                for(int j=n;j>=i;j--)
                {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }
}
