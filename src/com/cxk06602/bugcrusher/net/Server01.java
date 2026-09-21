package com.cxk06602.bugcrusher.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

public class Server01 {
    static void main() throws IOException {
        ServerSocket serverSocket = new ServerSocket(15565);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] content = new byte[1024];
        int length = 0;
        while((length = inputStream.read(content)) != -1){
            System.out.println(new String(content, 0, length));
        }
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("Hello, Client".getBytes());
        accept.shutdownOutput();

        outputStream.close();
        accept.close();
        serverSocket.close();

    }
}
