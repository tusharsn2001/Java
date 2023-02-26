import java.util.*;

public class Switch
{
    public static void main(String[] args) {
        
        int a=12,b=4,n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Multiply");
        System.out.println("4.Division");
        n = sc.nextInt();
        switch (n) {
            case 1:System.out.print(a+b);
                
                break;
                case 2:System.out.print(a-b);
                
                break;
                case 3:System.out.print(a*b);
                
                break;
                case 4:System.out.print(a/b);
                
                break;
            default: System.out.print("Invalid Input");
                break;
        }
        sc.close();
    }
}