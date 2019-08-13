package com.leetcode.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 1114. Print in Order
 *
 * https://leetcode.com/problems/print-in-order/
 */
public class PrintInOrder {
    class Foo {
        private AtomicInteger count = null;

        public Foo() {
            count = new AtomicInteger(1);
        }

        public void first(Runnable printFirst) throws InterruptedException {
            while(count.get() != 1) {

            }

            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            count.incrementAndGet();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while(count.get() != 2) {

            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            count.incrementAndGet();
        }

        public void third(Runnable printThird) throws InterruptedException {
            while(count.get() != 3) {

            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
            count.incrementAndGet();
        }
    }
}
