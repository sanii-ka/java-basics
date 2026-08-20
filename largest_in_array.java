import java.util.Scanner;
public class largest_in_array {
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
        int largest=arr[0];
        for(int i=1; i<n;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("Largest= "+largest);
        int smallest=arr[0];
        for(int i=1; i<n;i++)
        {
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        System.out.println("Smallest= "+smallest);
        input.close();
    }
}
