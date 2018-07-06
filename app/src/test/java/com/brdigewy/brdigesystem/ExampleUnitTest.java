package com.brdigewy.brdigesystem;

import com.alibaba.fastjson.JSONReader;
import com.brdigewy.brdigesystem.JsonMod.UPComMod;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
        float a[] = new float[]{2.3f, 3.5f, 4.5f, 5.6f, 23.3f,25.6f};
        float b = 0.0f;
        for (int i = 0; i < a.length; i++) {
//            b +=new BigDecimal(Float.toString(a[i])).pow(2).floatValue();
            b +=Math.pow(a[i],2);
        }
//        b=b/a.length;
        System.out.println("b:"+b);
    }

}