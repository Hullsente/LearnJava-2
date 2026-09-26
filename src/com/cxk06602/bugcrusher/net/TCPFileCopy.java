package com.cxk06602.bugcrusher.net;

import java.io.*;
import java.net.Socket;
import java.nio.Buffer;

public class TCPFileCopy {
    static void main() throws IOException{
        Socket socket = new Socket("127.0.0.1", 15565);
        OutputStream outputStream = socket.getOutputStream();

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("src\\com\\cxk06602\\bugcrusher\\net\\BigHead.png"));

        outputStream.write(StreamUtil.inputStreamToByteArray(bufferedInputStream));

        outputStream.flush();
        socket.shutdownOutput();
//        --------------
        InputStream inputStream = socket.getInputStream();
        System.out.println(StreamUtil.inputStreamToString(inputStream));

    }
}
