package com.cxk06602.bugcrusher.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q981 {
    static void main() {

    }
}

class TimeMap {

    HashMap<String, List<Object[]>> hashMap = new HashMap();

    public TimeMap() {
    }

    public void set(String key, String value, int timestamp) {
        hashMap.computeIfAbsent(key, _ -> new ArrayList<>()).add(new Object[]{timestamp, value});
    }

    public String get(String key, int timestamp) {
        if(!hashMap.containsKey(key))return "";
        int wantFindIndex = search(hashMap.get(key), timestamp);
        return wantFindIndex < 0 ? "" : (String) hashMap.get(key).get(wantFindIndex)[1];
    }
    private int search(List<Object[]> list, int wantFindTimestamp){
        int left = -1;
        int right = list.size();
        while(left + 1 < right){
            int mid = left + (right - left) / 2;
            if((Integer) list.get(mid)[0] <= wantFindTimestamp){
                left = mid;
            }else{
                right = mid;
            }
        }
        return left;
    }
}