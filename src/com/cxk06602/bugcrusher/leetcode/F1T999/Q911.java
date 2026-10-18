package com.cxk06602.bugcrusher.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q911 {
    static void main() {
//        TopVotedCandidate topVotedCandidate = new TopVotedCandidate(new int[]{0,1,2,2,1}, new int[]{20,28,29,54,56});
//        System.out.println(topVotedCandidate.q(57));//1
//        System.out.println(topVotedCandidate.q(56));
    }
}

//class TopVotedCandidate {
//
//    List<int[]> topPersons = new ArrayList<>();
//
//    public TopVotedCandidate(int[] persons, int[] times) {
//        int val = 0;
//        HashMap<Integer, Integer> personVotes = new HashMap<>();
//        for (int i = 0; i < persons.length; i++) {
//            int c = personVotes.merge(persons[i], 1, Integer::sum);
//            if(c >= val){
//                val = c;
//                topPersons.add(new int[]{times[i], persons[i]});
//            }
//        }
//    }
//
//    public int q(int t) {
//        int left = -1;
//        int right = topPersons.size();
//        while(left + 1 < right){
//            int mid = left + (right - left) / 2;
//            if(topPersons.get(mid)[0] > t){
//                right = mid;
//            }else{
//                left = mid;
//            }
//        }
//        return topPersons.get(left)[1];
//    }
//}