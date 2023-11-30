package org.imhui.java.core.collections.map;

import lombok.extern.slf4j.Slf4j;
import org.imhui.java.core.collections.datasource.HTMLColors;

import java.util.NavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * @author: imhuis
 * @date: 2023/11/24
 * @description:
 */
@Slf4j
public class NavMap {
    /*
    @link NavigableMap
     */
    public static void main(String[] args) {
        NavigableMap<Integer,String> Map  = new ConcurrentSkipListMap<>(HTMLColors.MAP);
        // "0x%06X: %s%n"
        log.info("firstEntry:{}",Map.firstEntry());
        log.info("lastEntry:{}",Map.lastEntry());

    }
}
