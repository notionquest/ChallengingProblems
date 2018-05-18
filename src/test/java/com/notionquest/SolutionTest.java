package com.notionquest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import static org.junit.Assert.assertEquals

public class SolutionTest {

    private Solution solution;

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void shouldReturnResult() {
        //solution
        Assert.assertEquals("l", solution.solution("hello"));
    }

    @Test
    public void shouldReturnResult2() {
        //solution
        Assert.assertEquals("a", solution.solution("baa"));
    }

    @Test
    public void shouldReturnResult3() {
        //solution
        Assert.assertEquals("z", solution.solution("zza"));
    }

    @Test
    public void shouldReturnResult4() {
        //solution
        Assert.assertEquals("a", solution.solution("aaaaaaaa"));
    }


    @Test
    public void shouldReturnResult5() {
        //solution
        Assert.assertEquals("a", solution.solution("abcd"));
    }

    @Test
    public void shouldReturnResult6() {
        //solution
        Assert.assertEquals("b", solution.solution("bbzzcc"));
    }

    @Test
    public void shouldReturnResult7() {
        //solution
        Assert.assertEquals("z", solution.solution("zzz"));
    }

    @Test
    public void shouldReturnResult8() {
        //solution
        Assert.assertEquals("b", solution.solution("bbbzzz"));
    }
}
