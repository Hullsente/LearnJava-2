package com.cxk06602.bugcrusher.net;

import java.io.*;

public class StreamUtil {
    public static byte[] inputStreamToByteArray(InputStream is) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        while(is.read(buffer) != -1){
            byteArrayOutputStream.write(buffer);
        }
        byte[] content = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return content;
    }
    public static String inputStreamToString(InputStream is) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
        StringBuilder stringBuilder = new StringBuilder();
        String line = "";
        while ((line = bufferedReader.readLine()) != null){
            stringBuilder.append(line);
        }
        bufferedReader.close();
        return stringBuilder.toString();
    }
}
