import java.util.Scanner;

public class facto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        System.out.println(ft(num));
        sc.close();
    }
    public static int ft(int n) {
        if(n<1)
           return 1;
        return n*ft(n-1);    
    }
}
