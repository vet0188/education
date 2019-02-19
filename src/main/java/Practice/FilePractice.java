package Practice;

import java.io.*;

public class FilePractice {
    String path;
    String file1;
    String file2;
    String output;
    public FilePractice (String path, String file1, String file2, String output)
    {
        this.path = path;
        this.file1 = file1;
        this.file2 = file2;
        this.output = output;
    }
    public void readOneWriteAnother () throws IOException {
        File first = new File(path+"/"+file1);
        FileReader readFirst = new FileReader(first);
        BufferedReader bufferedFirst = new BufferedReader(readFirst);
        File second = new File(path+"/"+file2);
        FileReader readSecond = new FileReader(second);
        BufferedReader bufferedSecond = new BufferedReader(readSecond);
        File out = new File(path+"/"+output);
        FileWriter writeOut = new FileWriter(out);
        BufferedWriter bufferedOut = new BufferedWriter(writeOut);

        String dataFile1 = bufferedFirst.readLine();
        String temp1 = "";
        while (dataFile1!=null)
        {
            temp1 += dataFile1+"\n";
            dataFile1 = bufferedFirst.readLine();

        }
        String dataFile2 = bufferedSecond.readLine();
        String temp2 = "";
        while (dataFile2!=null)
        {
            temp2 += dataFile2+"\n";
            dataFile2 = bufferedSecond.readLine();

        }
        bufferedOut.write(temp1 + temp2);
        bufferedOut.flush();
        bufferedOut.close();

    }public void readOneWriteAnother (String except) throws IOException {
        File first = new File(path+"/"+file1);
        FileReader readFirst = new FileReader(first);
        BufferedReader bufferedFirst = new BufferedReader(readFirst);
//        File second = new File(path+"/"+file2);
//        FileReader readSecond = new FileReader(second);
//        BufferedReader bufferedSecond = new BufferedReader(readSecond);
        File out = new File(path+"/"+output);
        FileWriter writeOut = new FileWriter(out);
        BufferedWriter bufferedOut = new BufferedWriter(writeOut);

        String dataFile1 = bufferedFirst.readLine();
        String temp1 = "";
        while (dataFile1!=null)
        {
            if (!dataFile1.contains(except))
            {
                temp1 += dataFile1 + "\n";
            }
            dataFile1 = bufferedFirst.readLine();

        }
//        String dataFile2 = bufferedSecond.readLine();
//        String temp2 = "";
//        while (dataFile2!=null)
//        {
//            temp2 += dataFile2+"\n";
//            dataFile2 = bufferedSecond.readLine();
//
//        }
        bufferedOut.write(temp1);
        bufferedOut.flush();
        bufferedOut.close();

    }

    public void displayOddLines (boolean odd) throws IOException {
        File source = new File(path+"/"+output);
        FileReader readSource = new FileReader(source);
        BufferedReader bufferedSource = new BufferedReader(readSource);
        String line = bufferedSource.readLine();
        int lineCounter = 1;
        while (line!=null)
        {
            if (lineCounter%2==0)
            {
                if (!odd) System.out.println(line);
//                else break;
            }
            else
            {
                if (odd) System.out.println(line);
//                else break;
            }

            line = bufferedSource.readLine();
            lineCounter++;

        }
    }
    public void displayLinesWithoutData (String exclude) throws IOException {
        File source = new File(path+"/"+output);
        FileReader readSource = new FileReader(source);
        BufferedReader bufferedSource = new BufferedReader(readSource);
        String line = bufferedSource.readLine();
        while (line!=null)
        {
            if (!line.contains(exclude))
            {
                System.out.println(line);
            }

            line = bufferedSource.readLine();

        }
    }

    public void convertToUpercase (String resultFile) throws IOException {
        File source = new File(path+"/"+file1);
        FileReader readSource = new FileReader(source);
        BufferedReader bufferedSource = new BufferedReader(readSource);
        File out = new File(path+"/"+resultFile);
        FileWriter writeOut = new FileWriter(out);
        BufferedWriter bufferedOut = new BufferedWriter(writeOut);
        String line = bufferedSource.readLine();
        String temp = "";
        while (line!=null)
        {
            temp += line + "\n";
            line = bufferedSource.readLine();
        }
        bufferedOut.write(temp.toUpperCase());
        bufferedOut.flush();
        bufferedOut.close();

    }
    public void writeFirstNLines (int n, String resultFile) throws IOException {
        File source = new File(path+"/"+file1);
        FileReader readSource = new FileReader(source);
        BufferedReader bufferedSource = new BufferedReader(readSource);
        File out = new File(path+"/"+resultFile);
        FileWriter writeOut = new FileWriter(out);
        BufferedWriter bufferedOut = new BufferedWriter(writeOut);
        String line = bufferedSource.readLine();
        String temp = "";
        for (int i = 0; i < n; i++)
        {
            temp += line + "\n";
            line = bufferedSource.readLine();
        }
        bufferedOut.write(temp);
        bufferedOut.flush();
        bufferedOut.close();

    }
    public void writeLastNLines (int n, String resultFile) throws IOException {
        File source = new File(path+"/"+file1);
        FileReader readSource = new FileReader(source);
        BufferedReader bufferedSource = new BufferedReader(readSource);
        File out = new File(path+"/"+resultFile);
        FileWriter writeOut = new FileWriter(out);
        BufferedWriter bufferedOut = new BufferedWriter(writeOut);

        String line = bufferedSource.readLine();
        String secIteraction = bufferedSource.readLine();
        int lineCounter = countLines(source);
        System.out.println(lineCounter);
        String temp = "";
        if (lineCounter<=n)
        {
            while (secIteraction!=null)
            {
                temp += secIteraction + "\n";
                secIteraction = bufferedSource.readLine();
            }
        }
        else
        {
            for (int i = 1; i < lineCounter; i++)
            {
                if (i >= (lineCounter - n))
                {
                    temp += secIteraction + "\n";
                }
                secIteraction = bufferedSource.readLine();
            }
        }
        bufferedOut.write(temp);
        bufferedOut.flush();
        bufferedOut.close();

    }
    private int countLines (File source) throws IOException {
        FileReader readSource = new FileReader(source);
        BufferedReader bufferedSource = new BufferedReader(readSource);
        String line = bufferedSource.readLine();
        int lineCounter = 0;
        while (line!=null)
        {
            lineCounter++;
            line = bufferedSource.readLine();
        }
        return lineCounter;
    }


}
