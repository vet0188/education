package pkg_1;

import java.util.Scanner;

public class ClassC {
    public void month()
    {
        System.out.println("Please, enter a month number:");
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        int a = Integer.parseInt(number);

        int [] daysCount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (a >= 0 || a <= daysCount.length)
            System.out.println("Month # " + a + " contains " + daysCount[a-1] + " days");
        else
            System.out.println("Please, enter valid month number");
    }
    public void trangle(double a, double b, double c)
    {
        double apow, bpow, cpow;
        apow = Math.pow(a, 2);
        bpow = Math.pow(b, 2);
        cpow = Math.pow(c, 2);
        if ((a<b+c && (a>b-c && a>c-b)) || (b<a+c && (b>a-c && b>c-a)) || (c<a+b && (c>a-b && c>b-a)))
            if (a==b && b==c)
                System.out.println("это равносторонний треугольник");
            else if ( a==b || a==c || b==c)
                if (apow == bpow+cpow || bpow == apow+cpow || cpow == apow+bpow)
                    System.out.println("это равнобедренный прямоугольный треугольник");
                else
                    System.out.println("это равнобедренный треугольник");
            else if (apow == bpow+cpow || bpow == apow+cpow || cpow == apow+bpow)
                System.out.println("это  прямоугольный треугольник");
            else
            System.out.println("это обычный треугольник");
        else
            System.out.println("это не треугольник");
    }

}
