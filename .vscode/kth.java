import java.util.Arrays; 
import java.util.Collections; 
import java.util.Scanner;
  
class GFG 
{     
    public static int kthSmallest(Integer [] arr, int k)  
    { 
        Arrays.sort(arr); 

        return arr[k-1]; 
    }   
    public static void main(String[] args)  
    { 
        int n,k;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[] arr=new int[n];
        Scanner s=new Scanner(System.in);
        k=s.nextint(); 
        System.out.print( "K'th smallest element is "+ 
                            kthSmallest(arr, k) );      
    } 
} 