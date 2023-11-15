package org.imhui.java.core.jdk8.time;

import cn.hutool.core.date.LocalDateTimeUtil;
import cn.hutool.crypto.digest.MD5;

import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author: imhuis
 * @date: 2022/6/30
 * @description:
 */
public class DateTest {
    public static void main(String[] args) {
        MD5.create().digest("", Charset.defaultCharset());
    }
}
