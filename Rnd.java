import java.util.Random;
public class Rnd {
    public static void main(String[] args) {
        
        Random rd = new Random();
        int a = rd.nextInt(6)+1;
        System.out.print(a);
    }
    
}