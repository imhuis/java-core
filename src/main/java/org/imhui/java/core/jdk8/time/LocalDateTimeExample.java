package org.imhui.java.core.jdk8.time;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * @author: imhuis
 * @date: 2022/3/24
 * @description:
 */
@Slf4j
public class LocalDateTimeExample {

    @Test
    public void test1 () {
        LocalDate lastMondayOf2021 = LocalDate
                .parse("2021-12-31").with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        log.info("lastMondayOf2021 {}", lastMondayOf2021);

    }
}
