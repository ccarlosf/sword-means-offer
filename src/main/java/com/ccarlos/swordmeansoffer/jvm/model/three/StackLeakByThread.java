package com.ccarlos.swordmeansoffer.jvm.model.three;

public class StackLeakByThread {
    public static void main(String[] args) {
        while (true) {
            new Thread() {
                public void run() {
                    while (true) {

                    }
                }
            }.start();
        }
    }
}
