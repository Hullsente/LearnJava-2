package com.cxk06602.bugcrusher.net;

import java.io.*;
import java.net.Socket;

public class Client02 {
    static void main() throws IOException {
        Socket socket = new Socket("127.0.0.1", 15565);
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("Hello, server! 这里是字符流哦");
        bufferedWriter.newLine();
        bufferedWriter.write("Hello, server! 这里是字符流哦");
        bufferedWriter.newLine();
        bufferedWriter.write("Hello, server! 这里是字符流哦");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        socket.shutdownOutput();


        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String content = "";
        while((content = bufferedReader.readLine()) != null){
            System.out.println(content);
        }


        bufferedWriter.close();
        socket.close();
    }
}
