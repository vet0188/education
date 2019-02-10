package pkg_1;

public class A {


   public void prime(int number)
   {
       if (number > 1)
       {

           int n;
           for (int i = 2; i < number; i++) {
               n = number % i;
               if (n == 0) {
                   System.out.println(n);
                   System.out.println(number + " is NOT a Prime number");
                   break;
               }
               else if (i == number-1 && n != 0)
               {
                   System.out.println(n);
                   System.out.println(number + " is a Prime number");
               }

           }

       }
       else
       {
           System.out.println("number should be grater than 1");
       }
   }


/* for (int i=2; i<number; i++)
           {
               if (number%i == 0)
               {
                   System.out.println(number + " is NOT a Prime number");
               }
               else
               {
                   System.out.println(number + " is a Prime number");
               }
           }
           */





    public void fibonacci (int counter)
    {
        if (counter<=0)
            System.out.println("number should be grater than 0");
        else {
            int[] result;
            result = new int[counter + 1];
            result[0] = 0;
            result[1] = 1;
            for (int i = 0; i < counter; i++) {
                if (i == 0)
                    System.out.print(result[i] + ", ");
                else {
                    result[i + 1] = result[i] + result[i - 1];
                    if (i >= 1 && i < counter - 1)
                        System.out.print(result[i] + ", ");
                    else
                        System.out.print(result[i] + "!");
                }

            }
        }

    }

    public void swap (int a, int b)
    {
        System.out.println("a = " +a + "\nb = " +b + "\nswapping...");
//        int c = b;
//        b = a;
//        a = c;
        a = a+b; //3
        b = a-b; //1
        a = a-b; //2


        System.out.println("a become " + a + "\nb become " +b);

    }
}
