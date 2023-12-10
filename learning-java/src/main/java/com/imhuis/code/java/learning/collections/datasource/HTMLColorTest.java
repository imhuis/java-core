package com.imhuis.code.java.learning.collections.datasource;

/**
 * @author: imhuis
 * @date: 2023/11/23
 * @description:
 */
public class HTMLColorTest {
    static final int DISPLAY_SIZE = 2;

    public static void main(String[] args) {
        HTMLColors.show(HTMLColors.MAP, DISPLAY_SIZE);
        HTMLColors.border();
        HTMLColors.showInv(HTMLColors.INVMAP, DISPLAY_SIZE);
        HTMLColors.border();
        HTMLColors.show(HTMLColors.LIST, DISPLAY_SIZE);
        HTMLColors.border();
        HTMLColors.showrgb(HTMLColors.RGBLIST, DISPLAY_SIZE);
    }

}
