package com.company;

import com.Day;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner day =new Scanner(System.in);
        System.out.println("Кунду киргизиниз");
       String i = day.nextLine();

        switch (i) {
            case "MONDAY":
                System.out. println(Day.MONDAY + " - Бугун Жава сабактан лекция болот");
                break;
            case "TUESDAY":
                System.out.println(Day.THURSDAY + " - Бугун техникалык англис тили болот");
                break;
            case "WEDNESDAY":
                System.out.println(Day.WEDNESDAY + " - Бугун Жава сабактан лекция болот");
                break;
            case   "THURSDAY":
                System.out.println(Day.THURSDAY + " - Бугун Жавадан  практикалык сабак болот");
                break;
            case "FRIDAY":
                System.out.println(Day.FRIDAY + " - Бугун Жава сабактан лекция болот");
                break;
            case "SATURDAY":
                System.out.println(Day.SATURDAY + " - Бугун soft skils сабак болот");
                break;
            case "SUNDAY":
                System.out.println(Day.SUNDAY + " - Бугун кампус ачык болот, кааласаныз келип оз алдынча окусаныз болот");
                break;
            default:
                System.out.println("Сиз туура эмес маани бердиниз");


        }


    }}

