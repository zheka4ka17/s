package com.company;

public class rotations {
    public static void main(String[] args) {
        String word = "abc";
        String[] rots = {"abc","bca", "cab"};
        int length = word.length();
        for (int i=0;i<length; i++){
            boolean flag = false;
            for (int j=0; j< rots.length; j++)
                if (word.equals(rots[i]))
                    flag= true;

        }

    }
}
