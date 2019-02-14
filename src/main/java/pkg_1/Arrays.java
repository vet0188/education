package pkg_1;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

    private int[] Sorted(int[] arg) {
        java.util.Arrays.sort(arg);
        return arg;
    }

    public void ArrayElementsSum(int[] arr) {
        int arrLen = arr.length;
        int counter = 0;
        for (int i = 0; i < arrLen; i++) {
            counter += arr[i];
        }
        System.out.println("Sum = " + counter);
    }

    public void FindLowHight(int[] arr) {

        int arrLen = arr.length;
        arr = Sorted(arr);
        int highest = arr[arrLen - 1], lowest = arr[0];
        System.out.println("Largest: " + highest);
        System.out.println("Lowest: " + lowest);
    }


    public void FindSecondLowHight(int[] arr) {

        int arrLen = arr.length;
        int[] output = Sorted(arr);
        int[] outputv2 = arr;
        selectionSortASC(outputv2);
        int secondHighest = output[1], secondLowest = output[arrLen - 2];

        System.out.println("Second largest: " + secondHighest);
        System.out.println("Second lowest: " + secondLowest);
        System.out.println("Second largest: " + outputv2[arrLen - 2]);
        System.out.println("Second lowest: " + outputv2[1]);
    }

        public static void selectionSortASC(int[] arr){
    /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        int arrLen = arr.length;
        for (int i = 0; i < arrLen; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = arr[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i+1; j < arrLen; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }
    public static void selectionSortDESC(int[] arr){
    /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        int arrLen = arr.length;
        for (int i = 0; i < arrLen; i++) {

            int max = arr[i];
            int max_i = i;

            for (int j = i+1; j < arrLen; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] > max) {
                    max = arr[j];
                    max_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != max_i) {
                int tmp = arr[i];
                arr[i] = arr[max_i];
                arr[max_i] = tmp;
            }
        }
    }
    public void Contains(String [] arr, String d)
    {
        int counter = 0;
        String output;
        int i =0;
        for (String s1 : arr)
        {
            if (arr[i].contains(d)) counter++;
            i++;

        }
        if (counter == 0) System.out.println("\nTarget string doesn't contain " +d);
        else System.out.println("\nTarget string contains '" + d + "' " + counter + " times");

    }

    public  void EvenOdd (int [] arr)
    {
        List<Integer> even = new ArrayList<Integer>();
        List <Integer> odd = new ArrayList<Integer>();
        for (int i = 0; i <arr.length; i++)
        {
            if (arr[i]%2==0) even.add(arr[i]);
            else odd.add(arr[i]);
        }
        System.out.println("even numbers: " + even);
        System.out.println("odd numbers: " + odd);
    }
    public void Sort (int [] arr, boolean ASC)
    {
        int[] output = new int[arr.length];
        if (ASC)
        {

            output = Sorted(arr);
            for (int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }
//            selectionSortASC(arr);
//            for (int i =0; i < arr.length; i++)
//            {
//                output[i] = arr[i];
//
//            }
        }
        else
        {
            arr = Sorted(arr);
            for (int i = arr.length-1; i>=0; i--)
            {
                System.out.print(arr[i] + " ");
            }
//            selectionSortDESC(arr);
//            for (int i =0; i < arr.length; i++)
//            {
//                output[i] = arr[i];
//
//            }
        }
//        System.out.println(output);
    }

}

