package calling;

import Apache_POI.ExcelFileReading;
import Apache_POI.ExcelFileWriting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pkg_1.*;
import Practice.*;

import java.io.IOException;
import java.util.Scanner;

//hh
public class Z {
    public static void main(String[] args) throws IOException {
        double  z;
        int x;
        int [] a = {2, 8};
        int [] b = {2, 5, 7};

        ClassA obj = new ClassA();
        obj.hello();
        ExcelPractice excel = new ExcelPractice();
        excel.cloneDataFromFile();
//        excel.writeData(1,2);

//        ExcelFileReading excel = new ExcelFileReading(); // more than 1 method can't be called at the same time?
//        excel.readAllDataFromCell("out");
//        excel.readDataFromCell("out", 0, 1);
//        excel.rowsCount("out", false);
//        excel.cellCount("out", 2);


//==========================================================
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://app.observepointqa.com");
//        WebElement userName = driver.findElementByXPath("//*[@placeholder=\"Username\"]");
//        WebElement password = driver.findElementByXPath("//*[@placeholder=\"Password\"]");
//        userName.sendKeys("qa_vkh_std");
//        password.sendKeys("3E438f@3");
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login\"]/div[1]/div/form/div/button")));
//        driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]/div/form/div/button")).click();
//        WebElement signInButton = driver.findElementByXPath("//*[@id=\"login\"]/div[1]/div/form/div/button");
//        signInButton.click();
//        driver.getKeyboard().pressKey("return");

//=========================================================
//        FilePractice fp = new FilePractice("/Users/vitaliy_khairutdinov/IdeaProjects/id_01", "file_1.txt", "file_2.txt", "result.txt");
//        fp.writeLastNLines(5, "lastN.txt");
//        fp.writeFirstNLines(5, "firstN.txt");
//        fp.convertToUpercase("uppercase.txt");
//        fp.readOneWriteAnother("error");
//        fp.displayLinesWithoutData("3");
//        fp.displayOddLines(true);
//        fp.readOneWriteAnother();
//
//        FileHandling fh = new FileHandling();
//        fh.writeToFileBuffered("/Users/vitaliy_khairutdinov/IdeaProjects/id_01", "file_for_writing_test.txt", "write one more line");
//        fh.writeToFile("/Users/vitaliy_khairutdinov/IdeaProjects/id_01", "file_for_writing_test.txt", "write line");
//        fh.readFromFileBuffered("/Users/vitaliy_khairutdinov/Desktop/", "help_text.txt");
//        fh.readFromFile("doesnot matter", "any");

//        Arrays ArrayPractice = new Arrays();
//        int [] testArr = {2,5,155,7,47,14,8,0,38,6};
//        String [] testArr2 = {"123","3hn", "aaa", "BBB", "month", "123", "rfs", "123"};
//        ArrayPractice.ArrayElementsSum(testArr);
//        ArrayPractice.FindLowHight(testArr);
//        ArrayPractice.FindSecondLowHight(testArr);
//        ArrayPractice.Contains(testArr2, "12");
//        ArrayPractice.EvenOdd(testArr);
//        ArrayPractice.Sort(testArr, false);

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
