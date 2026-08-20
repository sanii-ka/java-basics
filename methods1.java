public class methods1 {
    static void sayhello()
    {
        System.out.println("Hello everyone, My name is Sanika");
    }
    static int summation(int num1, int num2)
    {
        int sum=num1+num2;
        return sum;
    }
    static int sq(int digit)
    {
        return digit*digit;
    }
    public static void main(String[] args)
    {
        sayhello();
        int sum=summation(2,5);
        System.out.println("Sum is "+sum);
        int square=sq(16);
        System.out.println("Square is "+ square);
    }
}
