package com.leetcode.concurrency;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * 1116. Print Zero Even Odd
 *
 * https://leetcode.com/problems/print-zero-even-odd/
 */
public class PrintZeroEvenOdd {
    class ZeroEvenOdd {
        private int n;
        private Semaphore zeroSemaphore;
        private Semaphore evenSemaphore;
        private Semaphore oddSemaphore;

        public ZeroEvenOdd(int n) {
            this.n = n;
            zeroSemaphore = new Semaphore(1);
            evenSemaphore = new Semaphore(0);
            oddSemaphore = new Semaphore(0);
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void zero(IntConsumer printNumber) throws InterruptedException {
            boolean printOdd = true;
            for(int i = 0; i < n; i++) {
                zeroSemaphore.acquire();
                printNumber.accept(0);
                if(printOdd) {
                    oddSemaphore.release();
                } else {
                    evenSemaphore.release();
                }
                printOdd = !printOdd;
            }
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            int nextNumber = 2;
            for(int i = 0; i < n / 2; i++) {
                evenSemaphore.acquire();
                printNumber.accept(nextNumber);
                nextNumber += 2;
                zeroSemaphore.release();
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            int nextNumber = 1;
            for(int i = 0; i < (int)Math.ceil((double)this.n / 2); i++) {
                oddSemaphore.acquire();
                printNumber.accept(nextNumber);
                nextNumber += 2;
                zeroSemaphore.release();
            }
        }
    }
}
