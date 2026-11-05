package com.cxk06602.bugcrusher.zeroone.chapter5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {
    static void main() throws IOException {
        File file = new File("D:\\Desktop\\TestDelect");
        try {
            delDir(file);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
    static void delDir(File dir) throws IOException {
        if(!dir.isDirectory()){
            throw new FileNotFoundException("系统找不到指定目录。");
        }
        for (File file : dir.listFiles()) {
            if(file.isDirectory()){
                delDir(new File(dir, file.getName()));
            }
            file.delete();
        }
        dir.delete();
    }
}
