import java.util.*;
public class stuMarks{
    int regno,total=0;
    String name;
    int marks[] = new int[5];
    Scanner sc = new Scanner(System.in);
    Scanner scn = new Scanner(System.in);
    void details()
    {
        System.out.print("Enter RegNo of student: ");
        regno = sc.nextInt();
        System.out.print("Enter name of student: ");
        name = scn.nextLine();
    }
    void marks()
    {
        System.out.print("Enter marks of Student:");
        for(int i=0;i<5;i++)
        {
            marks[i] = sc.nextInt();
        }
    }
    void total()
    {
        for(int i=0;i<5;i++)
        {
        total = total + marks[i];
        }
        System.out.print("Total marks: "+total);
    }
    void display()
    {
        System.out.print("Student name: "+name);
        System.out.print("Student RegNo: "+regno);
        for(int i=0;i<5;i++)
        {
            System.out.print("Marks in "+i+" "+marks[i]);
        }
        System.out.print("total marks" +total);
    }
}
public class studentMarks{
      public static void main(String[] args) {
        studentMarks stu;
        for(int i=0;i<5;i++){
            stu.details();
            stu.marks();
            stu.total();
            stu.display();
        }
      }
}