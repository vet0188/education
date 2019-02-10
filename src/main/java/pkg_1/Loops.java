package pkg_1;


public class Loops {
    public void table(int number)
    {
        System.out.println("\nall numbers in range from 0 - " + number + ", that not % 3, 5, 7");
        int item = 0;
        boolean mult = true;
        for (int i = 0, j =0 ; i < number; i++, j++)
        {
            item = i;
            if (item%3==0 || item%5==0 || item%7==0) {
                mult = false;
                j--;
            }
            else {
                mult = true;
               // j--;
            }
            if (mult)
            {
                if (j < 5) {
                    System.out.print(item + " ");


                } else {
                    System.out.print("\n" + item + " ");
                    j = 0;

                }

            }

        }
        System.out.println();
    }

    public void tableInvert(int number)
   {
       System.out.println("\nall numbers in range from 0 - " + number + ", that % 3, 5, 7");
       int item = 0;
       boolean mult = true;
       for (int i = 0, j =0 ; i < number; i++, j++)
       {
           item = i;
           if (item%3==0 || item%5==0 || item%7==0) {
               mult = false;
               //j--;
           }
           else {
               mult = true;
               j--;
           }
           if (!mult)
           {
                   if (j < 5) {
                       System.out.print(item + " ");


                   } else {
                       System.out.print("\n" + item + " ");
                       j = 0;

                   }

               }

       }
       System.out.println();
   }

    public void mutiArray()
    {
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                if (j==5) System.out.println("*");
                else System.out.print("*");
            }
        }
    }

    public void square()
    {
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 6; j++) {
            switch (i) {
                case 0:
                case 3: {
                    if (j == 5) System.out.println("*");
                    else System.out.print("*");
                    break;
                }
                default: {
                    if (j == 0) System.out.print("*");
                    else if (j == 5) System.out.println("*");
                    else System.out.print(" ");
                }
            }
            }
        }
    }
}
