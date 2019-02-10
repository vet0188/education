package pkg_1;

public class ClassB {

    public int findHigh(int [] args){
        int largest = args[0], lowest = args[0];
        for (int i =1; i<args.length; i++)
        {
            if (args[i]>largest)
            {
                largest = args[i];

            }
            else
            {
                lowest = args[i];

            }

        }
        return largest;
    }
    public int findlow(int [] args){
        int largest = args[0], lowest = args[0];
        for (int i =1; i<args.length; i++)
        {
            if (args[i]>largest)
            {
                 largest = args[i];

            }
            else
            {
                lowest = args[i];

            }

        }
        return lowest;
    }
    public void divNum(int a)
    {
        if (a%5==0 && a%11==0)
            System.out.println(a + " is divisible by 5 and by 11");
        else if (a%5==0)
            System.out.println(a + " is divisible by 5");
        else if (a%11==0)
            System.out.println(a + " is divisible by 11");
        else
            System.out.println(a + " isn't divisible nor by 5 nor by 11");
    }
}
