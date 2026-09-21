package com.cxk06602.bugcrusher.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 {
    static void main() throws IOException {
        ServerSocket serverSocket = new ServerSocket(15565);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String content = "";
        while((content = bufferedReader.readLine()) != null){
            System.out.println(content);
        }

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("我天，你个服务端竟然这么强势");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        socket.shutdownOutput();

        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
