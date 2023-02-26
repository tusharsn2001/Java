import java.util.*;
public class reverseArr {
    public static void printArr(int arr[],int n)
    {
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    // public static void swap(int a,int b) {
    //     int temp = a;
    //     a = b;
    //     b = temp;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size of Array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before Reversal: ");
        printArr(arr,n);
        int low=0,high=n-1;
        while(low<=high)
        {
           // swap(arr[low],arr[high]);
           int temp = arr[low];
           arr[low] = arr[high];
           arr[high] = temp;
            low++;
            high--;

        }
        System.out.println("\n Array after Reversal: ");
        printArr(arr,n);
       sc.close();
    }
    
}
