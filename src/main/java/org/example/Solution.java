package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList();
        Arrays.sort(intervals, (a, b) -> {
            return a[0] - b[0];
        });
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int[] here : intervals) {
            if (end >= here[0]) {
                end = Math.max(end, here[1]);
            } else {
                result.add(new int[]{start, end});
                start = here[0];
                end = here[1];
            }
        }
        result.add(new int[]{start, end});
        return result.toArray(new int[0][]);
    }
}
