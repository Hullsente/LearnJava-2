package com.cxk06602.bugcrusher.homework.chapter19;

import java.io.*;

public class Homework01 {
    static void main() throws IOException {
        String dirPath = "D:\\mytemp";
        File file = new File(dirPath);
        if(!file.exists()){
            if (file.mkdir()) {
                System.out.println("创建成功");
            }else{
                System.out.println("创建失败");
            }
        }
        File file1 = new File(dirPath, "hello.txt");
        if(file1.exists()){
            System.out.println("文件已存在");
        }else{
            if(file1.createNewFile()){
                System.out.println("创建成功");
            }else{
                System.out.println("创建失败");
            }
        }
        FileWriter fileWriter = new FileWriter(file1);
        fileWriter.write("hello, world~");
        fileWriter.close();

    }
}
