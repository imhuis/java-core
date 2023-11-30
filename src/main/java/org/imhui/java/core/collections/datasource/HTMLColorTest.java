package org.imhui.java.core.collections.datasource;

import static org.imhui.java.core.collections.datasource.HTMLColors.*;

/**
 * @author: imhuis
 * @date: 2023/11/23
 * @description:
 */
public class HTMLColorTest {
    static final int DISPLAY_SIZE = 2;

    public static void main(String[] args) {
        show(MAP, DISPLAY_SIZE);
        border();
        showInv(INVMAP, DISPLAY_SIZE);
        border();
        show(LIST, DISPLAY_SIZE);
        border();
        showrgb(RGBLIST, DISPLAY_SIZE);
    }

}
