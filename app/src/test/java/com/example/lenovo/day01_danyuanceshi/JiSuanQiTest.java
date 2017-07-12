package com.example.lenovo.day01_danyuanceshi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 2017/7/10.
 */
public class JiSuanQiTest {

    private JiSuanQi jiSuanQi;

    @Before
    public void setUp() throws Exception {
        jiSuanQi = new JiSuanQi();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void jia() throws Exception {
            assertEquals(20,jiSuanQi.jia(2,18));
    }

    @Test
    public void jian() throws Exception {
        assertEquals(8,jiSuanQi.jian(23,15));
    }

    @Test
    public void cheng() throws Exception {
        assertEquals(4,jiSuanQi.cheng(2,2));
    }

    @Test
    public void chu() throws Exception {
        assertEquals(3,jiSuanQi.chu(15,5));
    }

}