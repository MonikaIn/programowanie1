package com.sda.javarzw7.programowanie1.day1;

import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args){
        int[] array = generateArray(1000000,1000);
        Arrays.stream(array).filter(number -> number <= 10).forEach(System.out::println);

        //policzyc wystapienia liczb 0 do 10 i je wyswietlic
        Map<Integer, Long> map = Arrays.stream(array)
                .filter(number -> number <= 10).boxed()//boxed opakowuje int na integer, zeby dalsze funkcje działały
                .collect(Collectors.groupingBy(number->number, Collectors.counting()));
        System.out.println(map);
        //bardzo wazne zapamietaj sobie !!
    }

    static public int[] generateArray(int size, int range){
        Random random =new Random();
        int[] array = new int[size];

        for (int i=0;i<size;i++){
           array[i]=random.nextInt(range);
        }
        return null;
    }
}
