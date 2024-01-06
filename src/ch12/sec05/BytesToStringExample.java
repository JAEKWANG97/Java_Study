package ch12.sec05;

import java.util.Arrays;

public class BytesToStringExample {
    public static void main(String[] args) {
        String data = "자바";

        //String -> byte 배열 (기본 : UTF-8 인코딩)
        byte[] arr1 = data.getBytes(); //byte[] arr1 = data.getBytes("UTF-8");
        System.out.println("arr1 : " + Arrays.toString(arr1));

        //byte 배열 -> String(기본 : UTF-8 디코딩)
        String str1 = new String(arr1); // String str1 =new String(arr1 , "UTF-8");
        System.out.println("str1 = " + str1);

        //String -> byte 배열(EUC-KR 인코딩)
    }

}
