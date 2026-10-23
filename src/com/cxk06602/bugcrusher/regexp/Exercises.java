package com.cxk06602.bugcrusher.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercises {
    static void main() {
        //String content = "你好，世界！";
        String content = "https://www.bilibili.com/video/BV1fh411y7R8/?spm_id_from=333.788.player.switch&vd_source=17b772cf9f38d793d20a0bc3b3eb0f64&p=894";
        //String regexp = "^[1-9]\\d{5}$";
        //String regexp = "^[Α-￥]+$";
        //String regexp = "^[1-9]//d{4,9}$";
        //String regexp = "^1[3|458]\\d{9}$";
        String regexp = "^((https|http)://)?([\\w-]+\\.)+[\\w-]+(((/[\\w-?=.&#]+/?)*)|/)$";
        Pattern compile = Pattern.compile(regexp);
        Matcher matcher = compile.matcher(content);
        String regexp2 = "\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";
        if(matcher.find()){
            System.out.println("找到匹配");
            System.out.println(matcher.group(0));
        }else{
            System.out.println("未找到匹配");
        }

    }
}
