package com.cxk06602.bugcrusher.write_;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    static void main() {
        String path = "D:\\README.txt";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path);
            fileWriter.write("风雨之后，定见彩虹");
            fileWriter.write("\n相信自我，未来展开");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
