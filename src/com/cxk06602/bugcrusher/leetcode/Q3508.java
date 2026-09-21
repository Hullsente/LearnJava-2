package com.cxk06602.bugcrusher.leetcode;

import java.util.*;

public class Q3508 {
    static void main() {

    }
}


//class Router {
//
//    //<>destination<timestamp, source>>
//    LinkedHashMap<Integer, List<int[]>> linkedHashMap = new LinkedHashMap<>();
//    int memoryLimit;
//
//    public Router(int memoryLimit) {
//        this.memoryLimit = memoryLimit;
//    }
//
//    public boolean addPacket(int source, int destination, int timestamp) {
//        if(linkedHashMap.containsKey(destination)){
//            List<int[]> list = linkedHashMap.get(destination);
//
//        }
//        linkedHashMap.computeIfAbsent(destination, _ -> new ArrayList<>()).add(new int[]{timestamp, source});
//        if(linkedHashMap.size() > memoryLimit)linkedHashMap.remove(linkedHashMap.firstEntry().getKey());
//        return true;
//    }
//
//    public int[] forwardPacket() {
//
//    }
//
//    public int getCount(int destination, int startTime, int endTime) {
//
//    }
//    private int binarySearch(List[] list, int wantTimestamp, int left, int right){
//        left--;
//        right--;
//        while(left + 1 < right){
//            int mid = left + (right - left) / 2;
//            if(datapacks[mid].timestamp <= wantTimestamp){
//                left = mid;
//            }else{
//                right = mid;
//            }
//        }
//        return left;
//    }
//}
//
//class Datapack{
//    int source;
//    int destination;
//    int timestamp;
//}