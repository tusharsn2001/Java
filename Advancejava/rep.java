import java.util.Scanner;

public class rep {
    public static void main(String[] args) {
        int hindi,math,english,total;
        float percentage,f;
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter Hindi marks: ");
         hindi = sc.nextInt();
         System.out.println("Enter Math marks: ");
         math = sc.nextInt();
         System.out.println("Enter English marks: ");
         english = sc.nextInt();
         
         total = hindi+english+math;
         f = total;
         percentage = (f/300)*100;
         System.out.println("Total Marks: "+total);
         System.out.println("Percentage: "+percentage); 
         sc.close();
        }
}
