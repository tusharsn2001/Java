import java.util.*;
public class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter The Number: ");
        n = sc.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("The number is not a Prime nummber");
                break;
            }
            else{
                System.out.println(" prime number ");
                break;
            }
        }
    sc.close();
}
}