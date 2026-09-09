package com.cxk06602.bugcrusher.file;

import org.junit.jupiter.api.Test;

import java.io.*;

public class FileCopy {
    static void main() {

    }

    @Test
    public void copy() {
        String srcPath = "D:\\IdeaProjects\\learnJava-2\\src\\com\\cxk06602\\bugcrusher\\file\\Image.png";
        String desPath = "D:\\Image.png";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcPath);
            fileOutputStream = new FileOutputStream(desPath);
            byte[] buffer = new byte[2048];
            int effectLength;
            while((effectLength = fileInputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer, 0, effectLength);
            }

            System.out.println("拷贝结束");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(fileInputStream != null){
                    fileInputStream.close();
                }
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
