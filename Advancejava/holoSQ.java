public class holoSQ {
    public static void main(String[] args) {
        int side = 7;
        for(int i=1;i<=side;i++)
        {
            for(int j=1;j<=side;j++)
            {
               if((i>1 && j>1) && (i<side && j<side))
               {
                 System.out.print("  ");
               }
               else
               {
                System.out.print("* ");
               }
            }
            System.out.print("\n");
        }
    }
}
