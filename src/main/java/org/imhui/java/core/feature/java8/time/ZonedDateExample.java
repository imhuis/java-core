package org.imhui.java.core.feature.java8.time;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author: imhuis
 * @date: 2022/3/24
 * @description:
 */
@Slf4j
public class ZonedDateExample {

    @Test
    public void test1() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        log.info("zonedDateTime {}", zonedDateTime);

        ZoneId zoneId = ZoneId.of(ZoneId.SHORT_IDS.get("PST"));
        ZonedDateTime los_Angeles = zonedDateTime.withZoneSameInstant(zoneId);
        log.info("America/Los_Angeles\"现在的洛杉矶时间\" \n {}", los_Angeles);

        // ZonedDateTime 转 LocalDateTime
        LocalDateTime localDateTime = los_Angeles.toLocalDateTime();
        log.info("America/Los_Angeles {}", localDateTime);

        // LocalDateTime 转 ZonedDateTime
        ZoneId systemDefaultZone = ZoneId.systemDefault();
        log.info("系统默认时区 [{}]", systemDefaultZone);
        ZonedDateTime localZoned = localDateTime.atZone(systemDefaultZone);
        System.out.println("本地时区时间: " + localZoned);

    }
}
