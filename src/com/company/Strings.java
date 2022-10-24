package com.company;

public class Strings {
    public static void main(String[] args) {
        String s1 = "first", s2="first";
        StringBuilder sb = new StringBuilder("first");
        String s3= sb.toString();
        System.out.println(s1.compareTo(s2));
        //собрать строку из символов
        System.out.println(s1.equals(s3));
        System.out.println(s1.contains("firsh"));
        String right = s1.substring(2,4);
        System.out.println(right);
        char c1 = '2', c2 = '\u00B7', c3 = '\u03C0', c4 = '=', c5 = '1',
                c6 = '8', c7 = '0', c8 = '\u00B0';
        String s4 = ""+c1+c2+c3+c4+c5+c6+c7+c8;
        System.out.println(s4);
        String s5 = s1.concat(s4);
        System.out.println(s5);
        //содержит ли строка только цифры
        System.out.println(isOnlyDigit("123a"));
        //хеш код строки
        System.out.println(s1.hashCode());
        //заменить символ в строке
        String s6 ="machine.";
        String s7= s6.replace('.','!');
        System.out.println(s7);
        //удалить символы
        String s8="{w}{{sdf}}";
        String s9 =s8.replaceAll("[{}]", "");
        System.out.println(s9);
        //удалить концевые пробелы
        s8= "     word   ";
        s8=s8.trim();
        System.out.println(s8);
    }
    static boolean isOnlyDigit(String s){
        for(int i=0; i<s.length(); i++)
            if (!Character.isDigit(s.charAt(i)))
                return false;
            return true;
    }
}
