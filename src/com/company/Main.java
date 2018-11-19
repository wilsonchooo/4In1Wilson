package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        InPlaceSorts z = new InPlaceSorts();

        //String[] Stringarr  = z.randomStringArr(100);
        //Double [] doublearr = z.randomDoubleArr(100);

        int[] intarr = z.randomIntArr(10000);
        double[] Doublearr = z.IntToDouble(intarr);
        String[]  Stringarr = z.IntToString(intarr);
      //  System.out.println(Arrays.toString(intarr));
      //  System.out.println(Arrays.toString(Doublearr));
      //  System.out.println(Arrays.toString(Stringarr));


        long time = System.nanoTime();
        z.insertionSort(intarr);
        time = System.nanoTime() - time;
        System.out.println("Time Taken - Insertion Sort: "+ time);

        long time2 = System.nanoTime();
        z.selectionsort(Doublearr);
        time2 = System.nanoTime() - time2;
        System.out.println("Time Taken - Selection Sort: "+ time2);


        long time3 = System.nanoTime();
        z.bubbleSort(Stringarr);
        time3 = System.nanoTime() - time3;
        System.out.println("Time Taken - Bubble Sort: "+ time3);


       // System.out.println(Arrays.toString(intarr));
       // System.out.println(Arrays.toString(Doublearr));
       // System.out.println(Arrays.toString(Stringarr));




    }
}
