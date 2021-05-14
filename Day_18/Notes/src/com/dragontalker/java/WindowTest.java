package com.dragontalker.java;

/*
例子: 创建三个窗口卖票, 总票数为100张
 */

class Window extends Thread {
    private int ticket = 100;

    @Override
    public void run() {

        while(true) {
            if (ticket > 0) {
                System.out.println(getName() + ": 卖票, 票号为: " + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}

public class WindowTest {
}
