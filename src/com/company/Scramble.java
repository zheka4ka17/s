package com.company;

public class Scramble {
    public static void main(String[] args) {
        String first ="rkqodlw";
        String second = "world";
        StringBuilder sb = new StringBuilder(first);
        boolean flag=true;
        for (int i=0; i<second.length();i++){
            int index = sb.toString().indexOf(second.charAt(i));
            if (index==-1) flag=false;
            else sb.setCharAt(index, ((Character)second.charAt(i)).toString().toUpperCase().charAt(0));}
            // else sb.delete(index,index+1);}
            System.out.println(flag);
        System.out.println(sb);


        }
    }

