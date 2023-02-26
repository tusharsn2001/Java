import java.util.*;
public class last {
    public static void main(String[] args) {
        int num,LastDigit,FirstDigit,Sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        num = sc.nextInt();
        LastDigit = num%10;

        FirstDigit = num;
        while(num >= 10)
        {
            num = num/10;
        }
        FirstDigit = num;
        Sum = FirstDigit+LastDigit;
        System.out.print("Sum is: "+Sum);

        sc.close();
    }
}
