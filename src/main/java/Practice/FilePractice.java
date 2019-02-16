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

    }
}
