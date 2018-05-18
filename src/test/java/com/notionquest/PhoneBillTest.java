package com.notionquest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PhoneBillTest {

    private PhoneBill phoneBill;

    @Before
    public void init() {
        phoneBill = new PhoneBill();
    }

    @Test
    public void shouldReturnPhoneBill() {

        String input = "00:01:07,400-234-090\n" +
                        "00:05:01,701-080-080\n" +
                        "00:05:00,400-234-090";

        Assert.assertEquals(900,phoneBill.solution(input));

    }

    @Test
    public void shouldReturnPhoneBill2() {

        String input = "00:01:07,400-234-090";

        Assert.assertEquals(201,phoneBill.solution(input));

    }

    @Test
    public void shouldReturnPhoneBill3() {

        String input = "00:01:07,400-234-090\n" +
                "00:05:01,701-080-080\n" +
                "00:05:00,400-234-091";

        Assert.assertEquals(1101,phoneBill.solution(input));

    }

}
