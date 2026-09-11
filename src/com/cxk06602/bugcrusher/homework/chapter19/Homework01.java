package com.cxk06602.bugcrusher.homework.chapter19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Homework01 {
    static void main() throws IOException {
        String dirPath = "D:\\mytemp";
        File file = new File(dirPath);
        if(!file.exists()){
            file.mkdir();
        }
        File file1 = new File(dirPath, "hello.txt");
        if(file1.exists()){
            System.out.println("文件已存在");
        }else{
            file1.createNewFile();
        }

    }
}
