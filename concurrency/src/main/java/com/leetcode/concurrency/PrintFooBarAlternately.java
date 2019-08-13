package com.leetcode.concurrency;

import java.util.concurrent.Semaphore;

/**
 * 1115. Print FooBar Alternately
 *
 * https://leetcode.com/problems/print-foobar-alternately/
 */
public class PrintFooBarAlternately {
    class FooBar {
        private int n;
        private Semaphore fooSemaphore;
        private Semaphore barSemaphore;

        public FooBar(int n) {
            this.n = n;
            fooSemaphore = new Semaphore(1);
            barSemaphore = new Semaphore(0);
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                fooSemaphore.acquire();
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                barSemaphore.release();
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                barSemaphore.acquire();
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                fooSemaphore.release();
            }
        }
    }
}
