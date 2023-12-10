package com.imhuis.code.java.learning.io.os;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author: imhuis
 * @date: 2023/8/12
 * @description:
 */
@Slf4j
public class OsTest {

    @Test
    public void test1() {
        log.info(System.getProperty("os.name"));
    }
}
