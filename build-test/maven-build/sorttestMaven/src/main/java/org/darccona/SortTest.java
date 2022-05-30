package org.darccona;

import java.util.Random;

public class SortTest {

    private long[] a;
    private int index;

    public SortTest(int max) {
        a = new long[max];
        index = 0;
    }

    public void into(long value) {
        a[index] = value;
        index++;
    }

    public void printer() {
        for (int i = 0; i < index; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    private void toSwap(int first, int second) {
        long dummy = a[first];
        a[first] = a[second];
        a[second] = dummy;
    }

    public void bubbleSorter() {
        for (int out = index - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (a[in] > a[in + 1])
                    toSwap(in, in + 1);
            }
        }
    }

    public static void main(String[] args) {
        int max = 5;
        Random rnd = new Random(System.currentTimeMillis());
        SortTest array = new SortTest(max);

        for (int i = 0; i < max; i++) {
            array.into(rnd.nextInt(1000));
        }

        array.printer();
        array.bubbleSorter();
        array.printer();
    }
}