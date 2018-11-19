package com.company;

public class InPlaceSorts {


    public InPlaceSorts ()
    {
    }

    public  void insertionSort(int[] list1)
    {
        for (int i=1;i<list1.length;i++)
        {
            int current = list1[i];
            int x = i-1;

            while (x>=0 && list1[x]>current) // moves all of the numbers before the key right to make space.
            {
                list1[x+1] = list1[x];
                x=x-1;
            }
            list1[x+1] = current;
        }
    }

    public  void selectionsort (double list2[])
    {

        for (int i = 0; i < list2.length-1; i++)
        {
            int min = i;

            for (int x = i+1; x < list2.length; x++)
                if (list2[x] < list2[min])
                    min = x;

            swapDouble(list2,min,i);
        }


    }


    public  void bubbleSort(String[] list3) {
        for (int i = 0; i < list3.length; i++) {
            for (int j = i + 1; j < list3.length; j++) {
                if (Integer.parseInt(list3[i]) > Integer.parseInt(list3[j])) {
                    swapString(list3,i,j);
                }
            }
        }
    }
    public int[] randomIntArr(int count)
    {
        int[] arr =new int[count];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(Math.random()*10000);
        }
        return arr;
    }

    public Double[] randomDoubleArr(int count)
    {
        Double[] arr =new Double[count];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=(Math.random()*10000);
        }
        return arr;
    }

    public String[] randomStringArr(int count)
    {
        int[] arr =new int[count];
        String[] Stringarr = new String[count];

        for (int i=0;i<arr.length;i++)
        {
            arr[i]=((int)(Math.random()*10000));
        }

        for (int x=0;x<arr.length;x++)
        {
            Stringarr[x] = Integer.toString(arr[x]);
        }
        return Stringarr;

    }

    public double [] IntToDouble (int [] arr)
    {
        double[] doublearr = new double[arr.length];
        for (int x=0;x<arr.length;x++)
        {
            double temp = (arr[x]);
            doublearr[x] = temp;
        }
        return doublearr;
    }

    public String [] IntToString (int [] arr)
    {
        String[] stringarr = new String[arr.length];
        for (int x=0;x<arr.length;x++)
        {
            stringarr[x] = Integer.toString(arr[x]);
        }
        return stringarr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapString(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapDouble(double[] arr, int i, int j) {
        Double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
