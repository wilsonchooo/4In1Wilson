package com.company;

public class InPlaceSorts {


    public InPlaceSorts ()
    {
    }

    public  void insertionSort(int[] list1)
    {
        for (int i=1;i<list1.length;i++)
        {
            int key = list1[i];
            int x = i-1;

            while (x>=0 && list1[x]>key) // moves all of the numbers before the key right to make space.
            {
                list1[x+1] = list1[x];
                x=x-1;
            }
            list1[x+1] = key;
        }
    }

    public  void selection (int list2[])
    {

        for (int i = 0; i < list2.length-1; i++)
        {
            int min = i;

            for (int x = i+1; x < list2.length; x++)
                if (list2[x] < list2[min])
                    min = x;

            swap (list2,min,i);
        }


    }


    public  void bubbleSort(String[] list3) {
        for (int i = 0; i < list3.length; i++) {
            for (int j = i + 1; j < list3.length; j++) {
                if (list3[i].equals(list3[j])) {
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


}
