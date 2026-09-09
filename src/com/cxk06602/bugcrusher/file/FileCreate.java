package com.cxk06602.bugcrusher.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    static void main() {

    }
    @Test
    public void creat01() throws IOException {
        String filePath = "D:\\news1.txt";
        File file = new File(filePath);
        file.createNewFile();
    }

    @Test
    public void creat02(){
        try {
            new File("D:\\", "news2.txt").createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void creat03(){
        try {
            new File(new File("D:\\"), "news3.txt").createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
