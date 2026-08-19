import java.util.Scanner;
public class array_sum{
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0; i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        int sum=0;
        for(int i=0; i<n;i++)
        {
            sum+=arr[i];
        }
        int avg=sum/n;
        System.out.println("Array sum: "+sum);
        System.out.println("Avg= "+avg);
        input.close();
    }
}