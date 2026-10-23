package com.cxk06602.bugcrusher.regexp;

import java.util.regex.Pattern;

public class RegExp1 {
    static void main() {
        String content = "HHHHHHeeeellllloooo,,,,,,,,world!     你你你你好好好好好，，，，，，，世世世世界界界界！！！";
        content = Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");
        System.out.println(content);
    }
}
