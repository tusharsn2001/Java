import java.util.Scanner;

public class palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a Number: ");
        num = sc.nextInt();
        int temp = num;
        int output = 0;
        while(temp>0)
        {
            output = (output*10)+(temp%10);
            temp = temp/10;
        }
        if(num == output)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}
