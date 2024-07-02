package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTest {

    @Test
    public void mergeTest() {
        Solution solution = new Solution();
        Assert.assertArrayEquals(new int[][]{{1,6},{8,10},{15,18}},
                solution.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}}));
        Assert.assertArrayEquals(new int[][]{{1,5}},
                solution.merge(new int[][]{{1,4},{4,5}}));
    }

}