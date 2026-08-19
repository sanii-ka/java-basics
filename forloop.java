public class forloop {
    public static void main(String[] args)
    {
        System.out.println("Table of 5");
        for(int i=1; i<11;i++)
        {
            System.out.println(5*i);
        }
        for(int j=0; j<21;j++)
        {
            if(j%2==0)
            {
                System.out.println(j);
            }
        }
        //while loops
        int k=1;
        while(k<6)
        {
            System.out.println(k*k);
            k++;
        }
    }
}
