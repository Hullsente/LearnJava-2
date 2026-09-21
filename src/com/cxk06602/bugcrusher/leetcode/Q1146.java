package com.cxk06602.bugcrusher.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q1146 {
    static void main() {
        SnapshotArray snapshotArray = new SnapshotArray(1);
        snapshotArray.set(0 ,15);
        snapshotArray.snap();
        snapshotArray.snap();
        snapshotArray.snap();
        snapshotArray.get(0,2);
        snapshotArray.snap();
        snapshotArray.snap();
        snapshotArray.get(0,0);
    }
}

class SnapshotArray {
    private int[] arr;
    private HashMap<Integer, List<int[]>> hashMap = new HashMap<>();
    private int snap_id = 0;

    public SnapshotArray(int length) {
    }

    public void set(int index, int val) {
        hashMap.computeIfAbsent(index, _ -> new ArrayList<>()).add(new int[]{snap_id, val});
    }

    public int snap() {
        return snap_id++;
    }

    public int get(int index, int snap_id) {
        if(!hashMap.containsKey(index))return 0;
        List<int[]> list = hashMap.get(index);
        int relativeNewIndex = binarySearch(list, snap_id);
        return relativeNewIndex < 0 ? 0 : list.get(relativeNewIndex)[1];

    }
    private int binarySearch(List<int[]> list, int x){
        int left = -1;
        int right = list.size();
        while(left + 1 < right){
            int mid = left + (right - left) / 2;
            if(list.get(mid)[0] <= x){
                left = mid;
            }else{
                right = mid;
            }
        }
        return left;
    }
}