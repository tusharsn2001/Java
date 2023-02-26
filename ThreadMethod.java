class A extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            if(i==1) 
            {Thread.yield();}
            System.out.println("\tThread From A:i= "+i);
        }
        System.out.println("Exit from A");
    }
}
class B extends Thread{
    public void run()
    {
      for(int j=0;j<5;j++)
      {

          if(j==3) 
          System.out.println("\tFrom thread B:j= "+j);
      }
      System.out.println("Exit From B");
    }
}
class C extends Thread
{
    public void run()
    {
        for(int k=0;k<5;k++)
        {
            System.out.println("\tfrom Thread C:k= "+k);
            if(k==1)
            {
               try 
               {
                   sleep(1000);
               }
               catch(Exception e)
               {

               }
            }
        }
        System.out.println("Exit from C");
    }
}
public class ThreadMethod
{
    public static void main(String[] args) {
        A ThreadA = new A();
        B ThreadB = new B();
        C ThreadC = new C();
        System.out.println("Start Thread A");
        ThreadA.start();
        System.out.println("Start Thread B");
        ThreadB.start();
        System.out.println("Start Thread C");
        ThreadC.start();
    }
}