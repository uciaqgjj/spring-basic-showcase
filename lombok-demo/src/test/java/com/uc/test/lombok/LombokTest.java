package com.uc.test.lombok;

import com.uc.lombok.example.NonNullExample;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * User: uc
 * Date: 2018-04-13
 * Time: 18:11
 * Desc:
 */
@Slf4j
public class LombokTest {

    @Test(expected = NullPointerException.class)
    public void test_NonNull() {
        NonNullExample obj = new NonNullExample( null );
    }

    @Test
    public void test_log() {
        log.info("Hello, UC");
    }
}
