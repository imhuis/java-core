package org.imhui.java.core.jdk8;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

/**
 * @author: imhuis
 * @date: 2022/3/12
 * @description:
 */
@Slf4j
public class Base64Test {

    @Test
    public void basic() throws UnsupportedEncodingException {
        String asB64 = Base64.getEncoder().encodeToString("some string".getBytes("utf-8"));
        log.info("asB64 {}", asB64);
        Assert.assertEquals("c29tZSBzdHJpbmc=", asB64);
        byte[] asBytes = Base64.getDecoder().decode(asB64);
        System.out.println(new String(asBytes, "utf-8"));
    }

    @Test
    public void urlEncoded() throws UnsupportedEncodingException {
        String urlEncoded = Base64.getUrlEncoder().encodeToString("".getBytes("utf-8"));
        log.info("sing URL Alphabet: {}" + urlEncoded);
    }

    @Test
    public void mimeEncoded() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < 10; ++t) {
            sb.append(UUID.randomUUID());
        }
        byte[] toEncode = sb.toString().getBytes("utf-8");
        String mimeEncoded = Base64.getMimeEncoder().encodeToString(toEncode);
        log.info(mimeEncoded);
    }

}
