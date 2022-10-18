package thangnam;

import java.lang.reflect.Array;
import java.util.*;

class filter{
    public filter(int month , int year){
        int[] list_month_31 = {1,3,5,7,8,10,12};
        ArrayList <Integer> list = new ArrayList<>();
        for (int i:list_month_31){
            list.add(i);
        }
        if (list.contains(month)){
            System.out.println("thang nay co 31 ngay!");
        }else if (month ==2){
            check chec = new check(year);
        }else{
            System.out.println("thang nay co 30 ngay!");
        }
    }

class check{
    public check (int year){
        if ((year%100 == 0) && (year%400 == 0)){
            System.out.println("thang nay co 29 ngay!"); 
        }else if ((year%100 != 0) && (year%4 == 0)){
            System.out.println("thang nay co 29 ngay!");
        }else{
            System.out.println("thang nay co 28 ngay!");
        }
    }
}

class thangnam{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap thang: ");
        int month = input.nextInt();
        System.out.println("nhap nam: ");
        int years = input.nextInt();
        filter fil = new filter(month, years);
    }
    }
}