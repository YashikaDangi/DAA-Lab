import java.util.Scanner;

public class linearAlgo {
    public static void main(String[] args) {
        int n,k,flag=0,c=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n=s.nextInt();
        int[] a=new int[n];
       // System.out.println("Enter all the elements: ");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
       // System.out.println("Enter the key value: ");
        k=s.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==k)
            {
                flag=1;
                break;
            }
            c++;
        }
        
            if(flag==1)
            {
                System.out.print("Present ");
            }
            else{
                System.out.print("Not present ");
            }
            System.out.print(+c);
        }
        
    
}
