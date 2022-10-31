package com.company;

import java.util.Arrays;
import java.util.Random;

public class SortJaggedArray{

    static  int rows;
    static int[][] arr;

    public static void main(String[] args) {
        Random random = new Random();
        rows = random.nextInt(3) + 7;

        arr = new int[rows][];
        for (int i = rows; i > 0; i--)
            arr[rows - i] = new int[random.nextInt(10) + 1];
// заполнеение случайными числами
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = random.nextInt(20);

//сортировка в строках
        for (int i = 0; i < rows; i++)
            Arrays.sort(arr[i]);


        for(int i = 0; i < rows; i++)
            for (int j=0; j<rows; j++)
                if(arr[i].length>arr[j].length)
                    swap(i,j);


        for (int i = 0; i < rows; i++)
            System.out.println(Arrays.toString(arr[i]));



    }
        static  void swap(int a ,int b){
        int[] temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }





    }

