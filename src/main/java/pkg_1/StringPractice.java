package pkg_1;

import java.util.ArrayList;
import java.util.List;

public class StringPractice {
    String a;
    String b;
    int c;

    public StringPractice(String a, String b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void CompareLast ()
        {
            int lenghtA = a.trim().length();
            int lenghtB = b.trim().length();
            String targetA = a.trim().substring(lenghtA-c, lenghtA);
            String targetB = b.trim().substring(lenghtB-c, lenghtB);
            if (targetA.trim().compareToIgnoreCase(targetB) == 0)
                System.out.println("Last " + c + " char are equal (ignoring case)");
            else System.out.println("Last " + c + " char are NOT equal (ignoring case)");
        }
    public void CompareFirst ()
    {
        //String trimA = a.trim();
        //String trimB = b.trim();
        String targetA = a.trim().substring(0, c);
        String targetB = b.trim().substring(0, c);
        if (targetA.trim().compareToIgnoreCase(targetB) == 0)
            System.out.println("First " + c + " char are equal (ignoring case)");
        else System.out.println("First " + c + " char are NOT equal (ignoring case)");
    }
    public void CompareWhole ()
    {
        String trimA = a.trim();
        String trimB = b.trim();
//        String targetA = a.trim().substring(0, c);
//        String targetB = b.trim().substring(0, c);
        if (trimA.compareToIgnoreCase(trimB) == 0)
            System.out.println("Strings are equal");
        else System.out.println("Strings are NOT equal");
    }
    public void Convert ()
    {
        String [] sArray = a.trim().split(" ") ;
        int i =0;
        for (String s1 : sArray)
        {

            if (i%2==0) {
                System.out.print(s1.toUpperCase() + " ");
                i++;
            }
            else
            {
                System.out.print(s1.toLowerCase() + " ");
                i++;
            }
        }
    }
    public String Contains(String d)
    {
        int counter = 0;
        String output;
        String targA = a.toLowerCase();
        String targD = d.toLowerCase();
        String [] sArray = targA.trim().split(" ") ;
        int i =0;
        for (String s1 : sArray)
        {
            if (sArray[i].contains(targD)) counter++;
            i++;

        }
        if (counter == 0) output = "\nTarget string doesn't contain " +d;
        else output = "\nTarget string contains '" + d + "' " + counter + " times";
        return output;
    }
    public void reverse()
    {
        char [] output = a.toCharArray();
        int arrayLenght = a.length()-1;
        String reversedResult = "\n";
        for (int i = arrayLenght; i>0; i--)
        {
            reversedResult += output[i];
        }
        System.out.println(reversedResult);
    }
    public void palendrome(String d)
    {
        boolean pal = false;
        byte [] hashInput = d.getBytes();
        char [] output = d.toCharArray();
        int arrayLenght = d.length()-1;
        String reversedString = "";
        for (int i = arrayLenght; i>0; i--)
        {
            reversedString += output[i];
        }
        byte [] hashOutput = reversedString.getBytes();
        for (int i = 0; i<arrayLenght; i++)
        {
            if (hashInput[i]-hashOutput[i]!=0)
            {
                pal = false;
                break;
            }
            else
            {
                pal = true;
            }

        }
        if (pal) System.out.println(d + " анаграма");
        else System.out.println(d + " НЕ анаграма");


    }
    public int defineLenght ()
    {
        int lenght = a.concat(b).length();
        return lenght;
    }
    public void wordCount()
    {
        String [] array = a.trim().split(" ");
        System.out.println(array.length);
    }
    public void duplicates()
    {
        int counter = 0;
        boolean dup = false;
        String targA = a.toLowerCase();
        String [] sArray = targA.trim().split(" ") ;
        List <String>  output = new ArrayList<String>();
        int i  = 0;
        int o  = 0;
        for (String s1 : sArray)
        {
            for (int j = i; j < sArray.length; j++)
            {
                if (j==sArray.length-1)
                    break;
                byte [] hashI = sArray[i].getBytes();
                byte [] hashJ = sArray[j+1].getBytes();

                if (sArray[i].length()-sArray[j+1].length()==0)
                {
                    for (int k = 0; k<sArray[i].length(); k++)
                    {
                        if (hashI[k]-hashJ[k]!=0)
                        {
                            dup = false;
                            break;
                        }
                        else
                        {
                            dup = true;
                        }
                    }
                    if (dup == true)
                    {
                        counter++;
                        output.add(sArray[j+1]);
                        o++;
                    }
                }
            }
            i++;
        }
        if (counter == 0) System.out.println("there are no duplicates");
        else
        {
            System.out.println("Duplicates are: " + output);

        }

    }
    public void remSpaces()
    {
        String output = a.replace(" ", "");
        System.out.println("New string: " + output + "\n" + (a.length()-output.length()) + "spaces removed");
    }


}
