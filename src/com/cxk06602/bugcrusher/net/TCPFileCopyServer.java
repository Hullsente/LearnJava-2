package com.cxk06602.bugcrusher.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPFileCopyServer {
    static void main() throws IOException{
        ServerSocket serverSocket = new ServerSocket(15565);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();


        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src\\com\\cxk06602\\bugcrusher\\net\\BigHeadServer.png"));
        bufferedOutputStream.write(StreamUtil.inputStreamToByteArray(inputStream));
//        int length = 0;
//        byte[] buffer = new byte[1024];
//        while((length = bufferedInputStream.read(buffer)) != -1){
//            bufferedOutputStream.
//        }
        bufferedOutputStream.flush();
        accept.shutdownInput();
        //---

        OutputStream outputStream = accept.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("收到图片");
        bufferedWriter.close();
    }
}
