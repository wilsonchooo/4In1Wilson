package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        InPlaceSorts z = new InPlaceSorts();


        int[] intarr = z.randomIntArr(10);
        double[] Doublearr = z.IntToDouble(intarr);
        String[]  Stringarr = z.IntToString(intarr);

        String [] StringarrLetters = z.randomStringArr(10,10);


        System.out.print("int - Insertion");
        System.out.println(Arrays.toString(intarr));
        System.out.print("Double - Selection");

        System.out.println(Arrays.toString(Doublearr));
        System.out.print("String(#) - Bubble");

        System.out.println(Arrays.toString(Stringarr));
        System.out.print("String(Letters) - Bubble");

        System.out.println(Arrays.toString(StringarrLetters));

        System.out.println();

        long time = System.nanoTime();
        z.insertionSort(intarr);
        time = System.nanoTime() - time;
        System.out.println("Time Taken - Insertion Sort: "+ time);

        long time2 = System.nanoTime();
        z.selectionSort(Doublearr);
        time2 = System.nanoTime() - time2;
        System.out.println("Time Taken - Selection Sort: "+ time2);


        long time3 = System.nanoTime();
        z.bubbleSortNumbers(Stringarr);
        time3 = System.nanoTime() - time3;
        System.out.println("Time Taken - Bubble Sort: "+ time3);


        long time4 = System.nanoTime();
        z.bubbleSort(StringarrLetters);
        time4 = System.nanoTime() - time4;
        System.out.println("Time Taken - Bubble Sort with letters: "+ time4);

        System.out.println();


        System.out.println(Arrays.toString(intarr));
        System.out.println(Arrays.toString(Doublearr));
        System.out.println(Arrays.toString(Stringarr));
        System.out.println(Arrays.toString(StringarrLetters));




    }
}
