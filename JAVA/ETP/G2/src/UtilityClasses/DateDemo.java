package UtilityClasses;

import java.util.Date;

public class DateDemo {
    public static void main(String[] arg){
        Date d1 =new Date(2021,8,16);
        System.out.println(d1.toString());
        Date d2 = new Date(1999,12,6);
        System.out.println("Is d1 after d2? " + d1.after(d2));
        System.out.println(d2.compareTo(d1));
        System.out.println(d1.getTime());
        System.out.println(d1.getYear());
    }
}
