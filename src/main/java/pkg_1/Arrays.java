package pkg_1;

public class Arrays {

    private int [] Sorted (int [] arg)
    {
        java.util.Arrays.sort(arg);
        return arg;
    }

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

    public void FindLowHight (int [] arr)
    {

        int arrLen = arr.length;
        arr = Sorted(arr);
        int highest = arr[arrLen-1], lowest = arr[0];
        System.out.println("Largest: " + highest);
        System.out.println("Lowest: " + lowest);
    }


    public void FindSecondLowHight (int [] arr)
    {

        int arrLen = arr.length;
        int [] output = Sorted(arr);
        int secondHighest = output[1], secondLowest = output[arrLen-2];

        System.out.println("Second largest: " + secondHighest);
        System.out.println("Second lowest: " + secondLowest);
    }
}
