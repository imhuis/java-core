package org.imhui.java.core.feature.java8.time;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author: imhuis
 * @date: 2022/3/24
 * @description:
 */
@Slf4j
public class DateExample {

    @Test
    public void test1() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        String format = dateFormat.format(now);
        log.info(format);
    }
}
