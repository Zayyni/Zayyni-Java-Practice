public class LaunchArray7
{
    public static void main(String[] args)
    {
        int a[] = {3,4,5,3,2};
        for (int i = 0; i< a.length; i++){
            System.out.println(a[i]);
        }

        System.out.println("**************************************");

        for(int elem: a){
            System.out.print(elem);
        }

    }
}
