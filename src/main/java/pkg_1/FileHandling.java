package pkg_1;

import java.io.*;

public class FileHandling {

        String path = "/Users/vitaliy_khairutdinov/Desktop/";
        String name = "help_text.txt";
//    public FileHandling (String path, String name)
//    {
//        this.path;
//        this.name;
//    }
    public void writeToFileBuffered (String filePath, String fileName, String data) throws IOException {
        File file = new File(filePath+"/"+fileName);
        FileWriter writeToFile = new FileWriter(file, true);
        BufferedWriter buffered = new BufferedWriter(writeToFile);
        buffered.write(data);
        buffered.newLine();
        buffered.flush();
        buffered.close();
    }
    public void writeToFile (String filePath, String fileName, String data) throws IOException {
        File file = new File(filePath+"/"+fileName);
        FileWriter writeToFile = new FileWriter(file, true);
        writeToFile.write(data);
        writeToFile.write("\n");
        writeToFile.flush();
        writeToFile.close();
    }

    public void readFromFile () throws IOException {
        File file = new File(path+name);
        FileReader fileReader = new FileReader(file);
        int i = fileReader.read();
        while (i!=-1)
        {
            System.out.print((char) i);
            i = fileReader.read();

        }

    }
    public void readFromFileBuffered (String filePath, String fileName) throws IOException {
        File file = new File(filePath+"/"+fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader buffered = new BufferedReader(fileReader);
        String s = buffered.readLine();
        while (s!=null)
        {
            System.out.println(s);
            s = buffered.readLine();

        }

    }
}
