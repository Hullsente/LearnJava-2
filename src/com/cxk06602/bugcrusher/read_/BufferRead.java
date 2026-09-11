package com.cxk06602.bugcrusher.read_;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;

public class BufferRead {
    static void main() throws Exception{
        String path = "D:\\IdeaProjects\\LearnJava-2\\src\\com\\cxk06602\\bugcrusher\\design\\state\\Main.java";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String readLine;
        while((readLine = bufferedReader.readLine()) != null){
            System.out.println(readLine);
        }
        bufferedReader.close();

    }
}
