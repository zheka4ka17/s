package com.company;

import java.util.Arrays;
import java.util.Objects;

public class methods {
    public static void main(String[] args) {

        Object[] arr = new Object[5];
        arr[0]=1;
        arr[1]="str";
        for(Object elem:arr)
            //System.out.println(elem);
            System.out.println(Arrays.toString(arr));
        System.out.println(isPrime(29));
        System.out.println(Arrays.toString(deleteStrings(arr)));
        String s ="Java: How to check if object is null";
        System.out.println(countVowels(s));

    }
    static boolean isPrime(int number){
        boolean result = true;
        for (int i= 2; i<=Math.sqrt(number); i++)
            if (number%i==0)
                result=false;
            return result;
    }
    static Object[] deleteStrings(Object[] arr){
        int count = 0;
        for (Object elem:arr)
            if (!Objects.isNull(elem) && !elem.getClass().equals(String.class))
                count++;
        Object[] result = new Object[count];
        int index = 0;
        for (Object elem:arr)
            if (!Objects.isNull(elem) && !elem.getClass().equals(String.class))
                result[index++] = elem;

        return result;
    }
    static   int countVowels(String s) {
        int result = 0;
        String str = s.toLowerCase();
        char[] vowels = {'a', 'i', 'o', 'u', 'y', 'e'};
        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < vowels.length; j++)
                if (str.charAt(i) == vowels[j])
                    flag = true;
            if (flag) result++;}
            return result;

        }

    }


