package org.imhui.java.core.simple;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * @author: imhuis
 * @date: 2022/2/3
 * @description:
 */
public class TalkingClock {

    private int interval;
    private boolean beep;

    public TalkingClock() {
    }

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
        var timePrinter = new TimePrinter();
    }

    class TimePrinter implements ActionListener {

        private final static String a = "";

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Time is " + Instant.now().toString());
            if (TalkingClock.this.beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
