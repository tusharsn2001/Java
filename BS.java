import java.util.*;
public class BS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mid,low,high,n,search;
        
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in array ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        search = sc.nextInt();
        low=0;high=n-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==search){
                System.out.println("Element found at: "+mid);
                break;
            }
            else if(search>arr[mid]){
                low=mid+1;
            }
            else if(search<arr[mid]){
                high=mid-1;
            }

        }
        System.out.println("Element not present in the array");
        sc.close();
    }
} 
