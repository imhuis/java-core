package com.imhuis.code.java.learning.feature.java8.time;

import cn.hutool.crypto.digest.MD5;

import java.nio.charset.Charset;

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
