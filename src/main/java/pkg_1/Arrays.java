package pkg_1;

public class Arrays {

   int [] arr;
    public void ArrayElementsSum(int[]arr)
    {
        int arrLen = arr.length;
        int counter = 0;
        for (int i = 0; i < arrLen; i++)
        {
            counter += arr[i];
        }
        System.out.println("Sum = " + counter);
    }
}
