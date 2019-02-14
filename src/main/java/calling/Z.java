package calling;

import pkg_1.*;

import java.util.Scanner;

public class Z {
    public static void main(String[] args){
        double  z;
        int x;
        int [] a = {2, 8};
        int [] b = {2, 5, 7};

        ClassA obj = new ClassA();
        obj.hello();
        Arrays ArrayPractice = new Arrays();
        int [] testArr = {2,5,7,14,8,0,38,47,155,6};
        ArrayPractice.ArrayElementsSum(testArr);
        ArrayPractice.FindLowHight(testArr);
        ArrayPractice.FindSecondLowHight(testArr);

//        StringPractice Str = new StringPractice(" Hello my dear and my friend! hello", "Goodbye my dear Friend!", 4);
//        Str.remSpaces();
//        Str.wordCount();
//        Str.duplicates();
//        Str.palendrome("madama");
//        System.out.println(Str.defineLenght());
//        Str.reverse();

//        Str.CompareLast();
//        Str.CompareFirst();
//        Str.Convert();
//        System.out.println(Str.Contains());
//        Str.CompareWhole();
/*        StringHandling str = new StringHandling();
        str.strWork();

/*        Loops draw = new Loops();
        draw.table(100);
        draw.tableInvert(100);
    //    draw.mutiArray();
    //    draw.square();

/*        A change = new A();
        System.out.println("enter a number");
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        int n = Integer.parseInt(number);
        change.prime(n);

       // change.swap(3, 7);


        // ClassC exercize3 = new ClassC();
/*        ClassD exercize4 = new ClassD();
        double[] subjMark = new double[5];

        for (int i = 0; i < exercize4.subjects.length; i++)
        {
            System.out.println("enter a mark for " + exercize4.subjects[i]);
            Scanner in = new Scanner(System.in);
            String number = in.nextLine();
            double n = Double.parseDouble(number);
            subjMark[i] = n;
//            System.out.print(exercize4.grade(subjMark[i]))+ " on " + exercize4.subjects[i]);

        }

        exercize4.subject(subjMark);



        // exercize3.month();
        // exercize3.trangle(6, 9, 33);

/*        ClassB exercize2 = new ClassB();
        int[] c = {6, 3, 11};
        int[] d = {21, 8, 41};
        exercize2.divNum(26);
      int c1 = exercize2.findHigh(c);
      int d1 = exercize2.findlow(d);
        System.out.println("largest: " + c1 + "\nlowest: " + d1);
/*      // z = obj.sum(obj.sqr(2.0), obj.sqr(5.0));

        int a1 = obj.sum(a);
        int b1 = obj.sum(b);
        int [] x1 = {a1, b1};
        x = obj.mult(x1);
        System.out.println("(2+8)*(2+5+7) = "+ x);


/*
       System.out.println("enter a number");
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        int n = Integer.parseInt(number);
        System.out.print("You entered:" + number);
        System.out.println(" and we added 6");
        System.out.println(n+6);
*/
    }
}
