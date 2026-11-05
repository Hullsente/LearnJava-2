package com.cxk06602.bugcrusher.zeroone.chapter5;

public class chapter5 {
    static void main() {
        int count = 0;
        String content = "ababababababa";
        for(int i = 0; i < content.length(); i++){
            if((i = content.indexOf("aba", i , content.length())) == -1){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
