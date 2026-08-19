public class array1 {
    public static void main(String[] arg)
    {
        int[] ages={10,50,74,29,36};
        System.out.println("Print all elemnts");
        for(int i=0;i<ages.length;i++)
        {
            System.out.println(ages[i]);
        }
        System.out.println("Print all elemnts reverse");
        for(int i=ages.length-1;i>=0;i--)
        {
            System.out.println(ages[i]);
        }
    }
}
