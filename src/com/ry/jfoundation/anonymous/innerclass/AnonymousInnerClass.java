package com.ry.jfoundation.anonymous.innerclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.time.Instant;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        var clock = new TalkingClock();
        clock.start(1000, true);

        //keep program running until the user selects "OK"
        JOptionPane.showMessageDialog(null,"Quit?");
        System.exit(0);
    }
}
class TalkingClock {

    public void start(int interval, boolean beep) {
        var listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("At the tone, the time is "
                        + Instant.ofEpochMilli(event.getWhen()));
                if (beep) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        };
        var timer = new Timer(interval, listener);
        timer.start();
    }
}
