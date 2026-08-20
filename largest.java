import java.util.Scanner;

public class largest {
    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter first num: ");
        int num1=input.nextInt();
        System.out.print("Enter second num: ");
        int num2=input.nextInt();
        if(num1>num2)
        {
            System.out.println("Greater number is: "+num1);
        }
        else
        {
            System.out.println("Greater number is: "+num2);
        }
        input.close();
    }
}
