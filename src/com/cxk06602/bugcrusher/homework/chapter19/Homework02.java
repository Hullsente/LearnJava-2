package com.cxk06602.bugcrusher.homework.chapter19;

import com.cxk06602.bugcrusher.read_.BufferRead;

import java.io.*;

public class Homework02 {
    static void main() throws IOException {
        String path = "D:\\chapter19homework02.txt";
        File file1 = new File(path + "temp");
        file1.createNewFile();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path + "temp"));
        String line;
        int i = 1;
        while((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(i++ + line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        bufferedReader.close();
        File file = new File(path);
        file.delete();
        file1.renameTo(file);
        file1.delete();
    }
}
