package com.cxk06602.bugcrusher.zeroone.chapter5;

import java.io.*;

public class IOTest {
    static void main() throws IOException {
        File file = new File("D:\\Desktop\\BigFile.txt");
        File targetFile = new File("D:\\Desktop\\BigFile2.txt");
        targetFile.createNewFile();
        try(
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile));
        ){
            int length;
            char[] buf = new char[1024];
            while((length =
                    bufferedReader.read(buf)) != -1){
                bufferedWriter.write(buf, 0, length);
            }
            bufferedWriter.flush();
        }catch (Exception e){

        }
    }
}

