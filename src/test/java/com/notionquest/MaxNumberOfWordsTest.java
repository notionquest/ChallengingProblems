package com.notionquest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.*;


public class MaxNumberOfWordsTest {

    private MaxNumberOfWords amazonQuestion;

    @Before
    public void init() {
        amazonQuestion = new MaxNumberOfWords();
    }


    @Test
    public void shouldGetMaxCount() {

        String str = "Jack and Jill cheese. Cheese Jack's and Jill's";
        List<String> excl = Arrays.asList("and", "he", "the", "jack", "jill");
        List<String> out= amazonQuestion.retrieveMostFrequentlyUsedWords(str, excl);
        //Assert.assertEquals(Arrays.asList("cheese", "s"), out);

        assertThat(out).containsExactlyInAnyOrderElementsOf(Arrays.asList("cheese", "s"));
    }

    @Test
    public void shouldGetMaxCount1() {

        String str = "Rose is a flower and red rose are flower";
        List<String> excl = Arrays.asList("is", "are", "a");
        List<String> out= amazonQuestion.retrieveMostFrequentlyUsedWords(str, excl);
        //Assert.assertEquals(Arrays.asList("flower", "rose"), out);

        assertThat(out).containsExactlyInAnyOrderElementsOf(Arrays.asList("flower", "rose"));
    }

    @Test
    public void shouldGetMaxCount2() {

        String str = "jack and jill went to the market to buy bread and cheese. Cheese is Jack's and Jill's favorite food";
        List<String> excl = Arrays.asList("and", "he", "the", "to", "is");
        List<String> out= amazonQuestion.retrieveMostFrequentlyUsedWords(str, excl);

        assertThat(out).containsExactlyInAnyOrderElementsOf(Arrays.asList("cheese", "jack", "jill", "s"));
    }


    @Test
    public void shouldGetMaxCount3() {

        String str = "";
        List<String> excl = Arrays.asList("and");
        List<String> out= amazonQuestion.retrieveMostFrequentlyUsedWords(str, excl);
        Assert.assertEquals(Arrays.asList(), out);

    }

    @Test
    public void shouldGetMaxCount4() {

        String str = "and and and and";
        List<String> excl = Arrays.asList("and");
        List<String> out= amazonQuestion.retrieveMostFrequentlyUsedWords(str, excl);

        Assert.assertEquals(Arrays.asList(), out);
    }

    @Test
    public void shouldGetMaxCount5() {

        String str = "and";
        List<String> excl = null;
        List<String> out= amazonQuestion.retrieveMostFrequentlyUsedWords(str, excl);
        Assert.assertEquals(Arrays.asList("and"), out);

    }

    @Test
    public void shouldGetMaxCountWhenBothParametersAreNull() {


        List<String> out= amazonQuestion.retrieveMostFrequentlyUsedWords(null, null);
        Assert.assertEquals(Arrays.asList(), out);

    }
}