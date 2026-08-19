public class count_occurrences {
    public static void main(String[] args)
    {
        int[] arr={1,2,1,1,2,1,2,1,2};
        int key=1;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                count++;
            }
        }
        System.out.println("Occurances of "+key+" = "+count);
    }
}
