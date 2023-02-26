import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1,b = 1,c;
        
        int n;
        System.out.println("Enter Range: ");
        n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n;i++)
        {
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;

        }
        sc.close();
    }
}
