package com.cxk06602.bugcrusher.net;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client01 {
    static void main() throws IOException {
        //需要内网穿透
        //Socket socket = new Socket("cn-hk-bgp-4.ofalias.net", 15560);
        //本地
        Socket socket = new Socket("127.0.0.1", 15565);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello, world!".getBytes());
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        byte[] content = new byte[1024];
        int length = 0;
        while((length = inputStream.read(content)) != -1){
            System.out.println(new String(content, 0, length));
        }

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
